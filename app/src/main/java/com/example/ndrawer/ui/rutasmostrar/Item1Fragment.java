package com.example.ndrawer.ui.rutasmostrar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ndrawer.databinding.FragmentItem1Binding;

public class Item1Fragment extends Fragment {

    private FragmentItem1Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        com.example.ndrawer.ui.rutasmostrar.Item1ViewModel item1ViewModel =
                new ViewModelProvider(this).get(com.example.ndrawer.ui.rutasmostrar.Item1ViewModel.class);

        binding = FragmentItem1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}