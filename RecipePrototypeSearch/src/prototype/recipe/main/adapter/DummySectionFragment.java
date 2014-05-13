package prototype.recipe.main.adapter;

import prototype.search.recipeprototypesearch.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A dummy fragment representing a section of the app, but that simply displays dummy text.
 */
public class DummySectionFragment extends Fragment {

    public static final String ARG_SECTION_NUMBER = "section_number";
    private TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_section_dummy, container, false);
        Bundle args = getArguments();
        tv = (TextView) rootView.findViewById(android.R.id.text1);
        String appendString = Integer.toString(args.getInt(ARG_SECTION_NUMBER));
        tv.setText(getString(R.string.dummy_section_text)+appendString);
        return rootView;
    }
}