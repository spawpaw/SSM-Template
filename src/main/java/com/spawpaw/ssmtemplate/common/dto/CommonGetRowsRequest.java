package com.spawpaw.ssmtemplate.common.dto;

/**
 * @author BenBenShang 2017/4/21.
 * @version: 1.0 2017.2.21
 * @copyright: <p> 2017.2.21 spawpaw@hotmail.com CC-BY-NC-SA.
 * Description for this class:
 * 根据页数和分页大小获取多条数据的请求
 */
public class CommonGetRowsRequest {
    private int curPage;
    private int pageSize;

    public int getCurPage() {
        return curPage;
    }

    public int getLimit() {
        return pageSize;
    }

    public int getOffset() {
        return pageSize * (curPage > 0 ? curPage - 1 : 0);
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
