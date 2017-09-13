package com.example.a20131en20270.javabeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ArCondicionado arlab102a;
    ArCondicionado arlab102b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        arlab102a = new ArCondicionado("California", "CA123", "Split", 12000, 220, 20);
        arlab102b = new ArCondicionado("California", "CA123", "Split", 12000, 220, 20);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exibeNotificacao("Minha primeira notificação");
        exibeNotificacao("Método sobrecarregado", 10);

    }

/*
    public void clickBotao(View v){
        exibeNotificacao("Minha primeira notificação");
    }
*/
protected void exibeNotificacao(String msg){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    arlab102a.setModelo("CA456");
}


    protected void exibeNotificacao(String msg, int tempo){
        Toast.makeText(this, msg, tempo).show();
        Log.i("exibeNotificacao", "Log do método sobrecarregado");
        String marca = arlab102a.getMarca();
        Toast.makeText(this, marca, tempo).show();
    }
}

