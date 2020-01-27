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
public class SchoolsFragment extends Fragment {


    public SchoolsFragment() {
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
        venues.add(new Venue(R.drawable.ash_merlyn, "Ash Merlyn", "Victory Estate Road 1, Elelenwo",
                "Phone: 084819916 \n Opens 6:30AM Mon.-Fri."));
        venues.add(new Venue(R.drawable.bloombreed, "Bloombreed high School", "17 Boskel Road",
                "Phone: 07039047680 \n Opens 6:30AM Mon.-Fri."));
        venues.add(new Venue(R.drawable.greenoak, "Greenoak", "99 Tombia Road Extension, 3rd Street, GRA phase 2",
                "Founded: 2004 \n Phone: 08086737401"));
        venues.add(new Venue(R.drawable.hallel, "Hallel College", "8 Mini Ezekwu Street",
                "Opens 9:00AM Mon.-Fri. \n Phone: 08037106151"));
        venues.add(new Venue(R.drawable.graceland, "Graceland", "25-27 stadium Rd, Rumuola, PH",
                "Phone: 08032324486"));

        VenueAdapter adapter = new VenueAdapter(getActivity(), venues, R.color.venue_schools);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
