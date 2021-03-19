package com.example.read.ui.math;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MathViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MathViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is math fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}