/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.android.musicapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop music category
        TextView popHits = (TextView) findViewById(R.id.popHits);

        // Set a click listener on that View
        popHits.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the pop hits page
                Intent popHitsIntent = new Intent(MainActivity.this, popHits.class);

                // Start the new activity
                startActivity(popHitsIntent);
            }
        });

        // Find the View that shows the country music category
        TextView countryHits = (TextView) findViewById(R.id.countryHits);

        // Set a click listener on that view
        countryHits.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the country hits page
                Intent countryHitsIntent = new Intent(MainActivity.this, countryHits.class);

                // Start the new activity
                startActivity(countryHitsIntent);
            }
        });

        // Find the View that shows the rock music category
        TextView rockHits = (TextView) findViewById(R.id.rockHits);

        // Set a click listener on that View
        rockHits.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the rock hits page
                Intent rockHitsIntent = new Intent(MainActivity.this, rockHits.class);

                // Start new activity
                startActivity(rockHitsIntent);
            }
        });

    }
}
