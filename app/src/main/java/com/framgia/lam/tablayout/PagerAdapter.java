package com.framgia.lam.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter  extends FragmentStatePagerAdapter{
    private static final int INDEX =3;
     private Context mContext ;

    public PagerAdapter(Context context,FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0 :
                frag = new FirstFragment();
                break;
            case 1 :
                frag = new SecondFragment();
                break;
            case 2 :
                frag = new ThirdFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return INDEX;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = mContext.getString(R.string.title_VietNam);
                break;
            case 1:
                title = mContext.getString(R.string.title_Action);
                break;
            case 2:
                title = mContext.getString(R.string.title_KinhDi);
                break;
        }
        return title;
    }
}
