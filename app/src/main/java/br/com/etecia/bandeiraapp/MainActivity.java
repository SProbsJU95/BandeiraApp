package br.com.etecia.bandeiraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;

import br.com.etecia.bandeiraapp.model.State;


public class MainActivity extends AppCompatActivity {

    State states [] = { new State("Nome","descricao","area","populacao")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
