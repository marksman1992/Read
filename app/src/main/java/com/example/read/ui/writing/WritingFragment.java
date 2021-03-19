package com.example.read.ui.writing;

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
public class WritingFragment extends Fragment {

    private WritingViewModel WritingViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WritingViewModel =
                new ViewModelProvider(this).get(WritingViewModel.class);
        View root = inflater.inflate(R.layout.writing_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_writing);
        WritingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}