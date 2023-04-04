package perpustakaan;

public abstract class Buku {
    protected String judul, penulis, penerbit, kategori;
    protected int stok, tahun;

    public Buku(String judul, String penulis, String penerbit, String kategori, int stok, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahun() {
        return tahun;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangStok(int jumlah) {
        stok -= jumlah;
    }

    public abstract void displayInfo();
}
