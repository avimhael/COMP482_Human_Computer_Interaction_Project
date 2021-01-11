// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Welcome Fragment - initial user screen

package com.burger.crave;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class WelcomeFragment extends AppCompatDialogFragment {

    public WelcomeFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _dineInBtn = view.findViewById(R.id.dineInButton);
        Button _takeAwayBtn = view.findViewById(R.id.takeAwayButton);
        Button _helpBtn = view.findViewById(R.id.homeHelp);

        _dineInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_welcomeFragment_to_homeFragment);
            }
        });

        _takeAwayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_welcomeFragment_to_homeFragment);
            }
        });

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_welcomeFragment_to_helpFragment);
            }
        });

    }



}