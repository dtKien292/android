package com.example.petapp2;

public class hdtn {
    String time;
    String detail_hdtn;

    public hdtn(String time, String detail_hdtn) {
        this.time = time;
        this.detail_hdtn = detail_hdtn;
    }

    public hdtn() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetail_hdtn() {
        return detail_hdtn;
    }

    public void setDetail_hdtn(String detail_hdtn) {
        this.detail_hdtn = detail_hdtn;
    }
}
