package com.example.calvinbudisantosa;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Tanggal Pengerjaan : 20 Mei 2019
//Nama  : Calvin Budi Santosa
//NIM   : 10116013
//Kelas : AKB - 1 / IF - 1

public class profil extends Fragment {

    @Nullable
    @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_profil, container, false);

            return view;
    }
}
