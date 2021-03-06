package com.udacity.silver.udacitytour.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.udacity.silver.udacitytour.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SnacksFragment extends Fragment {

    @BindView(R.id.list_view)
    ListView listView;

    public SnacksFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        ButterKnife.bind(this, view);
        listView.setAdapter(new ArrayAdapter<>(
                getContext(),
                R.layout.list_item,
                getResources().getStringArray(R.array.snacks)));
        return view;
    }

}
