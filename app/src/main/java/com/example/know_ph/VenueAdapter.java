package com.example.know_ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class VenueAdapter extends ArrayAdapter<Venue> {

    private int mColorResourceId;

    public VenueAdapter(Context context, ArrayList<Venue> venues, int colorResourceId) {
        super(context, 0, venues);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Venue currentVenue = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentVenue.getImageResourceId());


        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        TextView nameTextView =  listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentVenue.getmVenueName());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentVenue.getmVenueAddress());

        TextView detailsTextView = listItemView.findViewById(R.id.details_text_view);
        detailsTextView.setText(currentVenue.getmVenueDetails());

        return listItemView;
    }
}
