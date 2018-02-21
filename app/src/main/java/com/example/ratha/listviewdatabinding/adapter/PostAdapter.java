package com.example.ratha.listviewdatabinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ratha.listviewdatabinding.R;
import com.example.ratha.listviewdatabinding.databinding.InstagramItemLayoutBinding;
import com.example.ratha.listviewdatabinding.viewmodel.PostViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratha on 2/21/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private Context context;
    private List<PostViewModel> list;
    public PostAdapter(Context context, List<PostViewModel> list){
        this.context=context;this.list=list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
         InstagramItemLayoutBinding mItemBinding= DataBindingUtil.inflate(inflater, R.layout.instagram_item_layout,parent,false);
        return new ViewHolder(mItemBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private InstagramItemLayoutBinding itemLayoutBinding;
        public ViewHolder(InstagramItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());
            this.itemLayoutBinding=itemLayoutBinding;
        }
        public void bind (PostViewModel model){
            this.itemLayoutBinding.setPostItem(model);
        }
        public InstagramItemLayoutBinding getDataBinding(){
            return this.itemLayoutBinding;
        }
    }
}
