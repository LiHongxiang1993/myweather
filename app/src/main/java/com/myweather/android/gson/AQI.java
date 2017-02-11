package com.myweather.android.gson;

/**
 * Created by xiangzi on 2017/2/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
