package com.youda.anchor.admin.config;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/13-15:36
 * @Version: v1.0.0
 * @Comment: 对Page<E>结果进行包装
 */
public class PageInfo<T> implements Serializable {

    /**
     * 声明序列号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 声明当前页
     */
    private int pageNum;

    /**
     * 声明每页显示多少数量
     */
    private int pageSize;

    /**
     * 声明总记录数
     */
    private long total;

    /**
     * 声明总页数
     */
    private int pages;

    /**
     * 声明结果集
     */
    private List<T> list;

    /**
     * 声明是否是第一页
     */
    private boolean isFirstPage = false;

    /**
     * 声明是否是最后一页
     */
    private boolean isLastPage = false;

    /**
     * 构造函数
     * @param: []
     * @return:
     */
    public PageInfo() {
    }

    /**
     * 重构构造函数
     * @param: [list]
     * @return:
     */
    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if (list instanceof Collection) {
            //判定页面边界
            judgePageBoundary();
        }
    }

    /**
     * 判定页面边界
     * @param: []
     * @return: void
     */
    private void judgePageBoundary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
    }

    /**
     * 实现获得当前页面
     * @param: []
     * @return: int
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * 实现设置当前页面
     * @param: [pageNum]
     * @return: void
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 实现获得每页大小
     * @param: []
     * @return: int
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 实现设置每页大小
     * @param: [pageSize]
     * @return: void
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 实现获取总记录数
     * @param: []
     * @return: long
     */
    public long getTotal() {
        return total;
    }

    /**
     * 实现设置总记录数
     * @param: [total]
     * @return: void
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * 实现获取总页数
     * @param: []
     * @return: int
     */
    public int getPages() {
        return pages;
    }

    /**
     * 实现设置总页数
     * @param: [pages]
     * @return: void
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * 实现获取结果集
     * @param: []
     * @return: java.util.List<T>
     */
    public List<T> getList() {
        return list;
    }

    /**
     * 实现设置结果集
     * @param: [list]
     * @return: void
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * 实现获取是否是第一页
     * @param: []
     * @return: boolean
     */
    public boolean isFirstPage() {
        return isFirstPage;
    }

    /**
     * 实现设置是否是第一页
     * @param: [firstPage]
     * @return: void
     */
    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    /**
     * 实现获取是否是最后一页
     * @param: []
     * @return: boolean
     */
    public boolean isLastPage() {
        return isLastPage;
    }

    /**
     * 实现设置是否是最后一页
     * @param: [lastPage]
     * @return: void
     */
    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }

    /**
     * 实现toString方法
     * @param: []
     * @return: java.lang.String
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageInfo{");
        sb.append("pageNum=").append(pageNum);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", total=").append(total);
        sb.append(", pages=").append(pages);
        sb.append(", list=").append(list);
        sb.append(", isFirstPage=").append(isFirstPage);
        sb.append(", isLastPage=").append(isLastPage);
        sb.append(", navigatePageNums=");
        sb.append("}");
        return sb.toString();
    }
}
