package com.anugrah.aplikasiwisata.start;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.anugrah.aplikasiwisata.start.fragment1;
import com.anugrah.aplikasiwisata.start.fragment2;
import com.anugrah.aplikasiwisata.start.fragment3;

public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fragment1();
            case 1:
                return new fragment2();
            case 2:
                return new fragment3();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
