package com.wiersbitzki.android.agile_tools;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class PlanningPokerActivity extends Activity {

	private static String DIRECTORY = "planningpoker/beige";
	private String[] files;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeActivity();
		setContentView(R.layout.planning_poker);
		showPokercard(0);
	}

	private void initializeActivity() {
		try {
			files = getAssets().list(DIRECTORY);
			Log.d(PlanningPokerActivity.class.getSimpleName(), "found " + files.length + " files");
		} catch (IOException e) {
			e.printStackTrace();
			files = new String[0];
		}
	}

	private void showPokercard(int index) {
		InputStream in;
		ImageView i = (ImageView) findViewById(R.id.imageview_pokercard);
		try {
			in = getAssets().open(DIRECTORY + "/" + files[index]);
			i.setImageDrawable(Drawable.createFromStream(in, null));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
