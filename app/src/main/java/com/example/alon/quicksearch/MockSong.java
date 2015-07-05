package com.example.alon.quicksearch;

/**
 * Created by Alon on 05/07/2015.
 */
public class MockSong {
    public String mAlbumCoverPath;
    public int mSongDuration;
    public int mCurrentPlayheadPosition;
    public String mTitle;
    public String mSinger;

    public MockSong(String singer, String title, String path, int songDuration){
        mTitle = title;
        mSinger = singer;
        mAlbumCoverPath = path;
        mSongDuration = songDuration;
        mCurrentPlayheadPosition = 0;
    }
}
