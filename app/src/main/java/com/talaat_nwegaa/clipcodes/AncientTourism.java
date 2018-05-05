package com.talaat_nwegaa.clipcodes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class AncientTourism extends Fragment {

        //Constructor default
        public AncientTourism(){};

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View PageOne = inflater.inflate(R.layout.list_view, container, false);


        final ArrayList<Tourism> tour = new ArrayList<Tourism>();

        tour.add(new Tourism("pyramids", R.drawable.pyramids, getString(R.string.pyramids),getString(R.string.pyramids_link)));
        tour.add(new Tourism("Abu Simbel Temple", R.drawable.abu_simbel_temples, getString(R.string.abu_simbel),getString(R.string.abu_simbel_link)));
        tour.add(new Tourism("Hatchepsut Temple", R.drawable.hatchepsut_temple, getString(R.string.hatshepsut),getString(R.string.hatshepsut_link)));
        tour.add(new Tourism("Karnak_Temple", R.drawable.karnak_temple,getString(R.string.karnak),getString(R.string.karnak_link)));
        tour.add(new Tourism("Luxor_Temple", R.drawable.luxor_temple, getString(R.string.luxor),getString(R.string.luxor_link)));

            // creating rootView and setting it up with the ArrayAdapter
            View rootView = inflater.inflate(R.layout.list_view, container, false);
            TourismAdapter adapter = new TourismAdapter(getActivity(), tour,R.color.ancient_egypt_background);
            final ListView listView = rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);

            return rootView;
        }
}