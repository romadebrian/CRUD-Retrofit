package com.ghozay19.praditaapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ghozay19.praditaapps.admin.dosen.DosenActivity;
import com.ghozay19.praditaapps.admin.mahasiswa.ReadMahasiswaActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @OnClick(R.id.btnReadMahasiswa)
    void Read(){
        Intent intent = new Intent(this,ReadMahasiswaActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.btnreadDosen)
    void ReadDosen(){
        Intent intent = new Intent(this,DosenActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

    }
}
