package com.example.ndrawer.ui.login;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentMonederoBinding;
import com.example.ndrawer.databinding.FragmentRegistroBinding;
import com.example.ndrawer.ui.monedero.GalleryViewModel;

public class RegistroFragment extends Fragment {

    private FragmentRegistroBinding binding;

    public static RegistroFragment newInstance() {
        return new RegistroFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        RegistroViewModel galleryViewModel =
                new ViewModelProvider(this).get(RegistroViewModel.class);

        binding = FragmentRegistroBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}