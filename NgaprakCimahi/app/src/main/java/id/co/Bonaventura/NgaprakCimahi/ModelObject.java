package id.co.Bonaventura.NgaprakCimahi;

/**
 * * Tanggal Pengerjaan : Selasa 11 Agustus 2020
 * * Nama  : Bonaventura Aldino Senda Seni
 * * NIM   : 10117122
 * * Kelas : IF-3
 */

public enum ModelObject {


    WISATA(R.string.wisata, R.layout.slider_wisata),
            ;

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}