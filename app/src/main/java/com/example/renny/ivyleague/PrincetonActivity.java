package com.example.renny.ivyleague;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PrincetonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_princeton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.princeton, menu);
		return true;
	}

}
