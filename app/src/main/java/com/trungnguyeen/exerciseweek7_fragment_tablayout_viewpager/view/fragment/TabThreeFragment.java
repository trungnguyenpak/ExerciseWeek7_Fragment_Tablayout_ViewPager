package com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.R;
import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.adapter.CustomFriendAdapter;
import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.model.Friend;

import java.util.ArrayList;

/**
 * Created by trungnguyeen on 11/2/17.
 */

public class TabThreeFragment extends Fragment {

    private ListView lvFriend;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);
        
        lvFriend = (ListView) view.findViewById(R.id.lvFriend);

        ArrayList<Friend> arrFriend = new ArrayList<>();
        arrFriend.add(new Friend("Nguyễn Hữu Trung", "01269 681 xxx"));
        arrFriend.add(new Friend("Nguyễn Hữu Đức", "01676 254 xxx"));
        arrFriend.add(new Friend("Vũ Tô Thanh Hoài", "0932 050 xxx"));
        arrFriend.add(new Friend("Nghiêm Lan Anh", "0505 236 xxx"));

        CustomFriendAdapter friendAdapter = new CustomFriendAdapter(view.getContext(), R.layout.row_item_friend, arrFriend);
        lvFriend.setAdapter(friendAdapter);


        return view;
    }
}
