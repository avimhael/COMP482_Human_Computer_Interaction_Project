// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Drinks Fragment - displays all the drinks options to the user. imageView, the top left item in the centre panel, can be clicked on to view the DrinksOptions dialog fragment

package com.burger.crave;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class DrinksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drinks, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _helpBtn = view.findViewById(R.id.drinksHelp);
        Button _cancel = view.findViewById(R.id.drinksCancel);
        Button _checkout = view.findViewById(R.id.drinksCheckout);
        ImageButton _home = view.findViewById(R.id.drinksLogo);
        ImageButton _drinksEx = view.findViewById(R.id.imageView);

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_drinksFragment_to_helpFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_drinksFragment_to_welcomeFragment);
            }
        });

        _home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_drinksFragment_to_homeFragment);
            }
        });

        _checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_drinksFragment_to_reviewFragment);
            }
        });

        _drinksEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrinksOptionsFragment DrinksOptionsFragment = new DrinksOptionsFragment();
                DrinksOptionsFragment.show(getFragmentManager(),"My Frag1");
            }
        });
    }
}
