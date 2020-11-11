/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan49biayaemaskawin;

/**
 *
 * @author andreas
 */
public class Emas {
    private String nama;
    private double beratEmasKawin, hargaPerGram;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getBeratEmasKawin() {
        return beratEmasKawin;
    }
    
    public void setBeratEmasKawin(double beratEmasKawin) {
        this.beratEmasKawin = beratEmasKawin;
    }
    
    public double getHargaPerGram() {
        return hargaPerGram;
    }
    
    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }
    
    public double totalBayar(double beratEmasKawin, double hargaPerGram) {
        return beratEmasKawin * hargaPerGram;
    }
}
