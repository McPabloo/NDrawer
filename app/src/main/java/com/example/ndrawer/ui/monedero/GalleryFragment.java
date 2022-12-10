package com.example.ndrawer.ui.monedero;

import android.content.Intent;
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
import com.example.ndrawer.databinding.FragmentMonederoBinding;
import com.example.ndrawer.ui.PagoFActivity;
import com.example.ndrawer.ui.rutasmostrar.Item1Fragment;

public class GalleryFragment extends Fragment implements View.OnClickListener {

    private FragmentMonederoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentMonederoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        Button boton1 = root.findViewById(R.id.botonpagar);
        Button boton2 = root.findViewById(R.id.buttoncomprar);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

        return root;
    }


    public void onClick(@NonNull View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.buttoncomprar:
                Intent intent = new Intent(getActivity(), PagoFActivity.class);
                startActivity(intent);
                break;
            case R.id.botonpagar:
                fragment = new comprar();
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
        transaction.replace(R.id.layout_monedero, someFragment, null);
        transaction.addToBackStack(null);
        transaction.commit();
    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}