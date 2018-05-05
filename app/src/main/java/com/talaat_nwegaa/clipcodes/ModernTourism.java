package com.talaat_nwegaa.clipcodes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ModernTourism extends Fragment {

    //Constructor default
    public ModernTourism(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of Tourism
        final ArrayList<Tourism> tour = new ArrayList<Tourism>();
        tour.add(new Tourism("Sharm El Sheikh",R.drawable.sharm_el_sheikh,getString(R.string.sharm_el_sheikh),getString(R.string.sharm_el_sheikh_link)));
        tour.add(new Tourism("Egyptian Museum",R.drawable.egyptian_museum,getString(R.string.egyptian_museum),getString(R.string.egyptian_museum_link)));
        tour.add(new Tourism("Nile Cruise",R.drawable.nile_cruise,getString(R.string.nile_cruise),getString(R.string.nile_cruise_link)));
        tour.add(new Tourism("Cairo Tower",R.drawable.cairo_tower,getString(R.string.cairo_tower),getString(R.string.cairo_tower_link)));
        tour.add(new Tourism("Bibliotheca Alexandrina",R.drawable.bibliotheca_alexandrina,getString(R.string.bibliotheca_alexandrina),getString(R.string.bibliotheca_alexandrina_link)));
        tour.add(new Tourism("Hurghada",R.drawable.hurghada,getString(R.string.hurghada),getString(R.string.hurghada_link)));
        tour.add(new Tourism("Siwa Oasis",R.drawable.siwa_oasis,getString(R.string.siwa_oasis),getString(R.string.siwa_oasis_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        TourismAdapter adapter = new TourismAdapter(getActivity(), tour,R.color.islamic_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

