package Perusahaan;
public class HRD {
    public String nama;
    public String tempatTinggal;

    public HRD(String nama, String tempatTinggal) {
        System.out.println("Class HRD Dibuat");
        this.nama = nama    ;
        this.tempatTinggal = tempatTinggal;
    }
    
    public void naikGaji(){
        System.out.println("HRD Naik Gaji");
    }
    
    
    
}
