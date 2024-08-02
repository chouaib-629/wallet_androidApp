package com.example.wallet.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wallet.Contact;
import com.example.wallet.R;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    ArrayList<Contact> mContacts = new ArrayList<>();

    public ContactAdapter(ArrayList<Contact> contacts) {
        mContacts = contacts;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_viewholder, parent, false);
        return new ContactAdapter.ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        holder.name.setText(mContacts.get(position).getName());

        int drawableResourseID = holder.itemView.getContext().getResources().getIdentifier(mContacts.get(position).getPicturePath(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourseID).into(holder.picture);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.viewHolder_imageView_picture);
            name = itemView.findViewById(R.id.viewHolder_textView_name);
        }
    }
}
