package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by weichen on 8/4/16.
 */


/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide layout based on a specific data
 * resource, which is a list of {@link Word}objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;

    public WordAdapter(Context context, ArrayList<Word> word, int color) {
        super(context, 0, word);
        this.mColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        LinearLayout word_text_container = (LinearLayout) listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps
        int color = ContextCompat.getColor(this.getContext(), mColor);

        word_text_container.setBackgroundColor(color);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
