package ac.id.umtas.uts_fauzanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KataKunci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kunci);
        getSupportActionBar().setTitle("Kata Kunci");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    }

