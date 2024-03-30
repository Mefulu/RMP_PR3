package com.example.myapplication_pr3;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication_pr3.databinding.TtFragmentBinding;

public class TT_Fragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TtFragmentBinding binding = TtFragmentBinding.inflate(getLayoutInflater());

        binding.button.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString("bundleKey", "Результат от последнего фрагмента");
            getParentFragmentManager().setFragmentResult(
                    "requestKey", result);
        });

        return binding.getRoot();
    }
}