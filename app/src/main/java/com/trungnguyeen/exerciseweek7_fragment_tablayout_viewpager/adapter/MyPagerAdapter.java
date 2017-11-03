package com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.view.fragment.TabOneFragment;
import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.view.fragment.TabThreeFragment;
import com.trungnguyeen.exerciseweek7_fragment_tablayout_viewpager.view.fragment.TabTwoFragment;

/**
 * Created by trungnguyeen on 11/2/17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public final static int FRAGMENT_COUNT = 3;


    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                //TODO: add fragment one
                return new TabOneFragment();
            case 1:
                //TODO: add fragment two
                return new TabTwoFragment();
            case 2:
                //TODO: add fragment three
                return new TabThreeFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Mon Hoc";
            case 1:
                return "Giao Vien";
            case 2:
                return "Ban be";
            default:
                return "";
        }
    }
}
