package com.example.ratha.listviewdatabinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.ratha.listviewdatabinding.R;
import com.example.ratha.listviewdatabinding.databinding.SongItemLayoutBinding;
import com.example.ratha.listviewdatabinding.viewmodel.SongModel;

import java.util.List;

/**
 * Created by ratha on 2/20/2018.
 */

public class SongAdapter  extends ArrayAdapter<SongModel>{

    private List<SongModel>mSongModel;
    private Context mContext;
    public SongAdapter(@NonNull Context context, List<SongModel> songModels) {
        super(context, R.layout.song_item_layout,songModels);
        this.mSongModel=songModels;
        this.mContext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        SongItemLayoutBinding mSongItem= DataBindingUtil.inflate(inflater,R.layout.song_item_layout,parent,false);

        //set Data to UI component
        mSongItem.setListData(mSongModel.get(position));

        return mSongItem.getRoot();
    }
}
