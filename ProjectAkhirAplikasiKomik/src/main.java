/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import database.Database;
import datauser.dataUser;
import login.Login;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("_______________________");
        System.out.println("|    MASUK SEBAGAI    |");
        System.out.println("|1.      Admin        |");
        System.out.println("|2.      User         |");
        System.out.println("_______________________");
        System.out.println("");
        System.out.print("PILIHAN> ");

        int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    Login.Login();
                    Database.run();
                    break;
                case 2:
                    dataUser.userRun();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
    }
}
