package com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.R;

/**
 * Created by trungnguyeen on 11/2/17.
 */

public class TabTwoFragment extends Fragment {

    private ListView lvGiaoVien;
    private String[] listGiaoVien= {"Cô Hoa",
                                    "Cô Huệ",
                                    "Thầy Bông",
                                    "Cô Lan",
                                    "Cô Ngọc",
                                    "Cô Cúc",
                                    "Cô Quỳnh",
                                    "Thầy Dương"};



    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);


        lvGiaoVien = (ListView) view.findViewById(R.id.lvGiaoVien);
        ArrayAdapter arrAdapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1, listGiaoVien);
        lvGiaoVien.setAdapter(arrAdapter);

        lvGiaoVien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(), listGiaoVien[i], Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
