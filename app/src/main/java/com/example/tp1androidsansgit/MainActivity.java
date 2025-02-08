package com.example.tp1androidsansgit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private Button changeLanguageButton;
    private String currentLanguage = "fr"; // Langue par défaut


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button submit = (Button) findViewById(R.id.button);

        Button changeLanguageButton = (Button) findViewById(R.id.changel);



        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("ONCLICK1", "submit");
                Intent intent = new Intent(MainActivity.this, ConfirmData.class);
                intent.putExtra("data", CollectDat());
                Log.d("ONCLICK2","submit avant start");
                startActivity(intent);
            }
        });

        changeLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage();
            }
        });

    }

    private void changeLanguage() {
        // Inverse la langue actuelle
        if (currentLanguage.equals("en")) {
            currentLanguage = "fr";
        } else {
            currentLanguage = "en";
        }
        // Met à jour la locale
        setLocale(this, currentLanguage);
        // Recrée l'activité pour appliquer les changements de langue
        recreate();
    }

    private void setLocale(Context context, String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Configuration config = new Configuration(context.getResources().getConfiguration());
        config.setLocale(locale);
        context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
    }

    private ArrayList<String> CollectDat(){
        Log.d("DATA1", "Collecting Data");
        EditText nom = findViewById(R.id.Namefield);
        EditText prenom = findViewById(R.id.FirstNamefield);
        EditText tel = findViewById(R.id.Phonefield);
        EditText age = findViewById(R.id.Agefield);
        Log.d("DATA2", "Data fetched");

        ArrayList<String> listdata = new ArrayList<String>();
        listdata.add(nom.getText().toString());
        listdata.add(prenom.getText().toString());
        listdata.add(tel.getText().toString());
        listdata.add(age.getText().toString());
        Log.d("DATA3", "Array created");

        return listdata;
    }


}