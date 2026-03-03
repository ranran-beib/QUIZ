public class MataKuliah05 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah05(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS minimal 2. Diset default 2.");
            this.sks = 2;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah    : " + kodeMK);
        System.out.println("Nama Mata Kuliah    : " + namaMK);
        System.out.println("SKS                 : " + sks);
        System.out.println("==================================");
    }

    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama mata kuliah berhasil diubah.");
    }

    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah.");
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }
}
