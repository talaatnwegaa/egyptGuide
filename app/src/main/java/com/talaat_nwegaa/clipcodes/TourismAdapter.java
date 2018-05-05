package com.talaat_nwegaa.clipcodes;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourismAdapter extends ArrayAdapter<Tourism> {
    private int mColorResourceId;


    public TourismAdapter(Activity context, ArrayList<Tourism> tour, int colorResourceId) {
        super(context, 0, tour);
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
        // Get the {@link AndroidFlavor} object located at this position in the list
        Tourism currentPosition = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView headerOfText = (TextView) listItemView.findViewById(R.id.header);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        headerOfText.setText(currentPosition.getHeader());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPosition.hasImage()) {
            // set the ImageView to the image resource specified in the current word
            imageView.setImageResource(currentPosition.getImage());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        TextView Text = (TextView) listItemView.findViewById(R.id.text);
        Text.setText(currentPosition.getText());

        TextView Link = (TextView) listItemView.findViewById(R.id.link);
        Link.setText(currentPosition.getLink());

        // set the theme color for the list item
        View textContainer =listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }

}
