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
        words.add(new Word("Restaurant Pavillon", "Jezuitská 687/6"));
        words.add(new Word("Palazzo Restaurant", "Biskupská 2"));
        words.add(new Word("KOISHI fish & sushi restaurant", "Údolní 326/112"));
        words.add(new Word("Borgo Agnese", "Kopečná 980/43"));
        words.add(new Word("Annapurna", "Josefská 427/14"));
        words.add(new Word("Restaurace Špalíček", "Zelný trh 332/12"));
        words.add(new Word("PENZION & RESTAURACE ŠVEJK", "Havelkova 112/20"));
        words.add(new Word("GOA", "Geislerova 305/34"));
        words.add(new Word("Výtopna", "Starobrněnská 339/12"));
        words.add(new Word("La Bouchée", "Údolní 567/33"));
        words.add(new Word("INDIAN RESTAURANT BUDDHA", "Náměstí Svobody 92/21"));

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
