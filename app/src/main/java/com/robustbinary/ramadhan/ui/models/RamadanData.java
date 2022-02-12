
package com.robustbinary.ramadhan.ui.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RamadanData {

    @SerializedName("ramadan_number")
    @Expose
    private String ramadanNumber;
    @SerializedName("district_id")
    @Expose
    private String districtId;
    @SerializedName("ramadan_date")
    @Expose
    private String ramadanDate;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("sehri_alert_time")
    @Expose
    private String sehriAlertTime;
    @SerializedName("fajr_waqt_start")
    @Expose
    private String fajrWaqtStart;
    @SerializedName("ifter_time")
    @Expose
    private String ifterTime;

    public String getRamadanNumber() {
        return ramadanNumber;
    }

    public void setRamadanNumber(String ramadanNumber) {
        this.ramadanNumber = ramadanNumber;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getRamadanDate() {
        return ramadanDate;
    }

    public void setRamadanDate(String ramadanDate) {
        this.ramadanDate = ramadanDate;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSehriAlertTime() {
        return sehriAlertTime;
    }

    public void setSehriAlertTime(String sehriAlertTime) {
        this.sehriAlertTime = sehriAlertTime;
    }

    public String getFajrWaqtStart() {
        return fajrWaqtStart;
    }

    public void setFajrWaqtStart(String fajrWaqtStart) {
        this.fajrWaqtStart = fajrWaqtStart;
    }

    public String getIfterTime() {
        return ifterTime;
    }

    public void setIfterTime(String ifterTime) {
        this.ifterTime = ifterTime;
    }

}
