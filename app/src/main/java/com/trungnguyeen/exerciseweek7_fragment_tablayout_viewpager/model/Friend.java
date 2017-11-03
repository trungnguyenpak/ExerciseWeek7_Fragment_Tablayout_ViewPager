package com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.model;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by trungnguyeen on 11/3/17.
 */

public class Friend {

    private String mName;
    private String mPhoneNumber;
    private String mSymbol;

    public Friend(String mName, String mPhoneNumber) {
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mSymbol = getCharOfName(mName);
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmSymbol() {
        return mSymbol;
    }

    public void setmSymbol(String mSymbol) {
        this.mSymbol = mSymbol;
    }

    private String getCharOfName(String name){
        name = name.trim();
        String[] tmp = name.split(" ");
        Log.i(TAG, "getCharOfName: " + tmp[tmp.length -1]);
        return String.valueOf(tmp[tmp.length - 1].charAt(0));
    }
}
