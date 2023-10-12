package intra.uninga.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroPasta extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadpasta);

        Button cado = (Button)findViewById(R.id.ButtonCad);

        cado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText cadastro = (EditText)findViewById(R.id.CriarPasta);
                String cadastroString = cadastro.getText().toString();
                String result;

                result = crud.CadastroPasta(cadastroString);

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
}