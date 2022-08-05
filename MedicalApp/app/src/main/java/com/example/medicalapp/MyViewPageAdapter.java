package com.example.medicalapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.medicalapp.fragments.AerobicFragment;
import com.example.medicalapp.fragments.AnaerobicFragment;
import com.example.medicalapp.fragments.StretchingFragment;

public class MyViewPageAdapter extends FragmentStateAdapter {

    public MyViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new AerobicFragment();
            case 1:
                return new AnaerobicFragment();
            case 2:
                return new StretchingFragment();
            default:
                return new AerobicFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
