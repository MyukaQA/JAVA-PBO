/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/komik";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    public static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader input = new BufferedReader(inputStreamReader);


    public static void run(){
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }
            stmt.close();
            conn.close();

        }catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    private static void showMenu() {
        System.out.println("\n=========== MENU UTAMA =========");
        System.out.println("|1.        Insert Data         |");
        System.out.println("|2.         Show Data          |");
        System.out.println("|3.     Show Data Volume       |");
        System.out.println("|4.        Update Data         |");
        System.out.println("|5.        Delete Data         |");
        System.out.println("================================");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    databaseKomik.insertKomik();
                    break;
                case 2:
                    databaseKomik.showData();
                    break;
                case 3:
                    showMenuVolume();
                    break;
                case 4:
                    databaseKomik.updateKomik();
                    break;
                case 5:
                    databaseKomik.deleteKomik();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void showMenuVolume() {
        System.out.println("\n=========== MENU JUDUL VOLUME =========");
        System.out.println("|1.        Judul Volume Naruto        |");
        System.out.println("|2.        Judul Volume Bleach        |");
        System.out.println("|3.       Judul Volume Doraemon       |");
        System.out.println("|4.       Judul Volume YU-GI-OH!      |");
        System.out.println("|5.       Judul Volume One Piece      |");
        System.out.println("=======================================");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    databaseVolumeNaruto.showVolumeNaruto();
                    break;
                case 2:
                    databaseVolumeBleach.showVolumeBleach();
                    break;
                case 3:
                    databaseVolumeDoraemon.showVolumeDoraemon();
                    break;
                case 4:
                    databaseVolumeYugioh.showVolumeYugioh();
                    break;
                case 5:
                    databaseVolumeOnepiece.showVolumeOnepiece();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
