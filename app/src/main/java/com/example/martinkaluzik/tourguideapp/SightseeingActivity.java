package com.example.martinkaluzik.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightseeingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.vila), getString(R.string.vila_address),R.drawable.vila));
        words.add(new Word(getString(R.string.radnice), getString(R.string.radnice_address),R.drawable.radnice));
        words.add(new Word(getString(R.string.hrobka), getString(R.string.hrobka_address),R.drawable.hrobka));
        words.add(new Word(getString(R.string.podzemi), getString(R.string.podzemi_address),R.drawable.podzemi));
        words.add(new Word(getString(R.string.petrov), getString(R.string.petrov_address),R.drawable.petrov));
        words.add(new Word(getString(R.string.spilberk), getString(R.string.spilberk_address),R.drawable.spilberk));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.sightseeings);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}