package com.cyworld.cyworldapps;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

@SuppressLint("ViewHolder")
public class RoomListAdapter extends BaseAdapter{

	Context context;
	LayoutInflater layoutinflater = null;
	ArrayList<String> data;

	public RoomListAdapter(Context context) {
		this.context = context;
		this.layoutinflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	//list取得
	public void setList(ArrayList<String> data){
		this.data = data;
	}

	@Override
	public int getCount() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = layoutinflater.inflate(R.layout.list_layout,parent,false);
//		TextView roomName = (TextView)convertView.findViewById(R.id.roomName);
//		TextView roomCom = (TextView)convertView.findViewById(R.id.roomCom);
//		roomName.setText(data.get(position));
//		roomCom.setText("Comment...");

		return convertView;
	}

}
