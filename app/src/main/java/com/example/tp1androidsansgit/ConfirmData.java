package com.example.tp1androidsansgit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

public class ConfirmData extends AppCompatActivity {

    private ArrayList<String> listData;
    private String tel;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmdata);



        listData = (ArrayList<String>) Objects.requireNonNull(getIntent().getSerializableExtra("data"));

        tel = listData.get(2);
        Log.d("VARTEL", tel);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listData);
        ListView list = findViewById(R.id.ListData);
        list.setAdapter(adapter);

        Button submit = findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showConfirmationDialog();
            }
        });

    }


    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmation");
        builder.setMessage("Êtes-vous sûr de vouloir soumettre ces données ?");

        // Bouton "Oui"
        builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                validateData();
            }
        });

        // Bouton "Non"
        builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // L'utilisateur a annulé, ne rien faire
                Toast.makeText(ConfirmData.this, "Annulé", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ConfirmData.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Afficher la boîte de dialogue
        builder.show();
    }

    private void validateData(){
        Log.d("VALDATA", "validateData() called");
        Intent intent = new Intent(ConfirmData.this, ConfirmationPage.class);
        intent.putExtra("Tel", tel);
        startActivity(intent);
    }




}
