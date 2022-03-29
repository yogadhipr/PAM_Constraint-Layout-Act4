package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ItemListView extends AppCompatActivity {

    TextView tvnama, tvnotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_view);

        tvnama = findViewById(R.id.TextViewNama);
        tvnotel = findViewById(R.id.TextViewNotel);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "inayah" :
                tvnama.setText("Inayah M");
                tvnotel.setText("082167518");
                break;
            case "ilham" :
                tvnotel.setText("Ilham R");
                tvnama.setText("083172642");
                break;
            case "eris" :
                tvnama.setText("Eris Putri");
                tvnotel.setText("085154721");
                break;
            case "fikri" :
                tvnama.setText("Fikri Zulfikri");
                tvnotel.setText("083156416");
                break;
            case "maul" :
                tvnama.setText("Maulana Hidayah");
                tvnotel.setText("0864567123");
                break;
            case "intan" :
                tvnama.setText("Intan Ramadhani");
                tvnotel.setText("086152417");
                break;
            case "vina" :
                tvnama.setText("Vina Augista");
                tvnotel.setText("087612234");
                break;
            case "gita" :
                tvnama.setText("Gita Maahardika");
                tvnotel.setText("0888124545");
                break;
            case "lutfi" :
                tvnama.setText("Lutfi Rizaldi");
                tvnotel.setText("0865341434");
                break;
            case "gian" :
                tvnama.setText("Gian Zola");
                tvnotel.setText("0882976814");
                break;
        }
    }
}