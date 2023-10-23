package TugasLMS1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double nilaiTubes;
    private double nilaiQuiz;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void inputNilai(double tubes, double quiz, double tugas, double uts, double uas) {
        nilaiTubes = tubes;
        nilaiQuiz = quiz;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    public double hitungTotalNilai() {
        double totalNilai = 0.3 * nilaiTubes + 0.1 * nilaiQuiz + 0.1 * nilaiTugas + 0.25 * nilaiUTS + 0.25 * nilaiUAS;
        return totalNilai;
    }

    public void tampilkanNilai() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  Matakuliah Pemrograman Berorientasi Objek : " + hitungTotalNilai());
    }
}