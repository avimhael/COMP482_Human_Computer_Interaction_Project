// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Home Fragment - the hub of the application. Users will choose between four options - sandwiches, drinks, coffees, desserts. Sandwiches and Drinks are able to be viewed currently

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
import android.widget.ImageButton;


public class HomeFragment extends AppCompatDialogFragment {

    public HomeFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        ImageButton _sandwiches = view.findViewById(R.id.burgerMenuNav);
        ImageButton _drinks = view.findViewById(R.id.softDrinkMenuNav);
        Button _help = view.findViewById(R.id.home1Help);
        Button _cancel = view.findViewById(R.id.homeCancel);
        Button _checkout = view.findViewById(R.id.homeCheckout);

        _sandwiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_homeFragment_to_sandwichFragment);
            }
        });

        _drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_homeFragment_to_drinksFragment);
            }
        });

        _help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_homeFragment_to_helpFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_homeFragment_to_welcomeFragment);
            }
        });

        _checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_homeFragment_to_reviewFragment);
            }
        });

    }



}