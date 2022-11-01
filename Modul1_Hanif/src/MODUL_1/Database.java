package MODUL_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    ArrayList<Menu> arrayMenu = new ArrayList<>();
    Menu menuBakso = new Menu();
    Menu menuEsteh = new Menu();
    Menu menuBrownies = new Menu();

    public void InsertMenu(){
        menuBakso.setName("Bakso");
        menuBakso.setCategory("Makanan");
        menuBakso.setPrice(10000);
        arrayMenu.add(menuBakso);
        menuEsteh.setName("Es Teh");
        menuEsteh.setCategory("Minuman");
        menuEsteh.setPrice(5000);
        arrayMenu.add(menuEsteh);
        menuBrownies.setName("Brownies");
        menuBrownies.setCategory("Dessert");
        menuBrownies.setPrice(15000);
        arrayMenu.add(menuBrownies);
    }

    public void ShowMenu(){
        Scanner input = new Scanner(System.in);

        int pilihan;
        System.out.println("=====================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        System.out.print("Masukan Pilihan : ");
        pilihan = input.nextInt();
        System.out.println(arrayMenu.size());
        boolean loop = true;
        while (loop){
            if(pilihan == 1){
                for(int i = 0 ; i < arrayMenu.size() ; i++){
                    System.out.println(i + ".  " + arrayMenu.get(i).getName() +"("+ arrayMenu.get(i).getCategory() +")"+ "    Rp. " + arrayMenu.get(i).getPrice());
                }
            }
            else if (pilihan == 2){
                SearchMenu();
            }
            else {
                System.out.println("Terima Kasih");
                loop = false;

            }
        }



    }

    public void SearchMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Menu : ");
        String pilihan = input.nextLine();
        for (int i = 0; i <arrayMenu.size();i++){
            if (pilihan.equals("bakso")){
                System.out.println(i+1 + arrayMenu.get(i).getName() +"("+ arrayMenu.get(i).getCategory() +")"+ "Rp. " + arrayMenu.get(i).getPrice());
            }
            else{
                System.out.println("Menu Tidak Ada");
            }
        }
    }
}
