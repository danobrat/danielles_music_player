package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class popHits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of music
        ArrayList<Hits> music = new ArrayList<Hits>();

        // music.add  Pop song hit list
        music.add(new Hits("Whatever It Takes", "Imagine Dragons"));
        music.add(new Hits("Psycho", "Post Malone Featuring Ty Dolla $ign"));
        music.add(new Hits("Wait", "Maroon 5"));
        music.add(new Hits("Mine", "Bazzi"));
        music.add(new Hits("God's Plan", "Drake"));
        music.add(new Hits("Pray For Me", "The Weekend & Kendrick Lamar"));
        music.add(new Hits("No Tears Left To Cry", "Ariana Grande"));
        music.add(new Hits("In My Blood", "Shawn Mendes"));
        music.add(new Hits("New Rules", "Dua Lipa"));

        hitsAdapter adapter = new hitsAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}