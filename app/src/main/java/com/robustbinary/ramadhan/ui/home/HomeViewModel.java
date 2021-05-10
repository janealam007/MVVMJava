package com.robustbinary.ramadhan.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.robustbinary.ramadhan.ui.models.district.DistrictResponse;
import com.robustbinary.ramadhan.ui.models.RamadanResponse;
import com.robustbinary.ramadhan.ui.repository.DistrictRepository;

public class HomeViewModel extends AndroidViewModel {

    private LiveData<DistrictResponse> districtResponseLiveData;
    private LiveData<RamadanResponse> responseLiveData;

    private DistrictRepository districtRepository;

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public void init(){
        districtRepository = new DistrictRepository();
        districtResponseLiveData = districtRepository.getDistrit();
        responseLiveData = districtRepository.getRamadanTime();
    }

    public void getDistrictApi() {
        districtRepository.getDistrictResponse();
    }

    public void getRamadanSchedule(String district_id) {
        districtRepository.getRamadanSchedule(district_id);
    }

    public LiveData<RamadanResponse> getRamadanTime() {
        return responseLiveData;
    }

    public LiveData<DistrictResponse> getDistrict() {
        return districtResponseLiveData;
    }
}