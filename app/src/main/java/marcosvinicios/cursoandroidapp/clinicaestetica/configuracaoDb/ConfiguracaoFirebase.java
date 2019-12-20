package marcosvinicios.cursoandroidapp.clinicaestetica.configuracaoDb;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ConfiguracaoFirebase {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    private void inicializarFirebase(){
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
}