class Pelanggan {
    private String nama;
    private String noHP;
    private String alamat;

    public Pelanggan(String nama, String noHP, String alamat) {
        this.nama = nama;
        this.noHP = noHP;
        this.alamat = alamat;
    }

    public void tampilkanData() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("No. HP: " + noHP);
        System.out.println("Alamat: " + alamat);
    }
}