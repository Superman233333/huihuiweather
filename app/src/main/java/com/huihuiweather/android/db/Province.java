package com.huihuiweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/1/30.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provunceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvunceCode() {
        return provunceCode;
    }

    public void setProvunceCode(int provunceCode) {
        this.provunceCode = provunceCode;
    }
}
