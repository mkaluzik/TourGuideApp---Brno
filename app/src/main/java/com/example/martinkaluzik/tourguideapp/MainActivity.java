package com.example.martinkaluzik.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        LinearLayout atms = (LinearLayout) findViewById(R.id.atms);

        // Set a click listener on that View
        atms.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AtmActivity}
                Intent atmIntent = new Intent(MainActivity.this, AtmActivity.class);

                // Start the new activity
                startActivity(atmIntent);
            }
        });

        // Find the View that shows the family category
        LinearLayout hotels = (LinearLayout) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HotelActivity}
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);

                // Start the new activity
                startActivity(hotelIntent);
            }
        });

        // Find the View that shows the colors category
        LinearLayout restaurants = (LinearLayout) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the phrases category
        LinearLayout sightseeings = (LinearLayout) findViewById(R.id.sightseeings);

        // Set a click listener on that View
        sightseeings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SightseeingActivity}
                Intent sightseeingIntent = new Intent(MainActivity.this, SightseeingActivity.class);

                // Start the new activity
                startActivity(sightseeingIntent);
            }
        });




    }
}
