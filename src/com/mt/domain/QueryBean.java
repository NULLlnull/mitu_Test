package com.mt.domain;

public class QueryBean {
    private int page;
    private int pageNum;

    public QueryBean(int page, int pageNum) {
        this.page = page * pageNum;
        this.pageNum = pageNum;
    }

    public int getPage() {
        return page;
    }

    public int getPageNum() {
        return pageNum;
    }

}
