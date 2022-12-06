public class Main {
    public static void main(String[] args) {

        //Transportasi Air
        System.out.println("======= Transportasi AIR =======");
        TransportasiAir transportasiAir = new TransportasiAir(8, 30000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        //Sampan
        System.out.println();
        System.out.println("======= Sampan =======");
        Sampan sampan = new Sampan(30, 75000,3);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(4);

        //Kapal
        System.out.println("");
        System.out.println("======= Kapal =======");
        Kapal kapal = new Kapal(80, 100000,"Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(25);
        kapal.berlabuh();
    }
}
