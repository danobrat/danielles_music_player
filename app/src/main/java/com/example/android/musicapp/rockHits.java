package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class rockHits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of music
        ArrayList<Hits> music = new ArrayList<Hits>();

        // music.add rock music hits
        music.add(new Hits("Believer", "Imagine Dragons"));
        music.add(new Hits("Feel It Still", "Portugal, The Man"));
        music.add(new Hits("Sit Next To Me", "Foster The People"));
        music.add(new Hits("Zombie", "Bad Wolves"));
        music.add(new Hits("Say Amen (Saturday Night)", "Panic! At The Disco"));
        music.add(new Hits("Bohemian Rhapsody", "Queen"));
        music.add(new Hits("No Roots", "Alice Merton"));
        music.add(new Hits("Broken", "Lovelytheband"));
        music.add(new Hits("Gone Away", "Five Finger Death Punch"));
        music.add(new Hits("Where You Come From", "Britton Buchanan"));

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