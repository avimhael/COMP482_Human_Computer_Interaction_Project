// Matt Ward 3490185
// Athabasca University COMP 482 Human Computer Interaction
// Seeya Fragment - last screen the user sees, gives them a friendly message to come back soon

package com.burger.crave;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SeeyaFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_seeya, container, false);
    }

}