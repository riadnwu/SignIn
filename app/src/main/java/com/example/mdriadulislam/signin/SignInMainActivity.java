package com.example.mdriadulislam.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInMainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userEditText,passEditText;
    Button signInButton;
    TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_main);
        userEditText=findViewById(R.id.user);
        passEditText=findViewById(R.id.pass);
        signInButton=findViewById(R.id.signinButton);
        showText=findViewById(R.id.show);
        signInButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
      if (view.getId() == R.id.signinButton)
      {
          String data=userEditText.getText().toString();
          data=data+"\n"+passEditText.getText().toString();
          showText.setText(data);
      }
    }
}
