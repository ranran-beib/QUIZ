public class Mahasiswa05 {
    String nim;
    String nama;
    int tahun;
    MataKuliah05[] mataKuliahDiambil;
    int jumlahMK;

    public Mahasiswa05(String ni, String nama, int tahun, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahun = tahun;
        this.mataKuliahDiambil = new MataKuliah05[kapasitasMK];
        this.jumlahMK = 0;
    }

    public void tampilkanInfo() {
        System.out.println("NIM                : " + nim);
        System.out.println("Nama               : " + nama);
        System.out.println("Tahun Masuk        : " + tahun);
        System.out.println("Daftar Mata Kuliah : ");

        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
        }

        System.out.println("Total SKS : " + hitungTotalSKS());
        System.out.println("==================================");
    }

    public void tambahMataKuliah(MataKuliah05 mk) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mk;
            jumlahMK++;
            System.out.println("Mata kuliah berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas mata kuliah penuh!");
        }
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += mataKuliahDiambil[i].sks;
        }
        return total;
    }
}