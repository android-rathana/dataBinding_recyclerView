package com.example.ratha.listviewdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ratha.listviewdatabinding.adapter.PostAdapter;
import com.example.ratha.listviewdatabinding.databinding.ActivityInstagramBinding;
import com.example.ratha.listviewdatabinding.viewmodel.PostViewModel;

import java.util.ArrayList;
import java.util.List;

public class instagramActivity extends AppCompatActivity {

    private ActivityInstagramBinding mInstagramBinding;
    private RecyclerView recyclerView;
    private PostAdapter adapter;
    private List<PostViewModel> list;
    private PostViewModel postViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInstagramBinding= DataBindingUtil.setContentView(this,R.layout.activity_instagram);

        //setup recyclerView
        recyclerView=mInstagramBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new PostAdapter(this,getData());
        recyclerView.setAdapter(adapter);
        adapter.setData(getData());
    }

    private List<PostViewModel> getData(){
        PostViewModel postViewModel=new PostViewModel();
        return postViewModel.getPostViewModels(this);
    }

}
