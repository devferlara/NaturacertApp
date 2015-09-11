package naturacert.baumsoft.dev.naturacert;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Desarrollador on 7/27/15.
 */
public class ViewPagerAdapterRG extends FragmentStatePagerAdapter {

    private Context context;
    private Fragment fragment;
    private Tab3 t3;
    int formulario;

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapterRG(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb, Context context, int formulario_numero) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
        this.context = context;
        formulario = formulario_numero;
    }


    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        Tab3 fra = new Tab3();
       
        switch (position) {
            case 0:
                fra.enviar("RG1.1", formulario);
                fragment = fra;
                break;
            case 1:
                fra.enviar("RG1.2", formulario);
                fragment = fra;
                break;
            case 2:
                fra.enviar("RG1.3", formulario);
                fragment = fra;
                break;
            case 3:
                fra.enviar("RG1.4", formulario);
                fragment = fra;
                break;
            case 4:
                fra.enviar("RG2.1", formulario);
                fragment = fra;
                break;
            case 5:
                fra.enviar("RG2.2", formulario);
                fragment = fra;
                break;
            case 6:
                fra.enviar("RG2.3", formulario);
                fragment = fra;
                break;
            case 7:
                fra.enviar("RG3.1", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("RG3.2", formulario);
                fragment = fra;
                break;
            case 9:
                fra.enviar("RG3.3", formulario);
                fragment = fra;
                break;
            case 10:
                fra.enviar("RG3.4", formulario);
                fragment = fra;
                break;
            case 11:
                fra.enviar("RG3.5", formulario);
                fragment = fra;
                break;
            case 12:
                fra.enviar("RG3.6", formulario);
                fragment = fra;
                break;
            case 13:
                fra.enviar("RG3.7", formulario);
                fragment = fra;
                break;
            case 14:
                fra.enviar("RG3.8", formulario);
                fragment = fra;
                break;
            case 15:
                fra.enviar("RG3.9", formulario);
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
