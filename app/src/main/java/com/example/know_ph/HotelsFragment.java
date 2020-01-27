package com.example.know_ph;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        final ArrayList<Venue> venues = new ArrayList<Venue>();

        /**
         * The add method is tied to the Word.java class and enables us display the two translations
         * this code means we are adding the word inline to the list.
         */
        venues.add(new Venue(R.drawable.hotel_presidential_poolside, "Presidential Hotel", "1 Birabi Street, New GRA",
                "Phone: 08055559500 \n WIfi, free parking,, outdoor pool, laundry service, etc."));
        venues.add(new Venue(R.drawable.golden_tulip, "Golden Tulip", "1c Evo Road GRA phase 2",
                "Phone: 09057777780 \n WIfi, free parking,, outdoor pool, laundry service, etc."));
        venues.add(new Venue(R.drawable.landmark_hotel, "Landmark Hotels", "4 Worlu Street, D/line",
                "Phone: 08137903847 \n Outdoor pool, laundry service, etc."));
        venues.add(new Venue(R.drawable.novotel_hotel, "Novotel Hotel", "3 Stadium Rd, Rumuomasi",
                "phone: 07035258639 \n WIfi, free parking,, outdoor pool, laundry service, etc."));
        venues.add(new Venue(R.drawable.best_western_hotel, "Best Western Hotel", "Plot f35 Woke Street, off Sani " +
                "Abacha Rd. GRA 3", "Phone: 08131561560"));

        VenueAdapter adapter = new VenueAdapter(getActivity(), venues, R.color.venue_hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
