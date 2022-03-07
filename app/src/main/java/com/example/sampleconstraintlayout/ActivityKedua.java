package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //deklarasi variabel type data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //hubungkan variable txEmail dan txPassword dgn component textview pd layout
        txEmail = findViewById(R.id.tvEmail);
        txPassword=findViewById(R.id.tvPassword);

        //deklarasi variabel bundle yang akan digunakan untuk mengambil pesan
        //yang akan dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //deklarasi variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dgn kunci "a" dan "b"
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail dan pass ke txPassword
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}