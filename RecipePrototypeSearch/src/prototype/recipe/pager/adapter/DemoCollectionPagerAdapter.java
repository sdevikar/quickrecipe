package prototype.recipe.pager.adapter;

import prototype.recipe.main.model.RecipeMainActivity.DemoObjectFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * A {@link android.support.v4.app.FragmentStatePagerAdapter} that returns a
 * fragment representing an object in the collection.
 */
public class DemoCollectionPagerAdapter extends
		FragmentStatePagerAdapter {

	public DemoCollectionPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = new DemoObjectFragment();
		Bundle args = new Bundle();
		args.putInt(DemoObjectFragment.ARG_OBJECT, i + 1); // Our object is
															// just an
															// integer :-P
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public int getCount() {
		// For this contrived example, we have a 100-object collection.
		return 100;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return "OBJECT " + (position + 1);
	}
}