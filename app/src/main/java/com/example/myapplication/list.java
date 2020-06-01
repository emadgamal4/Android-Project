package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("El Ekhtyar");
        arrayList.add("Al-Nehaya");
        arrayList.add("Al-Prince");
        arrayList.add("B 100 Wish");
        arrayList.add("W Neheb Tany Leh");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(view.getContext() , DeviceDetailActivity4.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent = new Intent(view.getContext() , DeviceDetailActivity2.class);
                    startActivityForResult(intent,1);
                }
                if (position==2){
                    Intent intent = new Intent(view.getContext() , DeviceDetailActivity3.class);
                    startActivityForResult(intent,2);
                }
                if (position==3){
                    Intent intent = new Intent(view.getContext() , DeviceDetailActivity.class);
                    startActivityForResult(intent,3);
                }
                if (position==4){
                    Intent intent = new Intent(view.getContext() , DeviceDetailActivity5.class);
                    startActivityForResult(intent,4);
                }
            }
        }));




    }
    }
