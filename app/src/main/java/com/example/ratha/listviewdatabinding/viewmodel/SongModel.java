package com.example.ratha.listviewdatabinding.viewmodel;

import com.example.ratha.listviewdatabinding.entity.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratha on 2/20/2018.
 */

public class SongModel {
    private String title;
    private String desc;

    private List<SongModel> songs;
    public SongModel(){}
    public SongModel(Song song){
        this.title=song.title;
        this.desc=song.desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //get data from memory or remote
    public List<SongModel> getSongs(){
        List<SongModel> songList =new ArrayList<>();
        for(int i=0;i<40 ;i++){
            songList.add(new SongModel(new Song("song "+i,"Samsung Galaxy S7 Glass Frame Backcover repair."+i)));
        }
        return songList;
    }


}
