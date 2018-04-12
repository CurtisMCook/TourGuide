package com.example.sanzablancoaka2c.tourguide;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourGuideFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else {
            return new SportsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

