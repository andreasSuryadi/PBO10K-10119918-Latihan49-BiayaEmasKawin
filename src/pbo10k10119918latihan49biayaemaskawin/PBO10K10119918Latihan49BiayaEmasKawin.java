/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan49biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan emas kawin
 *
 */

public class PBO10K10119918Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        
        emas.setNama("Hendi");
        emas.setBeratEmasKawin(15.7);
        emas.setHargaPerGram(570000);
        
        double totalBayar = emas.totalBayar(emas.getBeratEmasKawin(), emas.getHargaPerGram());
        
        System.out.println("Nama \t\t : " + emas.getNama());
        System.out.println("Berat Emas Kawin : " + emas.getBeratEmasKawin());
        System.out.println("Harga 1 gram \t : " + emas.getHargaPerGram());
        
        System.out.println("\nTotal Bayar \t : " + totalBayar);
    }
    
}
