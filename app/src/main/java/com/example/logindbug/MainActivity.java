package com.example.logindbug;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewTattoo, textViewStudio, textViewLVL, textViewNXT, textViewLogin;
    EditText editTextUsername, editTextPassword;
    Button buttonGO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Action bar hiding code
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();

        setContentView(R.layout.activity_main);


        textViewTattoo = findViewById(R.id.tvtattoo);
        textViewStudio = findViewById(R.id.tvstudio);
        textViewLVL = findViewById(R.id.tvlvl);
        textViewNXT = findViewById(R.id.tvnxt);
        textViewLogin = findViewById(R.id.tvlogin);


        editTextUsername = findViewById(R.id.etUsernamID);
        editTextPassword = findViewById(R.id.etPass);


        //Custom font Add->
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/poppins_italic.ttf");
        textViewTattoo.setTypeface(customFont);
        textViewLVL.setTypeface(customFont);
        textViewNXT.setTypeface(customFont);
        textViewLogin.setTypeface(customFont);

//set listener
        buttonGO.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = editTextUsername.getText().toString();
        String pass = editTextPassword.getText().toString();
        if (v.getId() == R.id.btnID) {
                if(username.equals("Ratul") && pass.equals("google")){
                    Toast.makeText(this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(this, "Invalid username or Password.", Toast.LENGTH_SHORT).show();
                }
        }

    }
}