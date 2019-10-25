package com.example.renny.ivyleague;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PennsylvaniaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pennsylvania);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pennsylvania, menu);
		return true;
	}

}
