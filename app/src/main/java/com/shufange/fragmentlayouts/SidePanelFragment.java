package com.shufange.fragmentlayouts;

import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SidePanelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_side_panel, container, false);
        String[] tvShowList = {"The Good Wife", "The Big Bang Theory", "Suits",
                "The Shield", "Two Broke Girls", "Two and Half Man", "Anger Management"};

        ListAdapter listAdapter = new MyAdapter(inflater.getContext(), tvShowList);
        ListView tvShowListView = (ListView) view.findViewById(R.id.sidePanelListView);
        tvShowListView.setAdapter(listAdapter);

        return view;
    }
}
