package TugasLMS1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        boolean data = true;

        while (data) {
            tampilkanMenu();
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilkanNilaiMahasiswa();
                    break;
                case 3:
                    data = false;
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi!");
                    break;
            }
        }

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("=== Program Pengelolaan Nilai Mahasiswa ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Nilai Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        System.out.print("Masukkan Nilai Tubes: ");
        double tubes = scanner.nextDouble();
        System.out.print("Masukkan Nilai Quiz: ");
        double quiz = scanner.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        mahasiswa.inputNilai(tubes, quiz, tugas, uts, uas);
        dataMahasiswa.add(mahasiswa);
    }

    private static void tampilkanNilaiMahasiswa() {
        System.out.println("\nDaftar Nilai Matakuliah Pemrograman Berorientasi Objek:");
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            mahasiswa.tampilkanNilai();
            System.out.println("--------------");
        }
    }
}