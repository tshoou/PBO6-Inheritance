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
public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String nip;
    
    Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String nip) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
    }

    public double getGaji() {
        gaji = (getHariKerja() * getJamKerja() * 15);
        return gaji;
    }

    public double getBonus() {
        int libur =0;
        
        for (int i = 1; i<=getHariKerja();i++) {
            if(i%7 ==0) {
                libur+=2;
            }
        }
        double bonusLembur = (getHariKerja() - libur) * (getJamKerja() -7) *7;
        double bonusLibur = libur*getJamKerja()*20;
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getStatus(){
        String kantorCabang = getNip().substring(0,1);
        switch(kantorCabang){
        case "1" :
            kantorCabang = "Mondstadt";
            break;
        case "2" :
            kantorCabang = "Liyue";
            break;
        case "3" :
            kantorCabang = "Inazuma";
            break;
        case "4" :
            kantorCabang = "Sumeru";
            break;
        case "5" :
            kantorCabang = "Fontaine";
            break;
        case "6" :
            kantorCabang = "Natlan";
            break;
        case "7" :
            kantorCabang = "Snezhnaya";
            break;
        default:
            System.out.println("Kantor Cabang Tidak Valid");
            break;
        }
        
        String cabangKe = " cabang ke-" + getNip().substring(2,3);
        String departemen = getNip().substring(6,7);
        
        switch(departemen){
            case "1" :
                departemen = "Pemasaran";
                break;
            case "2" :
                departemen = "Humas";
                break;
            case "3" :
                departemen = "Riset";
                break;
            case "4" :
                departemen = "Teknologi";
                break;
            case "5" :
                departemen = "Personalia";
                break;
            case "6" :
                departemen = "Akademik";
                break;
            case "7" :
                departemen = "Administrasi";
                break;
            case "8" :
                departemen = "Operasional";
                break;
            case "9" :
                departemen = "Pembangunan";
                break;
            default:
                System.out.println("Kantor Cabang Tidak Valid");
                break;
        }
        return departemen + ", "+ kantorCabang +cabangKe;
    }
    @Override
    public String toString(){
        return
                "========== DAFTAR PEKERJA ==========" +
                "\nNama             : "+ getNama()+
                "\nNIK              : "+ getNIK()+
                "\nJenis Kelamin    : "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan       : "+ (getGaji() + getBonus() + getTunjangan()) + "$" +
                "\nBonus            : "+ getBonus()+ "$" +
                "\nGaji             : "+ getGaji()+ "$" +
                "\nStatus           : "+ getStatus() +"\n"+
                "=====================================";
    }
}
