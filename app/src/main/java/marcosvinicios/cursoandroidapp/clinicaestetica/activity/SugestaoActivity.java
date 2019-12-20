package marcosvinicios.cursoandroidapp.clinicaestetica.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import marcosvinicios.cursoandroidapp.clinicaestetica.Nota;
import marcosvinicios.cursoandroidapp.clinicaestetica.R;

public class SugestaoActivity extends AppCompatActivity {
    EditText editSugestao;
    Button btSalvar;

    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugestao);
        getSupportActionBar().hide();

        editSugestao = findViewById(R.id.editSugestao);
        btSalvar = findViewById(R.id.btSalvar);

        inicializaFirebase();

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nota n = new Nota();
                n.setId(UUID.randomUUID().toString().trim());
                n.setSugestao(editSugestao.getText().toString());
                databaseReference.child("Sugestao").child(n.getId()).setValue(n);
                startActivity(new Intent(SugestaoActivity.this,TelaFinalActivity.class));
                finish();
            }
        });


    }
    private void inicializaFirebase(){
        FirebaseApp.initializeApp(SugestaoActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
}
