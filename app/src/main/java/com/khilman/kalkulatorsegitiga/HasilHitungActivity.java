package com.khilman.kalkulatorsegitiga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HasilHitungActivity extends AppCompatActivity {

    @BindView(R.id.txtNilaiAlas)
    TextView txtNilaiAlas;
    @BindView(R.id.txtNilaiTinggi)
    TextView txtNilaiTinggi;
    @BindView(R.id.txtHasilLuas)
    TextView txtHasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_hitung);
        ButterKnife.bind(this);
        // set text dengan hasil dari get intenta
        // INGAT : kunci/key ketika get harus sama dgn yg dikirim
        txtNilaiAlas.setText(getIntent().getStringExtra("na"));
        txtNilaiTinggi.setText(getIntent().getStringExtra("nt"));
        txtHasilLuas.setText(getIntent().getStringExtra("nl"));
    }
}
