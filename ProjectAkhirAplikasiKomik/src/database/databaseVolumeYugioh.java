/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Asus
 */
public class databaseVolumeYugioh extends Database {
        static void showVolumeYugioh() {
        String sql = "SELECT * FROM volume_yugioh";
        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|     DATA VOLUME YU-GI-OH!      |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int idVolume = rs.getInt("id_volume");
                String judul = rs.getString("judul");
                
                System.out.println(String.format("%d.   %s", idVolume, judul));
            }
            System.out.println("=========== MENU EDIT ===========");
            System.out.println("|a.    Tambah Data Volume       |");
            System.out.println("|b.    Update Data Volume       |");
            System.out.println("|c.    Delete Data Volume       |");
            System.out.println("=================================");
            System.out.println("");
            System.out.print("PILIHAN> ");
            
            try {
                String pilihan = input.readLine().trim();
                switch (pilihan) {
                    case "a":
                        insertKomikVolumeYugioh();
                        break;
                    case "b":
                        updateKomikVolumeYugioh();
                        break;
                    case "c":
                        deleteKomikVolumeYugioh();
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void insertKomikVolumeYugioh() {
        try {
            // ambil input dari user
            System.out.print("id_komik: ");
            String id = input.readLine().trim();
            System.out.print("Judul: ");
            String judul = input.readLine().trim();

            // query simpan
            String sql = "INSERT INTO volume_yugioh (id_komik,judul) VALUE(%s,'%s')";
            sql = String.format(sql,id, judul);

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void updateKomikVolumeYugioh() {
        try {
            // ambil input dari user
            System.out.print("ID yang mau diedit: ");
            int idKomik = Integer.parseInt(input.readLine());
            System.out.print("Judul: ");
            String judul = input.readLine().trim();

            // query update
            String sql = "UPDATE volume_yugioh SET judul='%s' WHERE id_volume=%d";
            sql = String.format(sql, judul, idKomik);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void deleteKomikVolumeYugioh() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int idKomik = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM volume_yugioh WHERE id_volume=%d", idKomik);
            

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
