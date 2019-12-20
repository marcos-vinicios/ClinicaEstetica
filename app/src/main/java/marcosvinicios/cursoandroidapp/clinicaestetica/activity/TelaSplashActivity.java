package marcosvinicios.cursoandroidapp.clinicaestetica.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import marcosvinicios.cursoandroidapp.clinicaestetica.R;

public class TelaSplashActivity extends AppCompatActivity {
    Button buttonSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        getSupportActionBar().hide();

        buttonSplash = findViewById(R.id.buttonSplash);

        buttonSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(TelaSplashActivity.this,PrimeiraActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
