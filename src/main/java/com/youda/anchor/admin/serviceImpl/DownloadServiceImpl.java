package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.service.DownloadService;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-13:32
 * @Version: v1.0.0
 * @Comment: 下载服务接口实现类
 */
@Service
public class DownloadServiceImpl implements DownloadService {

    /**
     * 实现下载文方法
     * @param: [request, response]
     * @return: java.lang.String
     */
    @Override
    public String download(HttpServletRequest request, HttpServletResponse response) {
        String fileName = "FileDownload.java";
        if (fileName != null) {
            String realPath = null;
            try {
                File path = new File(ResourceUtils.getURL("classpath:").getPath());
                if(!path.exists()) path = new File("");
                String filePath = path.getAbsolutePath();
                String tmp = filePath.substring(0,filePath.lastIndexOf("\\"));
                tmp = tmp.substring(0,tmp.lastIndexOf("\\"));
                realPath = tmp.concat("\\src\\main\\java\\com\\youda\\anchor\\upload");
                File file = new File(realPath, fileName);
                if (file.exists()) {
                    //设置强制下载不打开
                    response.setContentType("application/force-download");
                    //设置文件名
                    response.addHeader("Content-Disposition", "attachment;fileName="+fileName);
                    byte[] buffer = new byte[1024];
                    FileInputStream fis = null;
                    BufferedInputStream bis = null;
                    try {
                        fis = new FileInputStream(file);
                        bis = new BufferedInputStream(fis);
                        OutputStream os = response.getOutputStream();
                        int i = bis.read(buffer);
                        while (i != -1) {
                            os.write(buffer, 0, i);
                            i = bis.read(buffer);
                        }
                        System.out.println("下载成功");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        if (bis != null) {
                            try {
                                bis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fis != null) {
                            try {
                                fis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            /*String realPath = request.getServletContext().getRealPath("//WEB-INF//");*/

        }
        return null;
    }
}
