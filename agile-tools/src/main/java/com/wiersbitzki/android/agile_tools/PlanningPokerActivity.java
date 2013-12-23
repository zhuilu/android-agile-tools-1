package com.wiersbitzki.android.agile_tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PlanningPokerActivity extends Activity {

	private static String DIRECTORY = "planningpoker/beige";
	private List<String> files;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.planning_poker);

		try {
			files = Arrays.asList(getAssets().list(DIRECTORY));
			Log.d(PlanningPokerActivity.class.getSimpleName(), "found " + files.size() + " files");
			Collections.sort(files);
		} catch (IOException e) {
			e.printStackTrace();
			files = new LinkedList<String>();
		}
		ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
		ImagePagerAdapter adapter = new ImagePagerAdapter();
		viewPager.setAdapter(adapter);
	}

	private class ImagePagerAdapter extends PagerAdapter {

		private List<Drawable> pokercards = new ArrayList<Drawable>(files.size());

		public ImagePagerAdapter() {
			InputStream in;
			for (String file : files) {
				try {
					in = getAssets().open(DIRECTORY + "/" + file);
					pokercards.add(Drawable.createFromStream(in, null));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public int getCount() {
			return pokercards.size();
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == ((ImageView) object);
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			Context context = PlanningPokerActivity.this;
			ImageView imageView = new ImageView(context);
			int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
			imageView.setPadding(padding, padding, padding, padding);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setImageDrawable(pokercards.get(position));
			((ViewPager) container).addView(imageView, 0);
			return imageView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager) container).removeView((ImageView) object);
		}
	}
}
