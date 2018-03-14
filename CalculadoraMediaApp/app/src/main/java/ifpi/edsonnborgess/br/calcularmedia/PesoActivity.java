package ifpi.edsonnborgess.br.calcularmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PesoActivity extends AppCompatActivity {
    private double nota1;
    private double nota2;
    private EditText edtxtPeso1;
    private EditText edtxtPeso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        nota1 = getIntent().getDoubleExtra("nota1", 0);
        nota2 = getIntent().getDoubleExtra("nota2", 0);
        edtxtPeso1 = findViewById(R.id.tela3_edtxt_peso1);
        edtxtPeso2 = findViewById(R.id.tela3_edtxt_peso2);
    }

    public void calcular(View view) {
        int peso1 = Integer.valueOf(edtxtPeso1.getText().toString().trim());
        int peso2 = Integer.valueOf(edtxtPeso2.getText().toString().trim());
        double media = ((nota1*peso1)+(nota2*peso2))/(peso1 + peso2);
        getIntent().putExtra("media", media);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}
