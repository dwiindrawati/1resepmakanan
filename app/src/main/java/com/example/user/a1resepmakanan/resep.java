package com.example.user.a1resepmakanan;

/**
 * Created by USER on 05/10/2017.
 */

public class resep {
    private String judul;
    private String desk;
    private String judulbar;
    private int image;
    private String detailresep;


    public resep(String judul, String desk, String judulbar, int image, String detailresep) {
        this.judul = judul;
        this.desk = desk;
        this.judulbar = judulbar;
        this.image = image;
        this.detailresep = detailresep;
    }

    public String getJudul() {
        return judul;
    }

    public String getDesk() {
        return desk;
    }

    public String getJudulbar() {
        return judulbar;
    }

    public int getImage() {
        return image;
    }

    public String getDetailresep() {
        return detailresep;
    }
}
