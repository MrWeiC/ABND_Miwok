package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by weichen on 8/13/16.
 */
public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter{
    public CategoryFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors","Phrases" };

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new NumberFragment();
        } else if(position ==1){
            return new FamilyFragment();
        }else if(position ==2){
            return new ColorsFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
