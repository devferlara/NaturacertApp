package naturacert.baumsoft.dev.naturacert;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapterFlor extends FragmentStatePagerAdapter {
    private Context context;
    private Fragment fragment;
    private Tab5 t5;
    int formulario;

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapterFlor(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb, Context context, int formulario_numero) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
        this.context = context;
        formulario = formulario_numero;
    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {


        Tab5 fra = new Tab5();
        switch (position) {
            case 0:
                fra.enviar("1.1", formulario);
                fragment = fra;
                break;
            case 1:
                fra.enviar("1.2", formulario);
                fragment = fra;
                break;
            case 2:
                fra.enviar("1.3", formulario);
                fragment = fra;
                break;
            case 3:
                fra.enviar("1.4", formulario);
                fragment = fra;
                break;
            case 4:
                fra.enviar("1.5", formulario);
                fragment = fra;
                break;
            case 5:
                fra.enviar("1.6", formulario);
                fragment = fra;
                break;
            case 6:
                fra.enviar("1.7", formulario);
                fragment = fra;
                break;
            case 7:
                fra.enviar("1.8", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;

        }
        return fragment;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }

}