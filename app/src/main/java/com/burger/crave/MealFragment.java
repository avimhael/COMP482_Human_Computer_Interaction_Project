// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Meal Fragment - not linked through application yet. Will allow users to add items to their chosen item and make it a combo

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

public class MealFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _helpBtn = view.findViewById(R.id.mealHelp);
        Button _cancel = view.findViewById(R.id.mealCancel);
        Button _checkout = view.findViewById(R.id.mealCheckout);
        ImageButton _home = view.findViewById(R.id.mealLogo);

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_mealFragment_to_helpFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_mealFragment_to_welcomeFragment);
            }
        });

        _checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_mealFragment_to_reviewFragment);
            }
        });

        _checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_mealFragment_to_homeFragment);
            }
        });

    }
}
