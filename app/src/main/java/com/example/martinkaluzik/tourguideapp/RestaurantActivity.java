package com.example.martinkaluzik.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.pavillon), getString(R.string.pavillon_address)));
        words.add(new Word(getString(R.string.palazzo), getString(R.string.palazzo_address)));
        words.add(new Word(getString(R.string.koishi), getString(R.string.koishi_address)));
        words.add(new Word(getString(R.string.borgo), getString(R.string.borgo_address)));
        words.add(new Word(getString(R.string.annapurna), getString(R.string.annapurna_address)));
        words.add(new Word(getString(R.string.spalicek), getString(R.string.spalicek_address)));
        words.add(new Word(getString(R.string.svejk), getString(R.string.svejk_address)));
        words.add(new Word(getString(R.string.goa), getString(R.string.goa_address)));
        words.add(new Word(getString(R.string.vytopna), getString(R.string.vytopna_address)));
        words.add(new Word(getString(R.string.labo), getString(R.string.labo_address)));
        words.add(new Word(getString(R.string.indian), getString(R.string.indian_address)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
