package ifpi.edsonnborgess.br.calcularmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BoasVindasActivity extends AppCompatActivity {

    private EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);
        usuario = findViewById(R.id.ed_aluno);
    }

    public void entrar(View view) {
        Intent it = new Intent(this, NotasActivity.class);
        it.putExtra("usuario", usuario.getText().toString().trim());
        startActivity(it);
        finish();
    }
}
