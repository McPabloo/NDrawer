package com.example.ndrawer.ui.rutas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.ndrawer.R;
import com.example.ndrawer.databinding.FragmentRutasBinding;
import com.example.ndrawer.ui.rutasmostrar.Item1Fragment;

public class SlideshowFragment extends Fragment implements View.OnClickListener {

    private FragmentRutasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentRutasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button boton1 = root.findViewById(R.id.button1);
        Button boton2 = root.findViewById(R.id.button2);

        boton1.setOnClickListener(this);
       boton2.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(@NonNull View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.button1:

            case R.id.button2:
                fragment = new Item1Fragment();
                replaceFragment(fragment);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setReorderingAllowed(true);
        transaction.replace(R.id.layout_rutas, someFragment, null);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}