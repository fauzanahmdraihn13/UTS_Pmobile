package ac.id.umtas.uts_fauzanar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol_tujuan_pembelajaran = findViewById(R.id.tombol_tujuan_pembelajaran);
        Button tombol_pertanyaan_pemantik = findViewById(R.id.tombol_pertanyaan_pemantik);
        Button tombol_peta_konsep = findViewById(R.id.tombol_peta_konsep);
        Button tombol_apersepsi = findViewById(R.id.tombol_apersepsi);
        Button tombol_kata_kunci = findViewById(R.id.tombol_kata_kunci);
        Button tombol_materi = findViewById(R.id.tombol_materi);
        Button tombol_tentang_aplikasi = findViewById(R.id.tombol_tentang_aplikasi);


        tombol_tujuan_pembelajaran.setOnClickListener(this);
        tombol_pertanyaan_pemantik.setOnClickListener(this);
        tombol_peta_konsep.setOnClickListener(this);
        tombol_apersepsi.setOnClickListener(this);
        tombol_kata_kunci.setOnClickListener(this);
        tombol_materi.setOnClickListener(this);
        tombol_tentang_aplikasi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_tujuan_pembelajaran:
                halamanTujuanPembelajaran();
                break;
            case R.id.tombol_pertanyaan_pemantik:
                halamanPertanyaanPemantik();
                break;
            case R.id.tombol_peta_konsep:
                halamanPetaKonsep();
                break;
            case R.id.tombol_apersepsi:
                halamanApersepsi();
                break;
            case R.id.tombol_kata_kunci:
                halamanKataKunci();
                break;
            case R.id.tombol_materi:
                halamanMateri();
                break;
            case R.id.tombol_tentang_aplikasi:
                halamanTentangAplikasi();
                break;
        }

    }

    public void halamanTujuanPembelajaran() {
        Intent intent = new Intent(MainActivity.this, TujuanPembelajaran.class);
        startActivity(intent);
    }

    public void halamanPertanyaanPemantik() {
        Intent intent = new Intent(MainActivity.this, PertanyaanPemantik.class);
        startActivity(intent);
    }

    public void halamanPetaKonsep() {
        Intent intent = new Intent(MainActivity.this, PetaKonsep.class);
        startActivity(intent);
    }

    public void halamanApersepsi() {
        Intent intent = new Intent(MainActivity.this, Apersepsi.class);
        startActivity(intent);
    }

    public void halamanKataKunci() {
        Intent intent = new Intent(MainActivity.this, KataKunci.class);
        startActivity(intent);
    }

    public void halamanMateri() {
        Intent intent = new Intent(MainActivity.this, Materi.class);
        startActivity(intent);
    }

    public void halamanTentangAplikasi() {
        Intent intent = new Intent(MainActivity.this, TentangAplikasi.class);
        startActivity(intent);

    }
}
