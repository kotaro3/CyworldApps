package com.cyworld.cyworldapps;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    Intent intent = new Intent();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listview = (ListView)findViewById(R.id.list);
		ArrayList<String> list = new ArrayList<String>();
        Log.d("list", "挿入");

		//testData いらなくなったら消す
		list.add("a");
		list.add("b");
		list.add("c");

        RoomListAdapter adapter = new RoomListAdapter(this,0,list);
        Log.d("list","set");
		listview.setAdapter(adapter);
        Log.d("adapter", "set");

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent.setClassName("com.cyworld.cyworldapps","com.cyworld.cyworldapps.RoomActivity");
				startActivity(intent);
			}
		});


    }
}
