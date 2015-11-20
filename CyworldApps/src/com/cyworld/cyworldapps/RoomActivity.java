package com.cyworld.cyworldapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kotaro on 15/11/20.
 */
public class RoomActivity extends Activity{

    Button add;
    Intent intent = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_layout);

        ListView listView = (ListView)findViewById(R.id.list);
        add = (Button)findViewById(R.id.add);
        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        IdeaListAdapter adapter = new IdeaListAdapter(this,0,list);
        listView.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
