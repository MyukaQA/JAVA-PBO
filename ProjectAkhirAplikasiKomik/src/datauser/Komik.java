package datauser;

import database.Database;
import java.util.Scanner;
import datauser.dataArray;
import sewa.Penyewa;
import java.io.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Komik extends Database {
    
    private static int choose(int pilih, String volume, int sewa){
        int harga = 0;
        String judul = dataArray.judulKomik(pilih);
        System.out.println("Pesanan anda nomor  : " + pilih);
        System.out.println("Judul Komik         : " + judul);
        System.out.println("Judul Volume        : " + volume);
        harga = harga + dataArray.hargaKomik(pilih) * sewa;
        int harganow = dataArray.hargaKomik(pilih)*sewa;
        System.out.println("Harga               : " + harganow);
        return harga;
    }
    public static void pilih() throws IOException {
        int sewa = 0;
        Scanner scan = new Scanner(System.in);
        InputStreamReader isr = new
        InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(isr);
//        inisialisasi pembayaran awal
            
        System.out.println(" PEMINJAMAN ");
        System.out.print("Nama Penyewa\t\t : ");
        String nama = Input.readLine();
        System.out.print("No Hp \t\t\t : ");
        String nohp = Input.readLine();
        System.out.print("Alamat \t\t\t : ");
        String alamat = Input.readLine();
        System.out.print("Jaminan \t\t : ");
        String jaminan = Input.readLine();

        int harga = 0;
        for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
            System.out.println(" ____________________________________");
            System.out.println("|     SILAHKAN PILIH JUDUL KOMIK     |");
            System.out.println("|____________________________________|");
            System.out.println("|  Judul           |      Harga      |");
            System.out.println("|1. Naruto         |   Rp 4000,00    |");
            System.out.println("|2. Bleach         |   Rp 2000,00    |");
            System.out.println("|3. Doraemon       |   Rp 1500,00    |");
            System.out.println("|4. YU-GI-OH!      |   Rp 2000,00    |");
            System.out.println("|5. One Piece      |   Rp 5000,00    |");
            System.out.println("|__________________|_________________|");

    //        pengguna memasukkan nomor pesanan
            System.out.println("_____________________________________");
            System.out.print("Masukkan Nomor Pesanan : ");
            int pilih = scan.nextInt();
            System.out.print("Masukkan Judul Volume yang diinginkan (1-10) : ");
            int judulVolum = scan.nextInt();
            System.out.print("Masukkan Lama Sewa (perhari): ");
            sewa = scan.nextInt();
            System.out.println("_____________________________________");

        if (pilih == 1){
            harga=harga+choose(pilih, dataArray.judulVolumeNaruto(judulVolum), sewa);
        }else if (pilih == 2){
            harga=harga+choose(pilih, dataArray.judulVolumeBleach(judulVolum), sewa);
        }else if (pilih == 3){
            harga=harga+choose(pilih, dataArray.judulVolumeDoraemon(judulVolum), sewa);
        }else if (pilih == 4){
            harga=harga+choose(pilih, dataArray.judulVolumeYugioh(judulVolum), sewa);
        }else if (pilih == 5){
            harga=harga+choose(pilih, dataArray.judulVolumeOnepiece(judulVolum), sewa);
        }else{
//      jika selain nomor satu sampai tiga, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
        System.out.println("Nomor yang dipilih tidak ada di menu.");
        }
//      User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
        System.out.println("Apakah anda mau melanjutkan? Y/T");
        i = scan.next();
        }
    
        System.out.println("_____________________________________");
        
        Penyewa n = new Penyewa();
            n.setNama(nama);
            n.setNohp(nohp);
            n.setAlamat(alamat);
            n.setJaminan(jaminan);
            System.out.println("\n==================== STRUK PEMINJAMAN ===================");
            System.out.println("Nama Penyewa \t\t : "+n.getNama());
            System.out.println("No.Hp \t\t\t : "+n.getNohp());
            System.out.println("Alamat \t\t\t : "+n.getAlamat()); 
            System.out.println("Jaminan \t\t : "+n.getJaminan());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Calendar tgl = Calendar.getInstance();
            System.out.println("Tanggal Pinjam \t\t : "+tgl.getTime());
            tgl.add(Calendar.DATE, sewa);
            System.out.println("BATAS PENGEMBALIAN \t : "+sdf.format(tgl.getTime()));
            System.out.println("Total pembayaran sebesar : " +"Rp."+harga);
            System.out.println("_______________________ INFORMASI _______________________");
            System.out.println("Denda telat /hari \t : Rp.3000");
            System.out.println("=================== JANGAN TELAT YAAA ===================");
    }
}
        