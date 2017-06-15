package com.example.tarunkukreja.eventsmosaic;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

//    RecyclerView recyclerView ;
    private List<Event> mEventList ;
    private ImageView imageView ;
    private TextView mDateText ;
    private TextView mMonthText ;
    private TextView mEventName ;
    private TextView mLocation ;
    private TextView mPeopleInterested ;

    Typeface roboto_head;
    Typeface roboto_regular ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

       // recyclerView = (RecyclerView)findViewById(R.id.events_recycler_view) ;
        mEventList = new ArrayList<Event>() ;

        mEventList.add(new Event(R.drawable.karaoke, "24", "JUL", "Karaoke Night", "Rose Cafe", "128"));
        mEventList.add(new Event(R.drawable.standup, "3", "AUG", "Standup Comedy", "Aerocity", "290"));
      //  RecyclerView.LayoutManager layoutManager =   new La

        EventsAdapter eventsAdapter = new EventsAdapter(this, mEventList) ;
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(eventsAdapter);

        imageView = (ImageView)findViewById(R.id.event_image);
        mDateText = (TextView)findViewById(R.id.date_number) ;
        mMonthText = (TextView)findViewById(R.id.month);
        mEventName = (TextView)findViewById(R.id.name_event) ;
        mLocation = (TextView)findViewById(R.id.location) ;
        mPeopleInterested = (TextView)findViewById(R.id.people_interested) ;
        imageView.setImageResource(R.drawable.karaoke1);

        roboto_head = Typeface.createFromAsset(getAssets(), "fonts/Roboto 500.ttf") ;
        roboto_regular = Typeface.createFromAsset(getAssets(), "fonts/Roboto regular.ttf") ;

        mDateText.setTypeface(roboto_regular);
        mEventName.setTypeface(roboto_head);
        mMonthText.setTypeface(roboto_regular);
        mLocation.setTypeface(roboto_regular);
        mPeopleInterested.setTypeface(roboto_regular);



    }
}
