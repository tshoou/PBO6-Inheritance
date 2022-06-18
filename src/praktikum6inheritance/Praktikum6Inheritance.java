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
import java.util.ArrayList;
public class Praktikum6Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nama : Tuffahati Sholihah");
        System.out.println("NIM  : 215150601111001");
        
        Manusia Tuffa = new Manusia("Tuffahati", "3923842934",true, true);
        Manusia Emily = new Manusia("Emily Cooper", "35132432432", false, true);
        Manusia Gabriel = new Manusia("Gabriel", "37879289820", true, false);
        Manusia Mindy = new Manusia("Mindy Chen", "389893293", false, false);

        ArrayList<Manusia> tambahManusia = new ArrayList<>();
        
        tambahManusia.add(Tuffa);
        tambahManusia.add(Emily);
        tambahManusia.add(Gabriel);
        tambahManusia.add(Mindy);
        
        MahasiswaFilkom Pierre = new MahasiswaFilkom("Pierre Cadault", "351923848239",true,true,"1883292910",3.50);
        MahasiswaFilkom Camille = new MahasiswaFilkom("Camille", "351923848239",false,false,"205150601111018",3.70);
        MahasiswaFilkom Madeline = new MahasiswaFilkom("Madeline Wheeler", "371923909239",false,false,"2183292910",3.80);
        MahasiswaFilkom Sylvie = new MahasiswaFilkom("Sylvie", "78938293829",false,false,"2083292910",4.00);
        MahasiswaFilkom Antoine = new MahasiswaFilkom("Antoine Lambert", "329309203922",true,false,"2183292910",3.90);
        
        ArrayList<MahasiswaFilkom> tambahMahasiswa = new ArrayList<>();
        
        tambahMahasiswa.add(Pierre);
        tambahMahasiswa.add(Camille);
        tambahMahasiswa.add(Madeline);
        tambahMahasiswa.add(Sylvie);
        tambahMahasiswa.add(Antoine);
        
        //String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String nip
        Pekerja Beth = new Pekerja("Beth Harmon", "329309203922",false,false, 7,22,  "2039999999999");
        Pekerja Vasily = new Pekerja("Vasily Borgov",   "390902809192",true,true, 9,20, "1057777777");
        Pekerja Benny = new Pekerja("Benny Watts",  "389290392090",true,true,7,22,"195102439283");

        ArrayList<Pekerja> tambahPekerja = new ArrayList<>();
        
        tambahPekerja.add(Beth);
        tambahPekerja.add(Vasily);
        tambahPekerja.add(Benny);
        
        //String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String nip, int lamaKerja
        Manager Jodi = new Manager("Jodi Kreyman","351707384392",false,false, 9,20,"2032222222222",1500);
        Manager Stig = new Manager("Stig Mohlin", "3517078767543",false,false,8,21,"506111111111",1120);
        Manager Jack = new Manager("Jack Dunkleman", "351705453543",false,false,7,24,"10344444444", 900);
        Manager Harper = new Manager("Harper Kreyman", "351707523453",false,false,9,20,"204837283728", 1500);
        
        ArrayList<Manager> tambahManager = new ArrayList<>();
        
        tambahManager.add(Jodi);
        tambahManager.add(Stig);
        tambahManager.add(Jack);
        tambahManager.add(Harper);
        
        System.out.println();
        for(int i=0;i<tambahManusia.size();i++){
            System.out.println(tambahManusia.get(i).toString());
        }
        System.out.println();
        for(int i=0;i<tambahMahasiswa.size();i++){
            System.out.println(tambahMahasiswa.get(i).toString());
        }
        System.out.println();
        for(int i=0;i<tambahPekerja.size();i++){
            System.out.println(tambahPekerja.get(i).toString());
        }
        System.out.println();
        for(int i=0;i<tambahManager.size();i++){
            System.out.println(tambahManager.get(i).toString());
        }
        System.out.println();
        System.out.println("Total Manusia          :"+tambahManusia.size());
        System.out.println("Total Mahasiswa Filkom :"+tambahMahasiswa.size());
        System.out.println("Total Pekerja          :"+tambahPekerja.size());
        System.out.println("Total Manager          :"+tambahManager.size());
        System.out.println("======================================");
    }
    
}
