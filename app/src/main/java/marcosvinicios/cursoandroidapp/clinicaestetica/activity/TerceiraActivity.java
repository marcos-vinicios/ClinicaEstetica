package marcosvinicios.cursoandroidapp.clinicaestetica.activity;


import android.content.Intent;
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

public class TerceiraActivity extends AppCompatActivity {
    Button btUm,btDois,btTres,btQuatro,btCinco;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        getSupportActionBar().hide();

        btUm = findViewById(R.id.btUm);
        btDois = findViewById(R.id.btDois);
        btTres = findViewById(R.id.btTres);
        btQuatro = findViewById(R.id.btQuatro);
        btCinco = findViewById(R.id.btCinco);

        inicializarFirebase();

        btUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaUm = btUm.getText().toString().trim();
                if (notaUm != null){
                    Nota n = new Nota();
                    n.setId(UUID.randomUUID().toString());
                    n.setNota1(btUm.toString());
                    databaseReference.child("Nota3").child("1").child(n.getId()).setValue(n);
                    startActivity(new Intent(TerceiraActivity.this,QuartaActivity.class));
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
                    databaseReference.child("Nota3").child("2").child(n.getId()).setValue(n);
                    startActivity(new Intent(TerceiraActivity.this,QuartaActivity.class));
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
                    databaseReference.child("Nota3").child("3").child(n.getId()).setValue(n);
                    startActivity(new Intent(TerceiraActivity.this,QuartaActivity.class));
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
                    databaseReference.child("Nota3").child("4").child(n.getId()).setValue(n);
                    startActivity(new Intent(TerceiraActivity.this,QuartaActivity.class));
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
                    databaseReference.child("Nota3").child("5").child(n.getId()).setValue(n);
                    startActivity(new Intent(TerceiraActivity.this,QuartaActivity.class));
                    finish();
                }
            }
        });
    }
    private void inicializarFirebase(){
        FirebaseApp.initializeApp(TerceiraActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
}
