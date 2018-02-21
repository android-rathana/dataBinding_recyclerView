package com.example.ratha.listviewdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.ratha.listviewdatabinding.adapter.SongAdapter;
import com.example.ratha.listviewdatabinding.databinding.ActivityMainBinding;
import com.example.ratha.listviewdatabinding.viewmodel.SongModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mMainBinding;
    private List<SongModel> songs;
    private SongAdapter mSongAdapter;
    private SongModel songModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        //set up Song list
        songModel= new SongModel();
        songs =songModel.getSongs();
        mSongAdapter=new SongAdapter(this,songs);
        mMainBinding.listView.setAdapter(mSongAdapter);

        //set Event to listView
        mMainBinding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, songs.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
