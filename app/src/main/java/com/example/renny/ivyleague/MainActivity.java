package com.example.renny.ivyleague;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	static final String[] IVYLEAGUE_UNIVERSITIES = new String[] {
			"Harvard University", 
			"Cornell University", 
			"Yale University",
			"University of Pennsylvania", 
			"Brown University",
			"Columbia University", 
			"Princeton University", 
			"Dartmouth College" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(getListView().getContext(),
				android.R.layout.simple_list_item_1, IVYLEAGUE_UNIVERSITIES);
		getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		getListView().setTextFilterEnabled(true);
        getListView().setAdapter(adapter);
		getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// Implement a switch..case to handle the clicks on the items
				switch(arg2){
				case 0: // open Havard's Activity
					Intent harvardIntent = new Intent(getApplicationContext(), HarvardActivity.class);
					startActivity(harvardIntent);
					break;
				case 1: // open Cornell's Activity
					Intent cornellIntent = new Intent(getApplicationContext(),CornellActivity.class);
					startActivity(cornellIntent);
					break;
				case 2: // open Yale's Activity
					Intent yaleIntent = new Intent(getApplicationContext(),YaleActivity.class);
					startActivity(yaleIntent);
					break;
				case 3: // open Pennsylvania's Activity
					Intent penIntent = new Intent(getApplicationContext(), PennsylvaniaActivity.class);
					startActivity(penIntent);
					break;
				case 4: // open Brown's Activity
					Intent brownIntent = new Intent(getApplicationContext(), BrownActivity.class);
					startActivity(brownIntent);
					break;
				case 5: // open Columbia's Activity
					Intent columbiaIntent = new Intent(getApplicationContext(), ColumbiaActivity.class);
					startActivity(columbiaIntent);
					break;
				case 6: // open Princeton's Activity
					Intent princetonIntent = new Intent(getApplicationContext(), PrincetonActivity.class);
					startActivity(princetonIntent);
					break;
				case 7: // open Dartmouth's Activity
					Intent dartmouthIntent = new Intent(getApplicationContext(), DartmouthActivity.class);
					startActivity(dartmouthIntent);
					break;
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
