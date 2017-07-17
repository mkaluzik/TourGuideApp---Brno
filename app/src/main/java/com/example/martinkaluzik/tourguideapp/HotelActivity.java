package com.example.martinkaluzik.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.arte), getString(R.string.arte_address)));
        words.add(new Word(getString(R.string.vista), getString(R.string.vista_address)));
        words.add(new Word(getString(R.string.barcelo), getString(R.string.barcelo_address)));
        words.add(new Word(getString(R.string.international), getString(R.string.international_address)));
        words.add(new Word(getString(R.string.grand), getString(R.string.grand_address)));
        words.add(new Word(getString(R.string.grandezza), getString(R.string.grandezza_address)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
