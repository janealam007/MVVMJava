package com.robustbinary.ramadhan.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.robustbinary.ramadhan.R;
import com.robustbinary.ramadhan.ui.adapters.DistrictAdapter;
import com.robustbinary.ramadhan.ui.models.RamadanResponse;
import com.robustbinary.ramadhan.ui.models.district.DistrictData;
import com.robustbinary.ramadhan.ui.models.district.DistrictResponse;
import com.robustbinary.ramadhan.ui.utils.RecyclerItemClickListener;

import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView rclv_district;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        initUi(root);

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeViewModel.init();

        homeViewModel.getRamadanTime().observe(getActivity(), new Observer<RamadanResponse>() {
            @Override
            public void onChanged(RamadanResponse ramadanResponse) {
                Log.d("DistrictResponse"," RamadanResponse:"+ramadanResponse.getData().size() );
            }
        });

        homeViewModel.getDistrict().observe(getActivity(), new Observer<DistrictResponse>() {
            @Override
            public void onChanged(DistrictResponse response) {
                if (response != null) {
                    Log.d("DistrictResponse"," response:"+response.getData().size() );
                    setDistrictData(response.getData());
                }
            }
        });

        homeViewModel.getDistrictApi();

        return root;
    }

    private void setDistrictData(List<DistrictData> data) {
        DistrictAdapter districtAdapter = new DistrictAdapter(data);
        rclv_district.setAdapter(districtAdapter);

        rclv_district.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), rclv_district ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        Log.d("DistrictResponse"," response:"+data.get(position).getDistrictId() );
                        homeViewModel.getRamadanSchedule(data.get(position).getDistrictId());
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

    }

    private void initUi(View root) {
        rclv_district = root.findViewById(R.id.rclv_district);
        rclv_district.setLayoutManager(new LinearLayoutManager(getContext()));
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true);
        rclv_district.setLayoutManager(layoutManager);
    }


}