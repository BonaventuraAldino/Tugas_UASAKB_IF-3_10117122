package id.co.Bonaventura.NgaprakCimahi;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * * Tanggal Pengerjaan : Selasa 11 Agustus 2020
 * * Nama  : Bonaventura Aldino Senda Seni
 * * NIM   : 10117122
 * * Kelas : IF-3
 */

@SuppressLint("ValidFragment")
public class TampilFragment extends Fragment {

    int layout;

    public TampilFragment(int layout){
        this.layout = layout;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(layout, container, false);
    }
}
