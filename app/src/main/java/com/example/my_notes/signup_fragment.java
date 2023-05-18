package com.example.my_notes;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class signup_fragment extends Fragment {
    private EditText username, pass, cpass, email;
   private Button sigup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_up_fragment,container,false);

        sigup = root.findViewById(R.id.button);
        username = root.findViewById(R.id.username);
        pass = root.findViewById(R.id.pass);
        cpass = root.findViewById(R.id.confirpass);
        email = root.findViewById(R.id.email);



//        sigup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });



        return root;
    }
}
