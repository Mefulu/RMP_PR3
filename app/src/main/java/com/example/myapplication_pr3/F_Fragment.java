package com.example.myapplication_pr3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

public class F_Fragment extends Fragment {
    private final static String TAG = "NW_Tag";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.tt_fragment, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.textViewConstraintLayout);
        textView.setText(getString(R.string.hello_message2));
        ImageView imageView = view.findViewById(R.id.imageViewConstraintLayout);
        imageView.setImageResource(R.drawable.secondimage);
        Button button = view.findViewById(R.id.buttonConstraintLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Кнопка была нажата программно");
            }
        });
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onViewCreated");
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onViewStateRestored");
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onSaveInstanceState");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroyView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
    }
}