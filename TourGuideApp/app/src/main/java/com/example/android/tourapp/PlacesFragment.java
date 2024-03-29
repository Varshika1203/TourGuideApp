package com.varshikasahu.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    View view;
    ListAdapter listAdapter;
    ListView listView;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.list, container, false);
        final ArrayList<List> places = new ArrayList<>();
        places.add(new List(R.drawable.eiffel, R.string.item_1, R.string.item_1_1));
        places.add(new List(R.drawable.notre, R.string.item_2, R.string.item_2_2));
        places.add(new List(R.drawable.louvre, R.string.item_3, R.string.item_3_3));
        places.add(new List(R.drawable.arc, R.string.item_4, R.string.item_4_4));
        places.add(new List(R.drawable.seine,R.string.item_5, R.string.item_5_5));
        places.add(new List(R.drawable.montmartre,R.string.item_6, R.string.item_6_6));
        places.add(new List(R.drawable.versailles,  R.string.item_7, R.string.item_7_7));
        places.add(new List(R.drawable.jardin,R.string.item_8, R.string.item_8_8));
        places.add(new List(R.drawable.rouge,R.string.item_9, R.string.item_9_9));
        places.add(new List(R.drawable.disneyland,R.string.item_10, R.string.item_10_10));

        listAdapter = new ListAdapter(getActivity(), places);
        listView = (ListView) view.findViewById(R.id.places_list);
        listView.setAdapter(listAdapter);
        return view;
    }
}
