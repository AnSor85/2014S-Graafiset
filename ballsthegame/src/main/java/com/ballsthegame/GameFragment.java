package com.ballsthegame;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Esa on 19.11.2014.
 * Here we will implement the Game portion of the application.
 */
public class GameFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.w("BallsTheGame", "in GameFragment: onCreateView()");
        View rootView = inflater.inflate(R.layout.fragment_game, container, false);

        return rootView;
    }

}
