import java.text.SimpleDateFormat;
import java.util.Date;

class SupermarketTransaction {
    private Date tanggal;
    private String waktu;
    private Pelanggan pelanggan;
    private PembelianBarang pembelianBarang;
    private String kasir;

    public SupermarketTransaction(String namaSupermarket, Pelanggan pelanggan, PembelianBarang pembelianBarang, String kasir) {
        this.tanggal = new Date();  // Mengatur tanggal secara otomatis
        this.waktu = getWaktuSekarang();  // Mengatur waktu secara otomatis
        this.pelanggan = pelanggan;
        this.pembelianBarang = pembelianBarang;
        this.kasir = kasir;
    }

    public void tampilkanData() {
        System.out.println("HALAL SUPERMARKET");
        System.out.println("Tanggal: " + formatDate(tanggal, "EEEE, dd/MM/yyyy"));
        System.out.println("Waktu: " + waktu);

        System.out.println("=====================");
        System.out.println("DATA PELANGGAN");
        System.out.println("----------------------------------");
        pelanggan.tampilkanData();

        System.out.println("+++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------------");
        pembelianBarang.tampilkanData();

        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir: " + kasir);
    }

    private String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    private String getWaktuSekarang() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss z");
        return sdf.format(new Date());
    }
}