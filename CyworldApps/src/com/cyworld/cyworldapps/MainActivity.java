package com.cyworld.cyworldapps;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listview = (ListView)findViewById(android.R.id.list);
		List<String> list = new ArrayList<>();
        Log.d("list","挿入");


//		//testData いらなくなったら消す
		list.add("a");
		list.add("b");
		list.add("c");

//        String[] list = {"aaa"};

        RoomListAdapter adapter = new RoomListAdapter(MainActivity.this,list);
        Log.d("list","set");
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list);
		listview.setAdapter(adapter);
        Log.d("adapter", "set");


    }
}
