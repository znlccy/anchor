package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-11:38
 * @Version: v1.0.0
 * @Comment: 文件上传服务实现类
 */

@Service
public class UploadServiceImpl implements UploadService {

    /**
     * 实现单文件上传
     * @param: [file]
     * @return: java.lang.String
     */
    @Override
    public String upload(MultipartFile file) {
        if (file.isEmpty()) {
            return "文件为空";
        }
        if (file.getSize() > 125829120) {
            return "上传文件超过限制大小";
        } else {
            //获取文件名
            String fileName = file.getOriginalFilename();
            //获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            //文件上传的路径
            try {
                File path = new File(ResourceUtils.getURL("classpath:").getPath());
                if(!path.exists()) path = new File("");
                String filePath = path.getAbsolutePath();
                String tmp = filePath.substring(0,filePath.lastIndexOf("\\"));
                tmp = tmp.substring(0,tmp.lastIndexOf("\\"));
                String realPath = tmp.concat("\\src\\main\\java\\com\\youda\\anchor\\upload");
                /*System.out.println("真实路径"+realPath);*/
                // 解决中文问题，liunx下中文路径，图片显示问题
                // fileName = UUID.randomUUID() + suffixName;
                /*File upload = new File(path.getAbsolutePath(),"static/images/upload/");*/
                /*File dest = new File(filePath + fileName);*/
                File dest = new File(realPath + "\\" + fileName);
                //检测是否存在目录
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                try {
                    System.out.println("文件大小:"+file.getSize());
                    file.transferTo(dest);
                    return "上传成功";
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "上传失败";
    }

    /**
     * 实现多文件上传
     * @param: [request]
     * @return: java.lang.String
     */
    @Override
    public String multiUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    File path = new File(ResourceUtils.getURL("classpath:").getPath());
                    if(!path.exists()) path = new File("");
                    String filePath = path.getAbsolutePath();
                    String tmp = filePath.substring(0,filePath.lastIndexOf("\\"));
                    tmp = tmp.substring(0,tmp.lastIndexOf("\\"));
                    String realPath = tmp.concat("\\src\\main\\java\\com\\youda\\anchor\\upload");
                    stream = new BufferedOutputStream(new FileOutputStream(new File(realPath + "\\" + file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (IOException e) {
                    stream = null;
                    return "第 " + i + " 个文件上传失败  ==> "
                            + e.getMessage();
                }
            } else {
                return "第 " + i
                        + " 个文件上传失败因为文件为空";
            }
        }
        return "上传成功";
    }
}
