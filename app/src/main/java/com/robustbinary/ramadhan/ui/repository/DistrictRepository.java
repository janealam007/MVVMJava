package com.robustbinary.ramadhan.ui.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.robustbinary.ramadhan.ui.apis.ApiClient;
import com.robustbinary.ramadhan.ui.apis.ApiService;
import com.robustbinary.ramadhan.ui.models.RamadanResponse;
import com.robustbinary.ramadhan.ui.models.district.DistrictResponse;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DistrictRepository {
    private ApiService apiService;
    private MutableLiveData<DistrictResponse> districtResponseLiveData;
    private MutableLiveData<RamadanResponse> ramadanResponseLiveData;

    public DistrictRepository() {
        districtResponseLiveData = new MutableLiveData<>();
        ramadanResponseLiveData = new MutableLiveData<>();
        apiService =  ApiClient.getClient();
    }

    public void getDistrictResponse() {
        Map<String, String> params =  new HashMap<>();
        params.put("api_key", "^)@$!");

        apiService.getDistricts(params)
                .enqueue(new Callback<DistrictResponse>() {
                    @Override
                    public void onResponse(Call<DistrictResponse> call, Response<DistrictResponse> response) {
                        if (response.body() != null) {
                            districtResponseLiveData.postValue(response.body());
                        }
                        Log.d("DistrictResponse"," response.body():"+response.body() );
                    }

                    @Override
                    public void onFailure(Call<DistrictResponse> call, Throwable t) {
                        districtResponseLiveData.postValue(null);
                        Log.d("DistrictResponse"," onFailure:"+t.getMessage() );
                    }
                });
    }

    public LiveData<DistrictResponse> getDistrit() {
        return districtResponseLiveData;
    }

    public LiveData<RamadanResponse> getRamadanTime() {
        return ramadanResponseLiveData;
    }

    public void getRamadanSchedule(String district_id) {
        Map<String, String> params =  new HashMap<>();
        params.put("api_key", "^)@$!");
        params.put("district_id", district_id);

        apiService.getRamadanSchedule(params)
                .enqueue(new Callback<RamadanResponse>() {
                    @Override
                    public void onResponse(Call<RamadanResponse> call, Response<RamadanResponse> response) {
                        if (response.body() != null) {
                            ramadanResponseLiveData.postValue(response.body());
                        }
                        Log.d("DistrictResponse"," response.body():"+response.body() );
                    }

                    @Override
                    public void onFailure(Call<RamadanResponse> call, Throwable t) {
                        ramadanResponseLiveData.postValue(null);
                        Log.d("DistrictResponse"," onFailure:"+t.getMessage() );
                    }
                });
    }
}
