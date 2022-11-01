package MODUL_1;

public class Server {

    public static void main(String[] args) {
        User user = new User();
        Database db = new Database();
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=======================================");
        db.InsertMenu();
        user.Register();
        user.DisplayUser();
        db.ShowMenu();







    }
}
