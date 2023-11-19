import TenagaKesehatan.DataDokter;
import TenagaKesehatan.DataPerawat;

public class Main {
    public static void main(String[] args) throws Exception {
        DataDokter dokter1 = new DataDokter();
        dokter1.nama = "Andi";
        dokter1.alamat = "Tanjung Duren, Jakarta Barat";
        dokter1.no_hp = "08123456789";
        dokter1.spesialisasi = "Bedah";

        DataPerawat perawat1 = new DataPerawat();
        perawat1.nama = "Cahya";
        perawat1.alamat = "Slipi, Jakarta Barat";
        perawat1.no_hp = "08123456712";
        perawat1.spesialisasi = "Bedah";

        System.out.println("Data Dokter");
        System.out.println("Nama = " + dokter1.nama + " Alamat = " + dokter1.alamat + " No HP = " + dokter1.no_hp + " Spesialisasi = " + dokter1.spesialisasi);
        System.out.println("Dokter melakukan pemeriksaan pasien");
        System.out.println("Dokter membuat catatan medis pasien");
        System.out.println("");

        System.out.println("Data Perawat");
        System.out.println("Nama = " + perawat1.nama + " Alamat = " + perawat1.alamat + " No HP = " + perawat1.no_hp + " Spesialisasi = " + perawat1.spesialisasi);
        System.out.println("Perawat membantu dokter melakukan pemeriksaan pasien");
        System.out.println("Perawat membantu dokter membuat catatan medis pasien");
    }
}
