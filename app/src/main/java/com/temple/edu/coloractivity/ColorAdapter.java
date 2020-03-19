package com.temple.edu.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String[] colorList;
    String[] displayList;

    public ColorAdapter(Context context, String[] colorList, String[] displayList) {
        this.context = context;
        this.colorList = colorList;
        this.displayList = displayList;
    }

    @Override
    public int getCount() {
        return colorList.length;
    }

    @Override
    public Object getItem(int position) {
        return colorList[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view;
        if (convertView instanceof TextView) {
            view = (TextView) convertView;
        } else {
            view = new TextView(context);
        }


        view.setText(displayList[position]);
        view.setTextColor(Color.BLACK);
        view.setTextSize(20);

        view.setBackgroundColor(Color.parseColor(colorList[position]));
        return view;
    }
}
