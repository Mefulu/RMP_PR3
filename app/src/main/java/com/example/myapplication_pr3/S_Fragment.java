package com.example.myapplication_pr3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication_pr3.databinding.SFragmentBinding;

public class S_Fragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .add(R.id.fragment_container, T_Fragment.class, null).commit();
            getChildFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .add(R.id.fragment_container_2, TT_Fragment.class, null).commit();
        }
    }   
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SFragmentBinding binding = SFragmentBinding.inflate(inflater, container, false);
        getChildFragmentManager()
                .setFragmentResultListener("requestKey", this, ((requestKey, result) -> {
                    binding.textView.setText(result.getString("bundleKey"));
                }));
        return binding.getRoot();
    }
}