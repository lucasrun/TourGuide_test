package com.example.android.runapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mhesah on 2017-07-01.
 */

public class FoodFragment extends Fragment {

    public FoodFragment() {
        //required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview_main, container, false);

        // creating list
        final ArrayList<CustomData> customData = new ArrayList<CustomData>();
        customData.add(new CustomData(R.drawable.icon_food_01, R.string.food01));
        customData.add(new CustomData(R.drawable.icon_food_02, R.string.food02));
        customData.add(new CustomData(R.drawable.icon_food_03, R.string.food03));
        customData.add(new CustomData(R.drawable.icon_food_04, R.string.food04));

        // setting adapters
        CustomDataAdapter customDataAdapter = new CustomDataAdapter(getActivity(), customData);
        ListView listView = (ListView) rootView.findViewById(R.id.main_list);
        listView.setAdapter(customDataAdapter);

        // returning view
        return rootView;
    }
}
