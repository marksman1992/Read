package com.example.read.ui.data;

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

public class DataFragment extends Fragment {

    private DataViewModel DataViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DataViewModel =
                new ViewModelProvider(this).get(DataViewModel.class);
        View root = inflater.inflate(R.layout.data_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_data);
        DataViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}