package com.huihuiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2018/1/30.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
