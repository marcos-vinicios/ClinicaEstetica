package marcosvinicios.cursoandroidapp.clinicaestetica.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import marcosvinicios.cursoandroidapp.clinicaestetica.Nota;
import marcosvinicios.cursoandroidapp.clinicaestetica.R;


public class PrimeiraActivity extends AppCompatActivity {
    Button btUm,btDois,btTres,btQuatro,btCinco;
    //progress bar
    ProgressDialog pd;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        getSupportActionBar().hide();

        //inicializando
        btUm = findViewById(R.id.btUm);
        btDois = findViewById(R.id.btDois);
        btTres = findViewById(R.id.btTres);
        btQuatro = findViewById(R.id.btQuatro);
        btCinco = findViewById(R.id.btCinco);


        pd = new ProgressDialog(this);

        inicializarFirebase();

        btUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaUm = btUm.getText().toString().trim();
                if (notaUm != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota1(btUm.getText().toString());
                    databaseReference.child("Nota1").child("1").child(n.getId()).setValue(n);
                    startActivity(new Intent(PrimeiraActivity.this, SegundaActivity.class));
                    finish();
                }


            }
        });
        btDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaDois = btDois.getText().toString().trim();
                if (notaDois != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota2(btDois.toString());
                    databaseReference.child("Nota1").child("2").child(n.getId()).setValue(n);
                    startActivity(new Intent(PrimeiraActivity.this, SegundaActivity.class));
                    finish();
                }


            }
        });

        btTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaTres = btTres.getText().toString().trim();
                if (notaTres != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota3(btTres.toString());
                    databaseReference.child("Nota1").child("3").child(n.getId()).setValue(n);
                    startActivity(new Intent(PrimeiraActivity.this, SegundaActivity.class));
                    finish();
                }


            }
        });
        btQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaQuatro = btQuatro.getText().toString().trim();
                if (notaQuatro != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota4(btQuatro.toString());
                    databaseReference.child("Nota1").child("4").child(n.getId()).setValue(n);
                    startActivity(new Intent(PrimeiraActivity.this, SegundaActivity.class));
                    finish();
                }


            }
        });
        btCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaCinco = btCinco.getText().toString().trim();
                if (notaCinco != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota5(btCinco.toString());
                    databaseReference.child("Nota1").child("5").child(n.getId()).setValue(n);
                    startActivity(new Intent(PrimeiraActivity.this, SegundaActivity.class));
                    finish();
                }


            }
        });
    }

    private void inicializarFirebase(){
        FirebaseApp.initializeApp(PrimeiraActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }


}
