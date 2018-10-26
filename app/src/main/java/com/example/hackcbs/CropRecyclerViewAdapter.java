package com.example.hackcbs;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CropRecyclerViewAdapter extends RecyclerView.Adapter<CropRecyclerViewAdapter.MyViewHolder> {

        CardView cardView;
    private Crop[] presentCrops;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        CardView cardView;
        ImageView cropPhotoImageView;
        TextView cropNameTextView;
        public MyViewHolder(CardView v) {
            super(v);
            cardView = v;
            this.cropPhotoImageView = (ImageView)v.findViewById(R.id.crop_photo);
            this.cropNameTextView = (TextView)v.findViewById(R.id.crop_name);
        }
    }

    public CropRecyclerViewAdapter(Crop[] presentCrops) {
        this.presentCrops = presentCrops;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView cropCardView = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.crop_cardview, viewGroup, false);
        MyViewHolder vh = new MyViewHolder(cropCardView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int index){
//        TODO correct this image
        myViewHolder.cropPhotoImageView.setImageBitmap(BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.wheat));
        myViewHolder.cropNameTextView.setText(presentCrops[index].getName());
    }

    @Override
    public int getItemCount() {
        return presentCrops.length;
    }

}
