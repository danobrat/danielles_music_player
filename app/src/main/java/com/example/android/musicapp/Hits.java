package com.example.android.musicapp;

/**
 * Hits class contains the song title and artist name
 **/

public class Hits {

    /**
     * song title
     **/
    private String mSongTitle;

    /**
     * artist name
     **/
    private String mArtistName;

    /**
     * create a new Hits object
     **/
    public Hits(String songTitle, String artistName) {
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /**
     * get the song title
     **/
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * get the artist name
     **/
    public String getArtistName() {
        return mArtistName;
    }
}
