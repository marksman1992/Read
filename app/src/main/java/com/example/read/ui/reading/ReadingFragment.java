package com.example.read.ui.reading;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.read.R;
import com.example.read.ui.writing.WritingViewModel;

public class ReadingFragment extends Fragment {

    private ReadingViewModel ReadingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ReadingViewModel =
                new ViewModelProvider(this).get(ReadingViewModel.class);
        View root = inflater.inflate(R.layout.reading_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_reading);
        ReadingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}