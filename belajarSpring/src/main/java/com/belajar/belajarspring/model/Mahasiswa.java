package model;

public class Mahasiswa {
    private int nim;
    private String nama;
    private String adress;

    public Mahasiswa() {
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim=" + nim +
                ", nama='" + nama + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
