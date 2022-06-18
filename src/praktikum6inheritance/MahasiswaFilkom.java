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
public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, NIK, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public String getStatus(){
        String angkatan = getNim().substring(0,2);
        String prodi = getNim().substring(6,7);
        switch (prodi){
            case "2" :
                prodi = "Teknik Meniup Gelembung";
                break;
            case "3" :
                prodi = "Teknik Berburu Ubur-Ubur";
                break;
            case "4" :
                prodi = "Sistem Perhamburgeran";
                break;
            case "6" :
                prodi = "Pendidikan Chum Bucket";
                break;
            case "7" :
                prodi = "Teknologi Telepon Kerang";
                break;
        }
        return prodi+", "+ angkatan;
    }
    public double getBeasiswa(){
        double beasiswa;
        if (ipk >= 3.0 && ipk <= 3.5) {
            beasiswa = 50;
        } else if (ipk > 3.5 && ipk <= 4) {
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }
    
    @Override
    public String toString(){
        return
                "====== DAFTAR MAHASISWA FILKOM ======"+
                "\nNama             : "+ getNama()+
                "\nNIK              : "+ getNIK()+
                "\nJenis Kelamin    : "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") + "$" +
                "\nPendapatan       : "+ (getBeasiswa() + getTunjangan())+
                "\nNIM              : "+ getNim() +
                "\nIPK              : "+ getIpk() +
                "\nStatus           : "+ getStatus()+"\n"+
                "=====================================";
        
    }
    
    
}
