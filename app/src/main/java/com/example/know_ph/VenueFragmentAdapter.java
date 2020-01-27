package com.example.know_ph;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VenueFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public VenueFragmentAdapter(FragmentManager fragmentManager, Context context){

        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return  new HotelsFragment();
            case 1:
                return  new SchoolsFragment();
            case 2:
                return new EateriesFragment();
            case 3:
                return new HospitalsFragment();
            case 4:
                return new ShoppingFragment();
                default:
            return null;
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
    
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.hotels);
            case 1:
                return mContext.getString(R.string.schools);
            case 2:
                return mContext.getString(R.string.eateries);
            case 3:
                return mContext.getString(R.string.hospitals);
            case 4:
                return mContext.getString(R.string.shopping);

                default:
                    return null;
        }
    }
}
