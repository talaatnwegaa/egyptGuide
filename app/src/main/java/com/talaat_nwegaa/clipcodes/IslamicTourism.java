package com.talaat_nwegaa.clipcodes;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IslamicTourism extends Fragment {

    //Constructor default
    public IslamicTourism(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of Tourism
        final ArrayList<Tourism> tour = new ArrayList<Tourism>();
        tour.add(new Tourism("Saladin Citadel",R.drawable.saladin,getString(R.string.saladin_citadel),getString(R.string.saladin_citadel_link)));
        tour.add(new Tourism("Muizz Street",R.drawable.muizz_street,getString(R.string.muizz_street),getString(R.string.muizz_street_link)));
        tour.add(new Tourism("Khan el-Khalili",R.drawable.alkhalili_bazar,getString(R.string.khan_el_khalili),getString(R.string.khan_el_khalili_link)));
        tour.add(new Tourism("Sultan Hassan Mosque",R.drawable.sultan_hassan_mosque,getString(R.string.sultan_hassan_mosque),getString(R.string.sultan_hassan_mosque_link)));
        tour.add(new Tourism("Citadel of Qaitbay",R.drawable.qaitbay_citadel,getString(R.string.qaitbay_citadel),getString(R.string.qaitbay_citadel_link)));
        tour.add(new Tourism("Al Azhar Mosque",R.drawable.al_azhar_mosque,getString(R.string.al_azhar_mosque),getString(R.string.al_azhar_mosque_link)));
        tour.add(new Tourism("Amr ibn al-As Mosque",R.drawable.amr_ibn_alas_mosque,getString(R.string.amr_ibn_alas_mosque),getString(R.string.amr_ibn_alas_mosque_link)));

        // creating rootView and setting it up with the ArrayAdapter
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        TourismAdapter adapter = new TourismAdapter(getActivity(), tour,R.color.islamic_egypt_background);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

