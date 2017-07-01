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

public class CityFragment extends Fragment {

    public CityFragment() {
        //required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview_main, container, false);

        // creating list
        final ArrayList<CustomData> customData = new ArrayList<CustomData>();
        customData.add(new CustomData(R.drawable.icon_city_01, R.string.city01));
        customData.add(new CustomData(R.drawable.icon_city_02, R.string.city02));
        customData.add(new CustomData(R.drawable.icon_city_03, R.string.city03));
        customData.add(new CustomData(R.drawable.icon_city_04, R.string.city04));

        // setting adapters
        CustomDataAdapter customDataAdapter = new CustomDataAdapter(getActivity(), customData);
        ListView listView = (ListView) rootView.findViewById(R.id.main_list);
        listView.setAdapter(customDataAdapter);

        // returning view
        return rootView;
    }
}