package intra.uninga.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button formButton, listButton, CadPast, ContPast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formButton = findViewById(R.id.formButton);
        listButton = findViewById(R.id.listButton);
        CadPast = findViewById(R.id.CadastroB);
        ContPast = findViewById(R.id.ContPasta);

        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFormActivity();
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListActivity();
            }
        });

        CadPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCadastroPasta();
            }
        }); {

        }
    }

    private void openFormActivity() {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }

    private void openListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    private void openCadastroPasta() {
        Intent cado = new Intent(this, CadastroPasta.class);
        startActivity(cado);
    }
}