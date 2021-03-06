package com.rdave.kamwaliapplication.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.rdave.kamwaliapplication.R;

public class CustomAdapter extends BaseAdapter implements SpinnerAdapter {

    String[] company;
    Context context;
    String[] colors = {"#13edea", "#e20ecd", "#15ea0d"};
    String[] colorsback = {"#FF000000", "#FFF5F1EC", "#ea950d"};

    public CustomAdapter(Context context, String[] company) {
        this.company = company;
        this.context = context;
    }

    @Override
    public int getCount() {
        return company.length;
    }

    @Override
    public Object getItem(int position) {
        return company[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.state_main, null);
        TextView textView = (TextView) view.findViewById(R.id.main);
        textView.setText(company[position]);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View view;
        view = View.inflate(context, R.layout.state_content, null);
        final TextView textView = (TextView) view.findViewById(R.id.dropdown);
        textView.setText(company[position]);

        textView.setTextColor(Color.parseColor(colors[position]));
        textView.setBackgroundColor(Color.parseColor(colorsback[position]));


        return view;

    }
}