package com.example.renan.sib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class login_user extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
    }

    public void loginUser(View view) {
        TextView loginUs = (TextView) findViewById(R.id.loginUs);
        TextView passwordUs = (TextView) findViewById(R.id.passwordUs);
        String user = loginUs.getText().toString();
        String pass = passwordUs.getText().toString();

        if (user.equals("renan") && pass.equals("guilherme")) {
            alert("Logado");

            Intent novaTela = new Intent(this, menu_user.class);
            startActivity(novaTela);
        }else{
            alert("Não queremos você");
        }
    }
    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }


}
