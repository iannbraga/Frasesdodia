package com.iannbraga.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {

                "Buda\n" +
                        "A causa da derrota, não está nos obstáculos, ou no rigor das circunstâncias, está na falta de determinação e desistência da própria pessoa.",
                "Paulo Freire\n" +
                        "Mudar é difícil mas é possível.\n",
                "Robinson Shiba\n" +
                        "Se não houver felicidade, negócio vira uma tortura.",
                "John D. Rockefeller\n" +
                        "Não tenha receio de desistir do bom para correr atrás do ótimo",
                "Denzel Washington\n" +
                        "Sucesso? Eu não sei o que exatamente isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa. Para mim, o sucesso é ter paz interior\n",
                "Steve Martin\n" +
                        "“Seja muito bom, que eles não vão ter como ignorar você”",
                "Bill Cosby\n" +
                        "“Não sei qual é o segredo do sucesso, mas o segredo do fracasso é tentar agradar a todo mundo”"
        };

        int numero = new Random().nextInt(4);

        TextView fraseDoDia = findViewById(R.id.txtvFraseDoDia);
        fraseDoDia.setText(frases[numero]);
    }
}
