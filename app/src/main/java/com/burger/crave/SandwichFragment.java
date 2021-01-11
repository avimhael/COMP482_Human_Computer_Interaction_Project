// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Sandwich Fragment - displays all the sandwich options to the user. imageButton1, the top left item in the centre panel, can be clicked on to view the BurgerOptions dialog fragment

package com.burger.crave;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
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
import android.widget.Toast;


public class SandwichFragment extends AppCompatDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sandwich, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _helpBtn = view.findViewById(R.id.sandwichHelp);
        Button _cancel = view.findViewById(R.id.sandwichCancel);
        Button _checkout = view.findViewById(R.id.sandwichCheckout);
        ImageButton _home = view.findViewById(R.id.sandwichLogo);
        ImageButton _burgEx = view.findViewById(R.id.imageButton1);

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_sandwichFragment_to_helpFragment);
            }
        });

        _home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_sandwichFragment_to_homeFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_sandwichFragment_to_welcomeFragment);
            }
        });

        _checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_sandwichFragment_to_reviewFragment);
            }
        });

        _burgEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BurgerOptionsFragment BurgerOptionsFragment = new BurgerOptionsFragment();
                BurgerOptionsFragment.show(getFragmentManager(),"My Frag");
            }
        });
    }
}