package com.vikas.takeattendance;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by vikas on 12-Jul-17.
 */

public class DetailsAdapter extends ArrayAdapter<Details>{

    public DetailsAdapter(Context context, ArrayList<Details> details) {
        super(context,0,details);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView ;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Details currentDetails = getItem(position);

        //Log.i(String.valueOf(position), MainActivity.words.get(position).getmName());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentDetails.getmName());

        TextView rollTextView = (TextView) listItemView.findViewById(R.id.roll);
        rollTextView.setText(currentDetails.getmRoll());

        Switch presentSwitch = (Switch) listItemView.findViewById(R.id.present);
        presentSwitch.setChecked(currentDetails.getmIsPresent());




        return listItemView;
    }

}
