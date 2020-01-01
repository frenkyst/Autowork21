package com.example.autowork.model;

public class LogKasir {

    private String nama;
    private String notaPembayaran;
    private String logapa;
    private Integer totalTransaksi;



    public LogKasir(String nama, String notaPembayaran, String logapa, Integer totalTransaksi) {
        this.nama = nama;
        this.notaPembayaran = notaPembayaran;
        this.logapa = logapa;
        this.totalTransaksi = totalTransaksi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotaPembayaran() {
        return notaPembayaran;
    }

    public void setNotaPembayaran(String notaPembayaran) {
        this.notaPembayaran = notaPembayaran;
    }

    public String getLogapa() {
        return logapa;
    }

    public void setLogapa(String logapa) {
        this.logapa = logapa;
    }

    public Integer getTotalTransaksi() {
        return totalTransaksi;
    }

    public void setTotalTransaksi(Integer totalTransaksi) {
        this.totalTransaksi = totalTransaksi;
    }

    @Override
    public String toString() {
        return " "+notaPembayaran+"\n" +
                " "+nama+"\n" +
                " "+totalTransaksi+"\n" +
                " "+logapa;
    }
}
