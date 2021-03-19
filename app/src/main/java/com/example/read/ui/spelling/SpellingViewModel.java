package com.example.read.ui.spelling;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpellingViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SpellingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Spelling fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}