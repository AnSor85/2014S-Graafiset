package com.ballsthegame;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Created by Esa on 19.11.2014.
 */
public class MainMenuFragment extends Fragment{
    private Button newGameButton;
    private OnClickListener onClickListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mainmenu, container, false);


        newGameButton = (Button) rootView.findViewById(R.id.button_newgame);

        // Solve this pls. Does not start the GameFragment as intended
        newGameButton.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                getFragmentManager().beginTransaction()
                        .add(R.id.container, new GameFragment())
                        .commit();
            }
        });


        return rootView;
    }


}
