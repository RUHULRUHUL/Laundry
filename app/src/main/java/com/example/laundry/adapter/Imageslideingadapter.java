package com.example.laundry.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.laundry.R;
import com.example.laundry.fragment.HomefragmentFragment;
import com.example.laundry.models.Imageslideitemmodel;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Imageslideingadapter extends RecyclerView.Adapter<Imageslideingadapter.ViewHolder> {
    private Context context;
    private List<Imageslideitemmodel>imagelist;

    public Imageslideingadapter(Context context, List<Imageslideitemmodel> imagelist) {
        this.context = context;
        this.imagelist = imagelist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.item_image_sliding,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.setimage(imagelist.get(position));

    }



    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public Button seeproduct;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageviewid);
        }
        public void setimage(Imageslideitemmodel imageslideitemmodel)
        {
            imageView.setImageResource(imageslideitemmodel.getImage());

        }
    }
}
