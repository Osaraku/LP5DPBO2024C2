/*
Saya Muhamad Tio Ariyanto [2201718] mengerjakan soal Latihan Praktikum 5
dalam mata kuliah DPBO untuk keberkahanNya saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin
*/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String jalurMasuk;
    private String status;


    public Mahasiswa(String nim, String nama, String jenisKelamin, String jalurMasuk, String status) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jalurMasuk = jalurMasuk;
        this.status = status;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setJalurMasuk(String jalurMasuk) {
        this.jalurMasuk = jalurMasuk;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getJalurMasuk() {
        return this.jalurMasuk;
    }

    public String getStatus() {
        return this.status;
    }
}
