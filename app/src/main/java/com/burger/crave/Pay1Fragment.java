// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Pay1 Fragment -  customers will have the option to pay via cash, debit, or credit

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

public class Pay1Fragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pay1, container, false);
    }

    @Override
    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        Button _helpBtn = view.findViewById(R.id.pay1Help);
        Button _cancel = view.findViewById(R.id.pay1Cancel);
        Button _cash = view.findViewById(R.id.payButton1);
        Button _debit = view.findViewById(R.id.payButton2);
        Button _credit = view.findViewById(R.id.payButton3);

        _helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_pay1Fragment_to_helpFragment);
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_pay1Fragment_to_homeFragment);
            }
        });

        _cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_pay1Fragment_to_seeyaFragment);
            }
        });

        _debit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_pay1Fragment_to_pay2Fragment);
            }
        });

        _credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nav.navigate(R.id.action_pay1Fragment_to_pay2Fragment);
            }
        });


    }
}


