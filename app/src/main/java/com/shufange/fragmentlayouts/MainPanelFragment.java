package com.shufange.fragmentlayouts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainPanelFragment extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_panel, container, false);

        TextView infoTitle = (TextView) view.findViewById(R.id.infoTitleTextView);
        infoTitle.setText("TV Series Title");

        TextView infoMainBody = (TextView) view.findViewById(R.id.infoMainBodyTextView);
        infoMainBody.setText("Introduction about TV series");

        return view;
    }

}



