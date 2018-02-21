package com.example.ratha.listviewdatabinding.entity;

/**
 * Created by ratha on 2/21/2018.
 */

public class Post {
    public int id;
    public String owner;
    public String content;
    public String like;
    public String location;
    public int profile;
    public int photo;

    public Post(String owner, String content, String like, String location, int profile, int photo) {
        this.owner = owner;
        this.content = content;
        this.like = like;
        this.location = location;
        this.profile = profile;
        this.photo = photo;
    }
}
