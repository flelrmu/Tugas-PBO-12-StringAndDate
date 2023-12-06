class PembelianBarang {
    private String kodeBarang;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBeli;
    private int totalBayar;

    public PembelianBarang(String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli, int totalBayar) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
        this.totalBayar = totalBayar;
    }

    public void tampilkanData() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("TOTAL BAYAR: " + totalBayar);
    }

    public int getTotalBayar() {
        return totalBayar;
    }
}
