package com.example.ndrawer.ui.rutasmostrar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Item1ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Item1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rutasmostrar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}