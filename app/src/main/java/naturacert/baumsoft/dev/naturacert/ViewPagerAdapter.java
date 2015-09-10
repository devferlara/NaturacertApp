package naturacert.baumsoft.dev.naturacert;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp1 on 21-01-2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    private Fragment fragment;
    private Tab3 t3;
    int formulario;

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb, Context context, int formulario_numero) {
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
                fra.enviar("1.10", formulario);
                fragment = fra;
                break;
            case 10:
                fra.enviar("1.11", formulario);
                fragment = fra;
                break;
            case 11:
                fra.enviar("2.1", formulario);
                fragment = fra;
                break;
            case 12:
                fra.enviar("2.2", formulario);
                fragment = fra;
                break;
            case 13:
                fra.enviar("2.3", formulario);
                fragment = fra;
                break;
            case 14:
                fra.enviar("2.4", formulario);
                fragment = fra;
                break;
            case 15:
                fra.enviar("2.5", formulario);
                fragment = fra;
                break;
            case 16:
                fra.enviar("2.6", formulario);
                fragment = fra;
                break;
            case 17:
                fra.enviar("2.7", formulario);
                fragment = fra;
                break;
            case 18:
                fra.enviar("2.8", formulario);
                fragment = fra;
                break;
            case 19:
                fra.enviar("2.9", formulario);
                fragment = fra;
                break;
            case 20:
                fra.enviar("3.1", formulario);
                fragment = fra;
                break;
            case 21:
                fra.enviar("3.2", formulario);
                fragment = fra;
                break;
            case 22:
                fra.enviar("3.3", formulario);
                fragment = fra;
                break;
            case 23:
                fra.enviar("3.4", formulario);
                fragment = fra;
                break;
            case 24:
                fra.enviar("3.5", formulario);
                fragment = fra;
                break;
            case 25:
                fra.enviar("3.6", formulario);
                fragment = fra;
                break;
            case 26:
                fra.enviar("4.1", formulario);
                fragment = fra;
                break;
            case 27:
                fra.enviar("4.2", formulario);
                fragment = fra;
                break;
            case 28:
                fra.enviar("4.3", formulario);
                fragment = fra;
                break;
            case 29:
                fra.enviar("4.4", formulario);
                fragment = fra;
                break;
            case 30:
                fra.enviar("4.5", formulario);
                fragment = fra;
                break;
            case 31:
                fra.enviar("4.6", formulario);
                fragment = fra;
                break;
            case 32:
                fra.enviar("4.7", formulario);
                fragment = fra;
                break;
            case 33:
                fra.enviar("4.8", formulario);
                fragment = fra;
                break;
            case 34:
                fra.enviar("4.9", formulario);
                fragment = fra;
                break;
            case 35:
                fra.enviar("5.1", formulario);
                fragment = fra;
                break;
            case 36:
                fra.enviar("5.2", formulario);
                fragment = fra;
                break;
            case 37:
                fra.enviar("5.3", formulario);
                fragment = fra;
                break;
            case 38:
                fra.enviar("5.4", formulario);
                fragment = fra;
                break;
            case 39:
                fra.enviar("5.5", formulario);
                fragment = fra;
                break;
            case 40:
                fra.enviar("5.6", formulario);
                fragment = fra;
                break;
            case 41:
                fra.enviar("5.7", formulario);
                fragment = fra;
                break;
            case 42:
                fra.enviar("5.8", formulario);
                fragment = fra;
                break;
            case 43:
                fra.enviar("5.9", formulario);
                fragment = fra;
                break;
            case 44:
                fra.enviar("5.10", formulario);
                fragment = fra;
                break;
            case 45:
                fra.enviar("5.11", formulario);
                fragment = fra;
                break;
            case 46:
                fra.enviar("5.12", formulario);
                fragment = fra;
                break;
            case 47:
                fra.enviar("5.13", formulario);
                fragment = fra;
                break;
            case 48:
                fra.enviar("5.14", formulario);
                fragment = fra;
                break;
            case 49:
                fra.enviar("5.15", formulario);
                fragment = fra;
                break;
            case 50:
                fra.enviar("5.16", formulario);
                fragment = fra;
                break;
            case 51:
                fra.enviar("5.17", formulario);
                fragment = fra;
                break;
            case 52:
                fra.enviar("5.18", formulario);
                fragment = fra;
                break;
            case 53:
                fra.enviar("5.19", formulario);
                fragment = fra;
                break;
            case 54:
                fra.enviar("6.1", formulario);
                fragment = fra;
                break;
            case 55:
                fra.enviar("6.2", formulario);
                fragment = fra;
                break;
            case 56:
                fra.enviar("6.3", formulario);
                fragment = fra;
                break;
            case 57:
                fra.enviar("6.4", formulario);
                fragment = fra;
                break;
            case 58:
                fra.enviar("6.5", formulario);
                fragment = fra;
                break;
            case 59:
                fra.enviar("6.6", formulario);
                fragment = fra;
                break;
            case 60:
                fra.enviar("6.7", formulario);
                fragment = fra;
                break;
            case 61:
                fra.enviar("6.8", formulario);
                fragment = fra;
                break;
            case 62:
                fra.enviar("6.9", formulario);
                fragment = fra;
                break;
            case 63:
                fra.enviar("6.10", formulario);
                fragment = fra;
                break;
            case 64:
                fra.enviar("6.11", formulario);
                fragment = fra;
                break;
            case 65:
                fra.enviar("6.12", formulario);
                fragment = fra;
                break;

            case 66:
                fra.enviar("6.13", formulario);
                fragment = fra;
                break;
            case 67:
                fra.enviar("6.14", formulario);
                fragment = fra;
                break;
            case 68:
                fra.enviar("6.15", formulario);
                fragment = fra;
                break;
            case 69:
                fra.enviar("6.16", formulario);
                fragment = fra;
                break;
            case 70:
                fra.enviar("6.17", formulario);
                fragment = fra;
                break;
            case 71:
                fra.enviar("6.18", formulario);
                fragment = fra;
                break;
            case 72:
                fra.enviar("6.19", formulario);
                fragment = fra;
                break;
            case 73:
                fra.enviar("6.20", formulario);
                fragment = fra;
                break;
            case 74:
                fra.enviar("7.1", formulario);
                fragment = fra;
                break;
            case 75:
                fra.enviar("7.2", formulario);
                fragment = fra;
                break;
            case 76:
                fra.enviar("7.3", formulario);
                fragment = fra;
                break;
            case 77:
                fra.enviar("7.4", formulario);
                fragment = fra;
                break;
            case 78:
                fra.enviar("7.5", formulario);
                fragment = fra;
                break;
            case 79:
                fra.enviar("7.6", formulario);
                fragment = fra;
                break;
            case 80:
                fra.enviar("8.1", formulario);
                fragment = fra;
                break;
            case 81:
                fra.enviar("8.2", formulario);
                fragment = fra;
                break;
            case 82:
                fra.enviar("8.3", formulario);
                fragment = fra;
                break;
            case 83:
                fra.enviar("8.4", formulario);
                fragment = fra;
                break;
            case 84:
                fra.enviar("8.5", formulario);
                fragment = fra;
                break;
            case 85:
                fra.enviar("8.6", formulario);
                fragment = fra;
                break;
            case 86:
                fra.enviar("8.7", formulario);
                fragment = fra;
                break;
            case 87:
                fra.enviar("8.8", formulario);
                fragment = fra;
                break;
            case 88:
                fra.enviar("8.9", formulario);
                fragment = fra;
                break;
            case 89:
                fra.enviar("9.1", formulario);
                fragment = fra;
                break;
            case 90:
                fra.enviar("9.2", formulario);
                fragment = fra;
                break;
            case 91:
                fra.enviar("9.3", formulario);
                fragment = fra;
                break;
            case 92:
                fra.enviar("9.4", formulario);
                fragment = fra;
                break;
            case 93:
                fra.enviar("9.5", formulario);
                fragment = fra;
                break;
            case 94:
                fra.enviar("10.1", formulario);
                fragment = fra;
                break;
            case 95:
                fra.enviar("10.2", formulario);
                fragment = fra;
                break;
            case 96:
                fra.enviar("10.3", formulario);
                fragment = fra;
                break;
            case 97:
                fra.enviar("10.4", formulario);
                fragment = fra;
                break;
            case 98:
                fra.enviar("10.5", formulario);
                fragment = fra;
                break;
            case 99:
                fra.enviar("10.6", formulario);
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