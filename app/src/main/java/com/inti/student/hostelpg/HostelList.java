package com.inti.student.hostelpg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HostelList extends AppCompatActivity {
    ListView l;
    String[] data ={"Golden Triangle", "The Light", "Elite Avenue", "One Imperial"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        l=(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.list,R.id.textView,data);


        l.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long a){
                String id;
                Intent intent = new Intent(HostelList.this, Hostelinfo.class);
                id = l.getItemAtPosition(i).toString();
                intent.putExtra("Name", id);
                startActivity(intent);
            }
        });
        l.setAdapter(adapter);
    }

}
