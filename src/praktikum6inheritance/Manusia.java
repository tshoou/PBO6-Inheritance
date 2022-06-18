/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6inheritance;

/**
 *
 * @author tuffa
 */
import java.text.DecimalFormat;
public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }
    //setter
    public void setManusia(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
 
    public double getTunjangan(){
        double tunjangan;
        if(isMenikah()==true){
            if(isJenisKelamin()==true){
                tunjangan =25;
            }else{
                tunjangan =20;
            }
        }else{
            tunjangan = 15;
        }
        return tunjangan;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    @Override
    public String toString(){
        return
                "========== DAFTAR MANUSIA =========="+
                "\nNama             : "+ getNama()+
                "\nNIK              : "+ getNIK()+
                "\nJenis Kelamin    : "+ (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan       : "+ getPendapatan() + "$" + "\n"+
                "====================================";
    }
}
