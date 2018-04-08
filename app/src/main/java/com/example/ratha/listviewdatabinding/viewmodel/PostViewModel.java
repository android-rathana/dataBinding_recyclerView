package com.example.ratha.listviewdatabinding.viewmodel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

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
    private ObservableField<Drawable> profile=new ObservableField<>();
    private ObservableField<Drawable> photo=new ObservableField<>();

    private Context context;
    List<PostViewModel> postViewModels;

    public PostViewModel() {}

    public PostViewModel(Context context,Post post){
        this.context=context;
        id=post.id;
        owner=post.owner;
        content=post.content;
        like=post.like;
        location=post.location;
        profile.set(context.getResources().getDrawable(post.profile));
        photo.set(context.getResources().getDrawable(post.photo));

    }

    /*@BindingAdapter({"bind:imageProfile"})
    public static void loadImageProfile(ImageView view ,int resource){
        if(resource!=0)
        view.setImageResource(resource);
        else
            view.setImageResource(R.drawable.alliance_central_park_fountain);
    }*/

    public List<PostViewModel> getPostViewModels(Context context){
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
            list.add(new PostViewModel(context,post));
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

    public ObservableField<Drawable> getProfile() {
        return profile;
    }

    public void setProfile(ObservableField profile) {
        this.profile = profile;
    }

    public ObservableField<Drawable> getPhoto() {
        return photo;
    }

    public void setPhoto(ObservableField photo) {
        this.photo = photo;
    }
}
