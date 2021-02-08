package com.example.playandroid.utils;

import com.example.playandroid.base.BaseFragment;
import com.example.playandroid.ui.fragment.HomeFragment;
import com.example.playandroid.ui.fragment.QuestionFragment;
import com.example.playandroid.ui.fragment.RestFragment;
import com.example.playandroid.ui.fragment.SystemFragment;

import java.util.HashMap;
import java.util.Map;


/**
 * @author OkAndGreat
 */
public class FragmentCreator {


    private static Map<Integer, BaseFragment> sCache = new HashMap<>();


    public static BaseFragment getFragment(int position) {
        BaseFragment baseFragment = sCache.get(position);
        if (baseFragment != null) {
            return baseFragment;
        }

        switch (position) {
            case 0:
                baseFragment = new HomeFragment();
                break;
            case 1:
                baseFragment = new QuestionFragment();
                break;
            case 2:
                baseFragment = new SystemFragment();
                break;
            case 3:
                baseFragment = new RestFragment();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }

        sCache.put(position, baseFragment);
        return baseFragment;
    }

}
