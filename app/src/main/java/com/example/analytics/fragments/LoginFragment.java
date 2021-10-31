package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.analytics.R;
import com.example.analytics.activitys.PrincipalActivity;
import com.example.analytics.activitys.FragmentsActivity;


public class LoginFragment extends Fragment {
    private Button buttonEntrar, buttonCadastrar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);



        buttonEntrar = view.findViewById(R.id.buttonEntrar);
        buttonCadastrar = view.findViewById(R.id.buttonCadastrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                Intent intent = new Intent(getContext(), PrincipalActivity.class);
                startActivity(intent);
            }
        });
        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                Intent intent = new Intent(getContext(), FragmentsActivity.class);
                intent.putExtra("fragments",2);
                startActivity(intent);
            }
        });


        return view;
    }
}