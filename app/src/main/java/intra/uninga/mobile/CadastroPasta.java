package intra.uninga.mobile;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPasta extends AppCompatActivity {

    private Button CadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadpasta);

        CadButton = findViewById(R.id.ButtonCad);

    }
}