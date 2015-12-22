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

    String[] titulos = {
            "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9",
            "2.1", "2.2", "2.3", "2.4", "2.5", "2.6", "2.7", "2.8", "2.9", "2.10", "2.11", "2.12", "2.13", "2.14", "2.15", "2.16", "2.17", "2.18", "2.19", "2.20", "2.21", "2.22", "2.23", "2.24",
            "3.1", "3.2", "3.3", "3.4",
            "4.1", "4.2", "4.3", "4.4", "4.5",
            "5.1", "5.2", "5.3", "5.4", "5.5", "5.6", "5.7", "5.8", "5.9", "5.10", "5.11", "5.12", "5.13", "5.14", "5.15", "5.16", "5.17", "5.18", "5.19", "5.20", "5.21", "5.22", "5.23", "5.24", "5.25", "5.26",
            "6.1", "6.2", "6.3", "6.4", "6.5", "6.6", "6.7", "6.8", "6.9", "6.10", "6.11", "6.12",
            "7.1", "7.2", "7.3", "7.4", "7.5", "7.6", "7.7", "7.8", "7.9", "7.10", "7.11", "7.12", "7.13", "7.14", "7.15", "7.16", "7.17",
            "8.1", "8.2", "8.3", "8.4", "8.5", "8.6", "8.7", "8.8", "8.9", "8.10", "8.11", "8.12", "8.13", "8.14", "8.15", "8.16", "8.17", "8.18", "8.19", "8.20", "8.21", "8.22", "8.23", "8.24", "8.25", "8.26", "8.27", "8.28", "8.29", "8.30", "8.31",
            "9.1", "9.2", "9.3", "9.4", "9.5", "9.6", "9.7", "9.8", "9.9", "9.10", "9.11", "9.12", "9.13", "9.14", "9.15", "9.16", "9.17", "9.18", "9.19",
            "10.1", "10.2", "10.3", "10.4", "10.5", "10.6", "10.7", "10.8", "10.9", "10.10", "10.11", "10.12", "10.13",
            "11.1", "11.2", "11.3", "11.4", "11.5", "11.6",
            "12.1", "12.2", "12.3", "12.4", "12.5", "12.6", "12.7", "12.8", "12.9",
            "13.1", "13.2", "13.3", "13.4", "13.5", "13.6", "13.7", "13.8", "13.9",
            "14.1", "14.2", "14.3", "14.4",
            "15.1", "15.2",
    };


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
        String value = titulos[position];
        fra.enviar(value, formulario);
        fragment = fra;

        /*
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
            case 9:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 10:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 11:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 12:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 13:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 14:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 15:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 16:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 17:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 18:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 19:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 20:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 21:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 22:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 23:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 24:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 25:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 26:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 27:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 28:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 29:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 30:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 31:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 32:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 33:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 34:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 35:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 36:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 37:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 38:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 39:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 40:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 41:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 42:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 43:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 44:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 45:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 46:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 47:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 48:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;
            case 8:
                fra.enviar("1.9", formulario);
                fragment = fra;
                break;


        }
        */
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