package ac.id.umtas.uts_fauzanar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        getSupportActionBar().setTitle("Materi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    }

