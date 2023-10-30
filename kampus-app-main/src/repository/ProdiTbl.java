package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.createProdi(prodi);
    }

    // Menambahkan metode untuk mendapatkan nama Prodi berdasarkan ID
    public String getProdiNameById(String IdProdi) {
        for (Prodi prodi : db.tables.dataProdi) {
            if (prodi.getId().equals(IdProdi)) {
                return prodi.getNama();
            }
        }
        return "Prodi tidak ditemukan";
    }
    
}