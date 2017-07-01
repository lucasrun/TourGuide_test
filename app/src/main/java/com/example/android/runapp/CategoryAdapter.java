package com.example.android.runapp;

/**
 * Created by mhesah on 2017-07-01.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    // app context
    private Context mContext;

    // constructor using fragment manager to keep fragment state
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // fragment for each page
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new ArtFragment();
        } else if (position == 2) {
            return new HistoryFragment();
        } else {
            return new FoodFragment();
        }
    }

    // total amount of pages
    @Override
    public int getCount() {
        return 4;
    }

    // page titles
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_city);
        } else if (position == 1) {
            return mContext.getString(R.string.category_art);
        } else if (position == 2) {
            return mContext.getString(R.string.category_history);
        } else {
            return mContext.getString(R.string.category_food);
        }
    }
}
