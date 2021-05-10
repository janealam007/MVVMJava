
package com.robustbinary.ramadhan.ui.models.district;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DistrictData {

    @SerializedName("district_id")
    @Expose
    private String districtId;
    @SerializedName("district_name")
    @Expose
    private String districtName;
    @SerializedName("district_name_bn")
    @Expose
    private String districtNameBn;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictNameBn() {
        return districtNameBn;
    }

    public void setDistrictNameBn(String districtNameBn) {
        this.districtNameBn = districtNameBn;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

}
