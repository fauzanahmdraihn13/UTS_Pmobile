package ac.id.umtas.uts_fauzanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PetaKonsep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta_konsep);
        getSupportActionBar().setTitle("Peta Konsep");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    }

