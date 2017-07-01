package com.example.android.runapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mhesah on 2017-07-01.
 */

public class CustomDataAdapter extends ArrayAdapter<CustomData> {

    public CustomDataAdapter(Activity context, ArrayList<CustomData> customData) {
        super(context, 0, customData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview, parent, false);
        }

        CustomData currentCustomData = getItem(position);

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);
        icon.setImageResource(currentCustomData.getIcon());

        TextView text = (TextView) listItemView.findViewById(R.id.text);
        text.setText(currentCustomData.getText());

        return listItemView;
    }
}
