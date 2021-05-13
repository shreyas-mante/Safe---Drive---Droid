package com.gpp.Adapters;

/**
 * Adapter class for implementing view pager
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.gpp.Fragments.AutoReplyFragment;
import com.gpp.Fragments.CallLogsFragment;
import com.gpp.Fragments.DriveModeFragment;
import com.gpp.labs.gpp.R;

public class PageAdapter extends FragmentStatePagerAdapter {

    //Declare your class variables here
    int noOfTabs;
    String[] tabTitles;

    public PageAdapter(FragmentManager fm, int noOfTabs, Context context) {
        super(fm);
        this.noOfTabs = noOfTabs;
        //Set the titles of the tabs on the LaunchActivity
        tabTitles = new String[]{
                context.getString(R.string.drive_mode_tab),
                context.getString(R.string.auto_reply_tab),
                context.getString(R.string.call_logs_tab)
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return new DriveModeFragment();
            case 1 :
                return new AutoReplyFragment();
            case 2 :
                return new CallLogsFragment();
            default :
                    return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
