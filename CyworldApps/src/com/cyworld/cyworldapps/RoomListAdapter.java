package com.cyworld.cyworldapps;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kotaro on 15/11/19.
 */
public class RoomListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutinflater;
    List<String> data;

    public RoomListAdapter(Context context,List<String> list) {
        Log.d("constractor", "constractor");
        this.context = context;
        this.data = list;
        layoutinflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO 自動生成されたメソッド・スタブ
        Log.d("get","getCount");
        return 0;
    }

    @Override
    public String getItem(int position) {
        // TODO 自動生成されたメソッド・スタブ
        Log.d("get","getItem");
        return null;
    }


    @Override
    public long getItemId(int position) {
        // TODO 自動生成されたメソッド・スタブ
        Log.d("get", "getItemId");
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("View", "inflate");
        View v = convertView;

        v = layoutinflater.inflate(R.layout.list_layout, parent,true);
        Log.d("View","convertView");

        TextView roomName = (TextView)v.findViewById(R.id.roomName);
        TextView roomCom = (TextView)v.findViewById(R.id.roomCom);

        roomName.setText(data.get(position));
        Log.d("data",data.get(position));
        roomCom.setText("Comment...");

        return v;
    }

}

