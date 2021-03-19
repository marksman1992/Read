package com.example.read.ui.reading;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReadingViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ReadingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This Reading fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}