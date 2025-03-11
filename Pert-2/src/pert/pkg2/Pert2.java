package pert.pkg2;
import Perusahaan.Karyawan;
import Perusahaan.HRD;

public class Pert2 {
    public static void main(String[] args) {
       Karyawan adi = new Karyawan("Adi", "Jakarta", "Andi", "Jakarta");
       //adi.nama = "Adi";
       System.out.print("Nama Karyawan adalah : ");
       adi.setNama("Alam");
       System.out.println(adi.getNama());
       System.out.print("Nama HRD adalah : ");
       System.out.println(adi.getNamaHRD());
       
       adi.SapaKaryawan();
       adi.SapaKaryawan("Arji");
       adi.naikGaji();
       
       HRD joko = new HRD("Joko", "Jakarta");
       joko.naikGaji();
       
       String pekerjaan = adi.getNamaPekerjaan();
       System.out.println(pekerjaan);
        
        
        
    }
    
}
