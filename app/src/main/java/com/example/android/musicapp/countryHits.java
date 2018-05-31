package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class countryHits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of music
        ArrayList<Hits> music = new ArrayList<Hits>();

        // music.add country music hits
        music.add(new Hits("Meant To Be", "Bebe Rexha & Florida Georgia Line"));
        music.add(new Hits("Heaven", "Kane Brown"));
        music.add(new Hits("One Number Away", "Luke Combs"));
        music.add(new Hits("You Make It Easy", "Jason Aldean"));
        music.add(new Hits("Tequila", "Dan + Shay"));
        music.add(new Hits("For The First Time", "Darius Rucker"));
        music.add(new Hits("Get Along", "Kenny Chesney"));
        music.add(new Hits("I Lived It", "Blake Shelton"));
        music.add(new Hits("Mercy", "Brett Young"));
        music.add(new Hits("Woman, Amen", "Dierks Bentley"));

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