package com.example.tarunkukreja.eventsmosaic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by tarunkukreja on 14/06/17.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventsViewHolder> {
    private Context mContext ;
    private List<Event> mEventList ;

    public EventsAdapter(Context context, List<Event> eventList) {
       mContext = context ;
       mEventList = eventList ;
    }

    @Override
    public EventsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_row, viewGroup, false) ;
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final EventsViewHolder eventsViewHolder, int position) {
        Event event = mEventList.get(position) ;

        Picasso.with(mContext)
                .load(event.getmEventImage())
                .into(eventsViewHolder.mEventImage);

        eventsViewHolder.mDateText.setText(event.getmDateText());
        eventsViewHolder.mMonthText.setText(event.getmMonthText());
        eventsViewHolder.mEventName.setText(event.getmEventName());
        eventsViewHolder.mLocation.setText(event.getmLocation());
        eventsViewHolder.mPeopleInterested.setText(event.getmPeopleInterested());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView mEventImage ;
        private TextView mDateText ;
        private TextView mMonthText ;
        private TextView mEventName ;
        private TextView mLocation ;
        private TextView mPeopleInterested ;

        public EventsViewHolder(View itemView) {
            super(itemView);
            mEventImage = (ImageView)itemView.findViewById(R.id.event_image) ;
            mDateText = (TextView) itemView.findViewById(R.id.date_number) ;
            mMonthText = (TextView) itemView.findViewById(R.id.month);
            mEventName = (TextView) itemView.findViewById(R.id.name_event) ;
            mLocation = (TextView) itemView.findViewById(R.id.location) ;
            mPeopleInterested = (TextView) itemView.findViewById(R.id.people_interested) ;

        }
    }
}
