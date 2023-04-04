package perpustakaan;

public class BukuRemaja extends Buku {
    public BukuRemaja(String judul, String penulis, String penerbit, int stok, int tahun) {
        super(judul, penulis, penerbit, "Remaja", stok, tahun);
    }

    @Override
    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun: " + tahun);
      System.out.println();
    }
}