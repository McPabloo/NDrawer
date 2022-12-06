package com.example.ndrawer.ui.monedero;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentComprarBinding;

public class comprar extends Fragment {

    private FragmentComprarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ComprarViewModel galleryViewModel =
                new ViewModelProvider(this).get(ComprarViewModel.class);

        binding = FragmentComprarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}