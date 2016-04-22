package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.VideosFragment;
import info.androidhive.tabsswipe.BeatsFragment;
import info.androidhive.tabsswipe.GamesFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new GamesFragment();
		case 1:
			// Games fragment activity
			return new VideosFragment();
		case 2:
			// Movies fragment activity
			return new BeatsFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
