package br.eti.fgsl.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTranslation(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String idioma = editText.getText().toString();
        String traducao = "";
        switch (idioma){
            case "inglês" : traducao = "Hello World"; break;
            case "alemão" : traducao = "Hallo Welt"; break;
            case "espanhol" : traducao = "Hola Mundo"; break;
            case "italiano" : traducao = "Alo Mondo"; break;
            default: traducao = "não suporta esse idioma";
        }
        editText.setText(traducao);
    }
}
