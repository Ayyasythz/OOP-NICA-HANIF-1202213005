package MODUL_1;

import java.util.Scanner;

public class User {
    private String nama;
    private String phone_number;

    public User() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public  void Register(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        setNama(nama);
        System.out.print("No Handphone : ");
        phone_number = input.nextLine();
        setPhone_number(phone_number);
    }

    public void DisplayUser(){
        System.out.println("Register Success");
        System.out.println("Name : " + getNama());
        System.out.println("Phone Number : " + getPhone_number());
    }
}

