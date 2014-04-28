package com.example.splashscreen;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DemoActivity extends ListActivity {
	final String[] catnames = new String[] { "�������1", "�������2",
			"�������3", "�������4", "�������5", "�������6", "�������7",
			"�������8", "�������9", "�������10", "�������11", "�������12",
			"�������13", "�������14", "�������15", "�������16", "�������17",
			"�������18", "�������19", "�������20", "" };
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(catnames));
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list);
		setListAdapter(adapter);
		setContentView(R.layout.activity_demo);
	}
}
