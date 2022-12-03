public class Main {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Samsung",4,2.4f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("Barracuda",8,3.5f,true);
        laptop.informasi();
        laptop.bukaGame("Crash Bandicot");
        laptop.kirimEmail("udinpetot@gmail.com");
        laptop.kirimEmail("sangkuriang@gmail.com", "saepudinjunaedi@yahoo.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk",2,2.2f, false);
        handphone.informasi();
        handphone.telfon(621234512);
        handphone.kirimSMS(621231231);
        handphone.kirimSMS(62524123, 62124352);

    }
}
