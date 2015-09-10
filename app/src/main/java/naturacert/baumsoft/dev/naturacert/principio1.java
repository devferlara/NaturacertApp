package naturacert.baumsoft.dev.naturacert;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class principio1 extends Fragment {

    ActionBar actionBar;
    Context actividadActual;
    public principio1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState, Context context) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_principio1, container, false);

        ViewPager pager;
        ViewPagerAdapter adapter = null;
        SlidingTabLayout tabs;
        CharSequence Titles[] = {"Principio 1", "Principio 2", "principio 3", "Principio 4", "Principio 5", "Principio 6", "Principio 7", "Principio 8", "Principio 9", "Principio 10"};
        int Numboftabs = 10;

        //adapter = new ViewPagerAdapter(getFragmentManager(), Titles, Numboftabs, getActivity());

        Toast.makeText(getActivity(), "ffer", Toast.LENGTH_SHORT).show();

        /*
        pager = (ViewPager) v.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return R.color.material_blue_grey_950;
            }
        });
        tabs.setViewPager(pager);
        */

        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        actividadActual = activity;
    }


}
