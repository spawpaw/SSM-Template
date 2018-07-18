package com.spawpaw.ssm.common.controller;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
public class PageInfo {
    public int currentPage;//当前页
    public int pageSize;//每页多少条数据

    public int totalPage;//总页数
    public int totalRows;//总记录数


    public int getOffset() {
        return 0;
    }

    public int getLimit() {
        return pageSize;
    }

    public PageInfo(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public PageInfo(int currentPage, int pageSize, int totalRows) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalRows = totalRows;
        this.totalPage = totalRows / pageSize + (totalRows % pageSize > 0 ? 1 : 0);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
}
