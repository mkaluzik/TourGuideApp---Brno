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
        words.add(new Word("Hotel Arte Brno", "Drobného 289/6"));
        words.add(new Word("Hotel Vista ****", "Hudcova 72"));
        words.add(new Word("Barceló Brno Palace", "Šilingrovo náměstí 265/2"));
        words.add(new Word("Hotel International", "621 00 Brno-Medlánk"));
        words.add(new Word("Grandhotel Brno", "Benešova 605/18"));
        words.add(new Word("Hotel Grandezza", "Zelný trh 314/2"));

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
