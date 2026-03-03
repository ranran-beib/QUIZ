public class MataKuliahMain05 {

    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05("IF101", "Algoritma", 3);
        mk1.tampilkanInfo();

        mk1.ubahNamaMK("Algoritma dan Struktur Data");
        mk1.ubahSKS(4);

        mk1.tampilkanInfo();
    }
}