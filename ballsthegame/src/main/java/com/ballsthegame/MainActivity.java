package com.ballsthegame;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

/**
 * Created by Esa on 19.11.2014.
 * MainActivity is used only to create fragments and to transfer data between them.
 */

public class MainActivity extends Activity implements MainMenuFragment.ButtonListener{

    Fragment mainMenuFragment = new MainMenuFragment();
    Fragment gameFragment = new GameFragment();
    FragmentManager fm = getFragmentManager();
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("BallsTheGame", "in MainActivity: onCreate()");

        if (savedInstanceState == null) {

            ft = fm.beginTransaction();
            ft.add(R.id.container, mainMenuFragment);
            ft.commit();
        }
    }

    public void onStartNewGame(){

        Log.w("BallsTheGame", "in MainActivity: onStartNewGame()");

        if(!gameFragment.isAdded())
        {
            setContentView(R.layout.activity_main);
            ft = fm.beginTransaction ();
            ft.replace(R.id.container, gameFragment);
            ft.addToBackStack(null);
            ft.commit();
        }

    }

}
