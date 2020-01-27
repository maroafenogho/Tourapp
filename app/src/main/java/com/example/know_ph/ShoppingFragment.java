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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        final ArrayList<Venue> venues = new ArrayList<Venue>();


        venues.add(new Venue(R.drawable.ph_mall , "Port Harcourt Mall", "1 Azikiwe Rd",
                "Opens 10:00AM daily"));
        venues.add(new Venue(R.drawable.next, "Next CAsh and Carry", "Behind pabod Breweries, Oginigba, Trans-Amadi",
                "Phone: 07058208470 \nOpens 9:00 AM- 9:00PM Monday - Saturday \n     11:45 AM - 7:00 PM Sundays"));
        venues.add(new Venue(R.drawable.everyday, "Everyday Emporium 3", "Plot 283 Opp Shell RA, PH-Aba Exp. way",
                "Phone: 08032628200 \nOpens 9:00 AM daily"));
        venues.add(new Venue(R.drawable.market_square, "Market Square", "279 Peter Odili road Trans-Amadi industrial Layout",
                "Phone: 07002786379"));

        VenueAdapter adapter = new VenueAdapter(getActivity(), venues, R.color.venue_shopping);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
