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
public class EateriesFragment extends Fragment {


    public EateriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        final ArrayList<Venue> venues = new ArrayList<Venue>();


        venues.add(new Venue(R.drawable.kili, "Kilimanjaro", "Rumibekwe Rd., by Aba Rd.", "Opens 7:30 AM " +
                "\n Call:070054543663"));
        venues.add(new Venue(R.drawable.chicken_republic, "Chicken Republic", "plot 7, Sani Abacha Rd., GRA",
                "Opens 7:00 AM daily \n call: 08090161469"));
        venues.add(new Venue(R.drawable.jevinik, "Jevinik", "GRA PH", "Everything you need in one place. \n" +
                "Opens 7:30 AM \n Call: 070372746570"));
        venues.add(new Venue(R.drawable.coldstone, "Coldstone Creamery", "Olu Obasanjo way, PH.",
                "Opens 8:00 AM"));
        venues.add(new Venue(R.drawable.bole, "Bole king", "10A Omoku St, Woji, Port Harcourt",
                "Phone: 0817 967 0902"));

        VenueAdapter adapter = new VenueAdapter(getActivity(), venues, R.color.venue_eateries);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
