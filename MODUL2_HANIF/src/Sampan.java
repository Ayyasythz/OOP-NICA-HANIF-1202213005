public class Sampan extends  TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan biaya sebesar Rp. " + biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transpoertasi Jenis Sampan sedang berlayar menggunakan " + layar + "layar");
    }
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai menggunakan " + jangkar + "Jangkar");
    }

}
