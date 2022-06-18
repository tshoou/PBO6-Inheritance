/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6inheritance;

import java.text.DecimalFormat;

/**
 *
 * @author tuffa
 */
public class Manager extends Pekerja{
    private int lamaKerja;
    
    Manager(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String nip, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, nip);
        this.lamaKerja = lamaKerja;
    }
    
    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    @Override
    public String toString(){
        return
                "=========== DAFTAR MANAJER ==========" +
                "\nNama             : "+ getNama()+
                "\nNIK              : "+ getNIK()+
                "\nJenis Kelamin    : "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan       : "+ ((getTunjangan()+15) + getGaji() + (getBonus()+(getBonus()*30/100))) + "$" +
                "\nBonus            : "+ (getBonus() + (getBonus()*30/100)) + "$" +
                "\nGaji             : "+ getGaji()+ "$" +
                "\nStatus           : "+ getStatus() +
                "\nLama Kerja       : "+ getLamaKerja()+ " hari" + "\n"+
                "=====================================";
    }
    
}
