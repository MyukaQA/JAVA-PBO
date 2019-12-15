/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.DriverManager;

/**
 *
 * @author Asus
 */
public class databaseKomik extends Database {

    
    public static void showData() {
        String sql = "SELECT * FROM komik ";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|           DATA KOMIK           |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int idKomik = rs.getInt("id_komik");
                String judul = rs.getString("judul");
                int harga = rs.getInt("harga");

                
                System.out.println(String.format("%d. %s -- (%s)", idKomik, judul, harga));
//                System.out.println(String.format(" %s ", harga));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void insertKomik() {
        try {
            // ambil input dari user
            System.out.print("Judul: ");
            String judul = input.readLine().trim();
            System.out.print("harga: ");
            int harga = Integer.parseInt(input.readLine());
 
            // query simpan
            String sql = "INSERT INTO komik (judul, harga) VALUE('%s', '%s')";
            sql = String.format(sql, judul, harga);

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
          }

    }
    static void updateKomik() {
        try {
            // ambil input dari user
            System.out.print("ID yang mau diedit: ");
            int idKomik = Integer.parseInt(input.readLine());
            System.out.print("Judul: ");
            String judul = input.readLine().trim();
            System.out.print("harga: ");
            int harga = Integer.parseInt(input.readLine());

            // query update
            String sql = "UPDATE komik SET judul='%s', harga='%s' WHERE id_komik=%d";
            sql = String.format(sql, judul, harga, idKomik);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void deleteKomik() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int idBuku = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM komik WHERE id_komik=%d", idBuku);
            

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
