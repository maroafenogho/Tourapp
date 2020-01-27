package com.example.know_ph;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalsFragment extends Fragment {


    public HospitalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        final ArrayList<Venue> venues = new ArrayList<Venue>();

        venues.add(new Venue(R.drawable.prime, "Prime medical consultants", "#4 Prime close, off Chief Nyenwewo Avenue, Eliada " +
                "Estate, Rumuogba by Artillery", "Open 24hours \nPhone: 07033979904"));
        venues.add(new Venue(R.drawable.anchor, "Anchor", "km 15, Port harcourt/Aba Expressway, near Eleme junction," +
                "Umurolu Port Harcourt", "Phone: 08033103672 \n Open 24hours"));
        venues.add(new Venue(R.drawable.nobsams, "Nobsams", "44 Trans-Amadi Industrial layout",
                "Phone: 08182132215 \nOpen 24 hours"));
        venues.add(new Venue(R.drawable.first, "First Rivers Hospital Limited", "7/9 Old Aba Rd.",
                "Phone: 08158493600 \nOpen 24 hours"));

        VenueAdapter adapter = new VenueAdapter(getActivity(), venues, R.color.venue_hospitals);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
