package com.robustbinary.ramadhan.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.robustbinary.ramadhan.R;
import com.robustbinary.ramadhan.ui.models.district.DistrictData;

import java.util.ArrayList;
import java.util.List;

public class RamadhanAdapter extends RecyclerView.Adapter<RamadhanAdapter.BookSearchResultHolder> {
    private List<DistrictData> dataArrayList = new ArrayList<>();

    public RamadhanAdapter(List<DistrictData> data) {
        dataArrayList = data;

    }

    @NonNull
    @Override
    public BookSearchResultHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ramadhan_item, parent, false);

        return new BookSearchResultHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookSearchResultHolder holder, int position) {
        DistrictData district = dataArrayList.get(position);

        holder.txt_district_name.setText(district.getDistrictNameBn());

    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }



    class BookSearchResultHolder extends RecyclerView.ViewHolder {
        private TextView txt_district_name;

        public BookSearchResultHolder(@NonNull View itemView) {
            super(itemView);

            txt_district_name = itemView.findViewById(R.id.txt_district_name);
        }
    }
}
