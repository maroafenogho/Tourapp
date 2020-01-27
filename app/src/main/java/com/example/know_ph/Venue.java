package com.example.know_ph;

public class Venue {

    private int mImageResourceId;

    private String mVenueName;

    private String mVenueAddress;

    private String mVenueDetails;

    public  Venue(int imageResourceId, String venueName, String venueAddress, String venueDetails) {
        mImageResourceId = imageResourceId;
        mVenueName = venueName;
        mVenueAddress = venueAddress;
        mVenueDetails = venueDetails;

    }

    public int getImageResourceId() { return mImageResourceId; }

    public String getmVenueName() {return  mVenueName;}

    public  String getmVenueAddress() { return  mVenueAddress;}

    public String getmVenueDetails() { return  mVenueDetails;}

}
