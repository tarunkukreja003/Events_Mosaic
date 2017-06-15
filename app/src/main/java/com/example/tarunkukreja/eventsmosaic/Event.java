package com.example.tarunkukreja.eventsmosaic;

/**
 * Created by tarunkukreja on 14/06/17.
 */

public class Event {

    private int mEventImage ;
    private String mDateText ;
    private String mMonthText ;
    private String mEventName ;
    private String mLocation ;
    private String mPeopleInterested ;

    public Event(int mEventImage, String mDateText, String mMonthText, String mEventName, String mLocation, String mPeopleInterested) {
        this.mEventImage = mEventImage;
        this.mDateText = mDateText;
        this.mMonthText = mMonthText;
        this.mEventName = mEventName;
        this.mLocation = mLocation;
        this.mPeopleInterested = mPeopleInterested;
    }

    public int getmEventImage() {
        return mEventImage;
    }

    public void setmEventImage(int mEventImage) {
        this.mEventImage = mEventImage;
    }

    public String getmDateText() {
        return mDateText;
    }

    public void setmDateText(String mDateText) {
        this.mDateText = mDateText;
    }

    public String getmMonthText() {
        return mMonthText;
    }

    public void setmMonthText(String mMonthText) {
        this.mMonthText = mMonthText;
    }

    public String getmEventName() {
        return mEventName;
    }

    public void setmEventName(String mEventName) {
        this.mEventName = mEventName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmPeopleInterested() {
        return mPeopleInterested;
    }

    public void setmPeopleInterested(String mPeopleInterested) {
        this.mPeopleInterested = mPeopleInterested;
    }
}
