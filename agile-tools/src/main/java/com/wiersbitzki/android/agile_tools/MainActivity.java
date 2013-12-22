package com.wiersbitzki.android.agile_tools;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater i = getMenuInflater();
		i.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
			Log.d(MainActivity.class.getSimpleName(), getResources().getResourceName(R.id.action_settings) + " pressed");
			Intent intent = new Intent(this, SettingsActivity.class);
			startActivity(intent);
			return true;
		default:
			// do nothing
		}
		return super.onOptionsItemSelected(item);
	}

	public void openPlanningPoker(View view) {
		Log.d(MainActivity.class.getSimpleName(), getResources().getResourceName(R.id.buttonPlanningPoker) + " pressed");
		Intent intent = new Intent(this, PlanningPokerActivity.class);
		startActivity(intent);
	}

	public void openTimeboxStopWatch(View view) {
		Log.d(MainActivity.class.getSimpleName(), getResources().getResourceName(R.id.buttonTimeboxStopWatch) + " pressed");
		// Intent intent = new Intent(this, TimeboxStopWatchActivity.class);
		// startActivity(intent);
	}
}
