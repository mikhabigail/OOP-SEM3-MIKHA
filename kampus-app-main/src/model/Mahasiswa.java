package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
    this.nama = nama;
    }

    private String IdProdi; // tugas
    public String getidProdi(){
        return IdProdi;
    }

    public void setidProdi(String IdProdi) {
    this.IdProdi= IdProdi;
    }

    public Mahasiswa(String nim, String nama, String IdProdi) {
        this.nim = nim;
        this.nama = nama;
        this.IdProdi = IdProdi; // tugas
    }
}
