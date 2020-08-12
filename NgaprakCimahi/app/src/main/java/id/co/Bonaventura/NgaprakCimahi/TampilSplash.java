package id.co.Bonaventura.NgaprakCimahi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * * Tanggal Pengerjaan : Selasa 11 Agustus 2020
 * * Nama  : Bonaventura Aldino Senda Seni
 * * NIM   : 10117122
 * * Kelas : IF-3
 */

public class TampilSplash extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(500);
//                    sound.start();
                    Thread.sleep(2500);
                }catch (Exception e){

                }finally {
//                    sound.release();
                    startActivity(new Intent("android.intent.action.MAINACTIVITY"));
                    finish();
                }
            }
        }).start();
    }
}
