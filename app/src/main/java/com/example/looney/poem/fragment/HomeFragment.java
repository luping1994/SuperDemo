package com.example.looney.poem.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.looney.poem.R;

/**
 * Created by Looney on 2016/8/9.
 */
public class HomeFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View homeFragment =  View.inflate(getActivity(), R.layout.fragment_home,null);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)homeFragment.findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("个人简历");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        return homeFragment;
    }
}
