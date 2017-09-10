package com.khilman.kalkulatorsegitiga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nilai_alas)
    EditText nilaiAlas;
    @BindView(R.id.nilai_tinggi)
    EditText nilaiTinggi;
    @BindView(R.id.txtHasil)
    TextView txtHasil;
    @BindView(R.id.btnHitung)
    Button btnHitung;
    @BindView(R.id.btnClear)
    Button btnClear;
    @BindView(R.id.btnKirim)
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnHitung, R.id.btnClear, R.id.btnKirim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnHitung:
                hitungSegitiga();
                break;
            case R.id.btnClear:
                clearInput();
                break;
            case R.id.btnKirim:
                kirimNilai();
                break;
        }
    }

    private void kirimNilai() {
        // buat intent
        Intent intent = new Intent(MainActivity.this, HasilHitungActivity.class);
        // masukan nilai kedalam object intent
        intent.putExtra("na", nilaiAlas.getText().toString());
        intent.putExtra("nt", nilaiTinggi.getText().toString());
        intent.putExtra("nl", txtHasil.getText().toString());

        // mulai activity baru
        startActivity(intent);
    }

    private void clearInput() {
        // set value untuk widget
        nilaiAlas.setText("");
        nilaiTinggi.setText("");
        txtHasil.setText("0");
    }

    private void hitungSegitiga() {
        // cek apakah edit text kosong
        if (!nilaiAlas.getText().toString().isEmpty() && !nilaiTinggi.getText().toString().isEmpty()){
            // event OnClick btn Hitung
            int nilaialas = Integer.parseInt(nilaiAlas.getText().toString()); // convert ke integer

            int nilaitinggi = Integer.parseInt(nilaiTinggi.getText().toString());

            // rumus 1/2 * alas * tinggi
            Double hasil_luas = 0.5 * nilaialas * nilaitinggi;
            // tampilkan ke textview txtHasil
            txtHasil.setText(hasil_luas.toString());
        }


    }
}
