package com.example.autowork.model;

public class Transaksi {

    private String namaKaryawan;
    private Integer totalTransaksi;
    private String uid;
    private String key;

    public Transaksi(){ }


    public Transaksi(String namaKaryawan, Integer totalTransaksi, String uid, String key) {
        this.namaKaryawan = namaKaryawan;
        this.totalTransaksi = totalTransaksi;
        this.uid = uid;
        this.key = key;
    }


    public String getNamakaryawan() {
        return namaKaryawan;
    }

    public void setNamakaryawan(String namakaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public Integer getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(Integer totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }



    @Override
    public String toString() {
        return  " "+namaKaryawan+"\n" +
                " "+totalTransaksi+"\n" +
                " "+uid;

    }
}
