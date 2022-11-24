package ac.id.umtas.uts_fauzanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PertanyaanPemantik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_pemantik);
        getSupportActionBar().setTitle("Pertanyaan Pemantik");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    }

