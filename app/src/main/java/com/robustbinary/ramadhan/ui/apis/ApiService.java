package com.robustbinary.ramadhan.ui.apis;

import com.robustbinary.ramadhan.ui.models.RamadanResponse;
import com.robustbinary.ramadhan.ui.models.district.DistrictResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("getDistricts")
    Call<DistrictResponse> getDistricts(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("getRamadanSchedule")
    Call<RamadanResponse> getRamadanSchedule(@FieldMap Map<String, String> params);
}
