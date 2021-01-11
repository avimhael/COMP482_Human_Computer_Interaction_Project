// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Review Fragment - customers will review the items in their cart

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

public class ReviewFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_review, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _helpBtn = view.findViewById(R.id.reviewHelp);
        Button _cancel = view.findViewById(R.id.reviewCancel);
        Button _revPay = view.findViewById(R.id.reviewPay);
        ImageButton _home = view.findViewById(R.id.reviewLogo);

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_reviewFragment_to_helpFragment);
            }
        });

        _home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_reviewFragment_to_homeFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_reviewFragment_to_welcomeFragment);
            }
        });

        _revPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_reviewFragment_to_pay1Fragment);
            }
        });



    }
}
