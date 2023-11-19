package TenagaKesehatan;

public abstract class TenagaKesehatan {
    public String nama;
    public String alamat;
    public String no_hp;
    public String spesialisasi;
    
    public abstract void MelakukanPemeriksaan();
    public abstract void MembuatCatatanMedis();
}