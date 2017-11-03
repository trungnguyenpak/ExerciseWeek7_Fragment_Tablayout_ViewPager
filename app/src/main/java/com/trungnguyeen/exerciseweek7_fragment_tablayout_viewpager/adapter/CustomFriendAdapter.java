package com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.R;
import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.model.Friend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trungnguyeen on 11/4/17.
 */

public class CustomFriendAdapter extends ArrayAdapter<Friend> {

    private Context context;
    private int resource;
    private ArrayList<Friend> arrFriend;
    private final static String TAG = CustomFriendAdapter.class.getSimpleName();


    public CustomFriendAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Friend> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrFriend = (ArrayList<Friend>) objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_friend, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.txtPhoneNumber = (TextView) convertView.findViewById(R.id.tv_phoneNumber);
            viewHolder.txtSymbol = (TextView) convertView.findViewById(R.id.tv_avatar);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Friend friend = arrFriend.get(position);

        viewHolder.txtName.setText(friend.getmName());
        viewHolder.txtPhoneNumber.setText(friend.getmPhoneNumber());
        viewHolder.txtSymbol.setText(friend.getmSymbol());

        return convertView;

    }

    public class ViewHolder{
        TextView txtName;
        TextView txtPhoneNumber;
        TextView txtSymbol;
    }
}
