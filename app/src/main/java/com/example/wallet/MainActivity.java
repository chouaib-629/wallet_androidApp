package com.example.wallet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallet.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter mAdapter;
    private RecyclerView recycleViewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycleView();
    }

    private void initRecycleView() {
        ArrayList<Contact> contactArrayList = new ArrayList<>();

        contactArrayList.add(new Contact("David", "user_1"));
        contactArrayList.add(new Contact("Mary", "user_2"));
        contactArrayList.add(new Contact("Jack", "user_3"));
        contactArrayList.add(new Contact("Sara", "user_4"));
        contactArrayList.add(new Contact("Rose", "user_5"));

        recycleViewContacts = findViewById(R.id.main_recycleView_contactList);
        recycleViewContacts.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        mAdapter = new ContactAdapter(contactArrayList);
        recycleViewContacts.setAdapter(mAdapter);
    }
}