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

public class TabOneFragment extends Fragment {

    private ListView lvMonHoc;
    private String[] listMonHoc = {"Toan hoc",
                                    "Lich su",
                                    "Van hoc",
                                    "Hoa hoc",
                                    "Vat ly",
                                    "Dia ly",
                                    "Giao duc cong dan",
                                    "The duc",
                                    "Quoc phong",
                                    "Sinh hoc",
                                    "Anh van",
                                    "Tu chon"};



    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);


        lvMonHoc = (ListView) view.findViewById(R.id.lvMonHoc);
        ArrayAdapter arrAdapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1, listMonHoc);
        lvMonHoc.setAdapter(arrAdapter);

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(), listMonHoc[i], Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
