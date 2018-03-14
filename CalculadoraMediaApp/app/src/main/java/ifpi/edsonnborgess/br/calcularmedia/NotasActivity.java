package ifpi.edsonnborgess.br.calcularmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class NotasActivity extends AppCompatActivity {

    public static final int Peso = 1;
    private String usuario;
    private EditText ed_primeiraNota;
    private EditText ed_segundaNota;
    private TextView alunoSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        usuario = getIntent().getStringExtra("usuario");
        ed_primeiraNota = findViewById(R.id.Notas_edtxtNota1);
        ed_segundaNota = findViewById(R.id.Notas_edtxtNota2);
        alunoSituacao = findViewById(R.id.Situacao_edtxt);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case Peso:
                if(resultCode == RESULT_OK){
                    double media = data.getDoubleExtra("media", 0);
                    if(media >= 7 && media <=10){
                        alunoSituacao.setText(String.format(Locale.getDefault(), "%s você foi aprovado com media %.3f",
                                usuario,media));

                    } else if (media < 4){
                        alunoSituacao.setText(String.format(Locale.getDefault(), " %sreprovado. sua media: %.3f",
                                usuario,media));

                    } else if(media>= 4 && media < 7) {
                        alunoSituacao.setText(String.format(Locale.getDefault(), "%s Prova Final |Media foi %.3f ",
                                usuario,media));
                    }
                }
        }
    }

    public void calcMedia(View view) {
        Intent it = new Intent(this, PesoActivity.class);
        it.putExtra("nota1", Double.valueOf(ed_primeiraNota.getText().toString().trim()));
        it.putExtra("nota2", Double.valueOf(ed_segundaNota.getText().toString().trim()));
        startActivityForResult(it, Peso);
    }
}
