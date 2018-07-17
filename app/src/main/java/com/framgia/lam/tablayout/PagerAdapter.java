package com.framgia.lam.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter  extends FragmentStatePagerAdapter{
     private Context mContext ;

    public PagerAdapter(FragmentManager fragmentManager, Context context) {

        super(fragmentManager);
        this.mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0 :
                frag = new FristFragment();
                break;
            case 1 :
                frag = new SecoundFragment();
                break;
            case 2 :
                frag = new ThirdFragment();
                break;
        }

        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = mContext.getString(R.string.Viet_Nam);
                break;
            case 1:
                title = mContext.getString(R.string.Hanh_Dong);
                break;
            case 2:
                title = mContext.getString(R.string.Kinh_Di);
                break;
        }
        return title;
    }
}
