package Perusahaan;
public class Karyawan extends HRD implements Pekerjaan{
    private String nama;
    private String alamatKaryawan;

    public Karyawan(String namaKaryawan, String alamatKaryawan, String namaHRD, String tempatTinggalHRD) {
        super(namaHRD, tempatTinggalHRD);
        this.nama = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
    }
    
    public String getNamaHRD(){
        return super.nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void SapaKaryawan(){
        System.out.println("Selamat Bekerja");
    }
    
    public void SapaKaryawan(String nama){
        System.out.println("Halo " + nama + " Selamat Bekerja");
    }

    @Override
    public void naikGaji() {
        System.out.println("Karyawan Naik Gaji"); 
    }

    @Override
    public void showGaji() {
        System.out.println("Gaji Dibawah UMR");
    }

    @Override
    public String getNamaPekerjaan() {
        return "ASLAB";
    }
    
    
}
