import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Produk produk = inputProduk(scanner);
            Pelanggan pelanggan = inputPelanggan(scanner);
            int jumlah = inputJumlah(scanner);

            PembelianBarang pembelianBarang = inputPembelianBarang(scanner, produk, jumlah);

            System.out.println("\nDetail Transaksi:");
            SupermarketTransaction supermarketTransaction = new SupermarketTransaction("", pelanggan, pembelianBarang, "HAN");
            supermarketTransaction.tampilkanData();
        } catch (InputMismatchException e) {
            System.out.println("Error: Masukkan input yang valid (angka).");
        } catch (Exception e) {
            System.out.println("Error: Terjadi kesalahan.");
        } finally {
            scanner.close();
        }
    }

    private static Produk inputProduk(Scanner scanner) {
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        int harga = scanner.nextInt();
        return new Produk(nama, harga);
    }

    private static Pelanggan inputPelanggan(Scanner scanner) {
        System.out.println("=====================");
        System.out.println("DATA PELANGGAN");
        System.out.println("----------------------------------");
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.next();
        System.out.print("Masukkan nomor HP: ");
        String noHP = scanner.next();
        scanner.nextLine();  // Membersihkan newline di buffer
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();
        return new Pelanggan(nama, noHP, alamat);
    }

    private static int inputJumlah(Scanner scanner) {
        System.out.print("Masukkan jumlah pembelian: ");
        return scanner.nextInt();
    }

    private static PembelianBarang inputPembelianBarang(Scanner scanner, Produk produk, int jumlah) {
        System.out.println("+++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------------");
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.next();
        scanner.nextLine();  // Membersihkan newline di buffer
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = scanner.nextInt();
        return new PembelianBarang(kodeBarang, namaBarang, hargaBarang, jumlah, produk.getHarga() * jumlah);
    }
}