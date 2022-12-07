package com.example.ndrawer.ui.monedero;

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

import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentComprarBinding;
import com.example.ndrawer.databinding.FragmentMonederoBinding;
import com.example.ndrawer.databinding.FragmentPagoBinding;

public class PagoFragment extends Fragment implements View.OnClickListener {

    private FragmentPagoBinding binding;

    public static PagoFragment newInstance() {
        return new PagoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentPagoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button boton1 = root.findViewById(R.id.btnfinalizar);
        boton1.setOnClickListener(this);

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.btnfinalizar:
                fragment = new GalleryFragment();
                replaceFragment(fragment);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setReorderingAllowed(true);
        transaction.replace(R.id.layout_monedero, someFragment, null);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}