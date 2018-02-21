package com.example.ratha.listviewdatabinding.viewmodel;

import com.example.ratha.listviewdatabinding.R;
import com.example.ratha.listviewdatabinding.entity.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratha on 2/21/2018.
 */

public class PostViewModel {
    private int id;
    private String owner;
    private String content;
    private String like;
    private String location;
    private int profile;
    private int photo;

    List<PostViewModel> postViewModels;

    public PostViewModel() {}

    public PostViewModel(Post post){
        id=post.id;
        owner=post.owner;
        content=post.content;
        like=post.like;
        location=post.location;
        profile=post.profile;
        photo=post.photo;
    }

    public List<PostViewModel> getPostViewModels(){
        List<PostViewModel> list=new ArrayList<>();
        for(int i=0;i<50;i++){

            Post post=new Post(
                "__mechael__jackson",
                    "_________"+i,
                    "1,000 likes",
                    "Phnom Penh",
                    R.drawable.profile,
                    R.drawable.alliance_central_park_fountain
            );
            list.add(new PostViewModel(post));
        }

        return list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
