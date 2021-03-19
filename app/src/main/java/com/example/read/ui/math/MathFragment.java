package com.example.read.ui.math;

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

public class MathFragment extends Fragment {

    private MathViewModel MathViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MathViewModel =
                new ViewModelProvider(this).get(MathViewModel.class);
        View root = inflater.inflate(R.layout.math_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_math);
        MathViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}