package com.example.ndrawer.ui.usuario;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentMonederoBinding;
import com.example.ndrawer.databinding.FragmentUsuarioBinding;
import com.example.ndrawer.ui.monedero.GalleryViewModel;

public class UsuarioFragment extends Fragment {

    public static UsuarioFragment newInstance() {
        return new UsuarioFragment();
    }

    private FragmentUsuarioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UsuarioViewModel galleryViewModel =
                new ViewModelProvider(this).get(UsuarioViewModel.class);

        binding = FragmentUsuarioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}