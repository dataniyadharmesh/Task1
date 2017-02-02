package com.dharmesh.task1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by DHARMESH on 02-02-2017.
 */

public class Login_fragment1 extends Fragment {

    public Button b1,b2;
    private  Fragment f2;
    private View view;
    private EditText email,pass;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login, container,false);

        email=(EditText)v.findViewById(R.id.in_email);
        pass=(EditText)v.findViewById(R.id.in_password);

        b1 = (Button)v.findViewById(R.id.btn_login);
        b2 = (Button)v.findViewById(R.id.btn_cancle);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (email.getText().toString().equals("student@vnurture.com")&&
                        pass.getText().toString().equals("student@123")) {

                        f2 = new Login_success();
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.activity_main, f2);
                        ft.addToBackStack(null);
                        ft.commit();
                }



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        return v;
    }
}
