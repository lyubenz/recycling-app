package com.example.android.tflitecamerademo;


import android.os.Bundle;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.example.com.tflitecamerademo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MaterialsFragment extends Fragment {


    public MaterialsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materials, container, false);
    }

}
