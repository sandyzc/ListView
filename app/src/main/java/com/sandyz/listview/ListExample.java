package com.sandyz.listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class ListExample extends AppCompatActivity implements View.OnClickListener{

    Button bt1;
    Button bt2;
    ListView list;
    String[] monthsasend = new String[]{"January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December"};
    String[] monthsdesend = new String[]{"December", "November","October","September","Augest", "July", "June","May","April","March","February","January"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        bt1 = (Button) findViewById(R.id.acend);
        bt2 = (Button) findViewById(R.id.decend);
        list = (ListView) findViewById(R.id.listview);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, monthsasend);
        list.setAdapter(adapter);




    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.decend){

            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, monthsdesend);
            list.setAdapter(adapter2);
        }

        if (v.getId() == R.id.acend){

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, monthsasend);
            list.setAdapter(adapter);

        }



    }
}


