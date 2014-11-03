package com.shufange.fragmentlayouts;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class MyAdapter extends ArrayAdapter<String> {
    MyAdapter(Context context, String[] values) {
        super(context, R.layout.list_view_row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.list_view_row_layout, parent, false);
        String tvShow = getItem(position);

        TextView tvShowItem = (TextView) view.findViewById(R.id.rowTextView);
        tvShowItem.setText(tvShow);

        return view;
    }
}
