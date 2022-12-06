package com.example.ndrawer.ui.login;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ndrawer.LoginActivity;
import com.example.ndrawer.MainActivity;
import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentLoginBinding;
import com.example.ndrawer.ui.monedero.GalleryFragment;
import com.example.ndrawer.ui.usuario.HomeFragment;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LoginViewModel galleryViewModel =
                new ViewModelProvider(this).get(LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button boton1 = root.findViewById(R.id.btnlogin);
        Button boton2 = root.findViewById(R.id.btnregister);


        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment frag = new RegistroFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.loglayout, frag);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}