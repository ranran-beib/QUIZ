public class MahasiswaMain05 {

    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05("IF101", "Algoritma", 3);
        MataKuliah05 mk2 = new MataKuliah05("IF102", "Basis Data", 3);
        MataKuliah05 mk3 = new MataKuliah05("IF103", "Manajemen", 2);

        Mahasiswa05 mhs = new Mahasiswa05("23012345", "Aliyah Miranti", 2025, 5);

        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        mhs.tambahMataKuliah(mk3);

        mhs.tampilkanInfo();
    }
}