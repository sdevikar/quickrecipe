package prototype.recipe.main.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the primary sections of the app.
 */
public class AppSectionsPagerAdapter extends FragmentPagerAdapter {

	public AppSectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		// Right now, all the tabs are of the same type. Therefore, same
		// fragment can be used to represent every tab
		
		Fragment fragment = new DummySectionFragment();
		Bundle args = new Bundle();
		args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i + 1);
		fragment.setArguments(args);

		switch (i) {
		// do nothing for now here.
		}
		
		return fragment;
	}

	@Override
	public int getCount() {
		//sdevikar: this should be read from a service or something. Setting to 5 for now
		return 5;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return "Section " + (position + 1);
	}
}