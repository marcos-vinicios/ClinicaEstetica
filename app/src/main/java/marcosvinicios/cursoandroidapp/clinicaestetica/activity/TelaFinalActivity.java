package marcosvinicios.cursoandroidapp.clinicaestetica.activity;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import marcosvinicios.cursoandroidapp.clinicaestetica.R;

public class TelaFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            proximaTela();
            }
        },3000);

    }
    private  void proximaTela(){
        Intent i = new Intent(TelaFinalActivity.this,TelaSplashActivity.class);
        startActivity(i);
        finish();
    }
}
