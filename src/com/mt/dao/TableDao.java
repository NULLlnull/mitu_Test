package com.mt.dao;

import com.mt.domain.MituXsxx;

import java.util.List;

public class TableDao {
    //页数
    private int draw;
    //总条数
    private int recordsTotal;
    private int recordsFiltered;
    //数据
    private List<MituXsxx> data;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<MituXsxx> getData() {
        return data;
    }

    public void setData(List<MituXsxx> data) {
        this.data = data;
    }
}
