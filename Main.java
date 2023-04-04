
 
package perpustakaan;

/**
 *
 * @author LENOVO
 */
import perpustakaan.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> listBuku = new ArrayList<>();

        while (true) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Keluar");

            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Masukkan jumlah data buku yang ingin diinputkan: ");
                    int jumlahBuku = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlahBuku; i++) {
                        System.out.println("\nData Buku ke-" + (i + 1));
                        System.out.print("Judul: ");
                        String judul = input.nextLine();
                        System.out.print("Penulis: ");
                        String penulis = input.nextLine();
                        System.out.print("Penerbit: ");
                        String penerbit = input.nextLine();
                        System.out.print("Kategori (A: Anak-Anak, R: Remaja, D: Dewasa, SU: Semua Umur): ");
                        String kategori = input.nextLine();
                        System.out.print("Stok: ");
                        int stok = input.nextInt();
                        System.out.print("Tahun Terbit: ");
                        int tahunTerbit = input.nextInt();
                        input.nextLine();

                        Buku buku;
                        if (kategori.equalsIgnoreCase("A")) {
                            buku = new BukuAnakAnak(judul, penulis, penerbit, stok, tahunTerbit);
                        } else if (kategori.equalsIgnoreCase("R")) {
                            buku = new BukuRemaja(judul, penulis, penerbit, stok, tahunTerbit);
                        } else if (kategori.equalsIgnoreCase("D")) {
                            buku = new BukuDewasa(judul, penulis, penerbit, stok, tahunTerbit);
                        } else if (kategori.equalsIgnoreCase("SU")) {
                            buku = new BukuSemuaUmur(judul, penulis, penerbit, stok, tahunTerbit);
                        } else {
                            System.out.println("Kategori tidak valid!");
                            continue;
                        }
                        listBuku.add(buku);
                    }

                    System.out.println("\nDaftar Buku");
                    for (int i = 0; i < listBuku.size(); i++) {
                        System.out.println("\nData Buku ke-" + (i + 1));
                        listBuku.get(i).displayInfo();
                    }

                    break;
                case 2:
                    if (listBuku.size() == 0) {
                        System.out.println("Daftar Buku Kosong");
                    } else {
                        System.out.println("Daftar Buku:");
                        for (Buku buku : listBuku) {
                            buku.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println();
        }
    }
}
