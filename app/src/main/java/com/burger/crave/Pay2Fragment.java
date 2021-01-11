// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Pay2 Fragment - Customers will be directed to proceed to counter or pay with card via terminal

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

public class Pay2Fragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pay2, container, false);
    }

        @Override
        public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState){
            super.onViewCreated(view, savedInstanceState);
            NavController nav = Navigation.findNavController(view);

            Button _helpBtn = view.findViewById(R.id.pay2Help);
            Button _cancel = view.findViewById(R.id.pay2Return);

            _helpBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nav.navigate(R.id.action_pay2Fragment_to_helpFragment);
                }
            });

            _cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nav.navigate(R.id.action_pay2Fragment_to_homeFragment);
                }
            });


        }
    }

