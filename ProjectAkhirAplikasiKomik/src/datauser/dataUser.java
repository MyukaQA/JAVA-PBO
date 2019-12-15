/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datauser;

import sewa.Penyewa;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import datauser.dataArray;

/**
 *
 * @author Asus
 */
public class dataUser {
    public static void userRun(){
        InputStreamReader isr = new
        InputStreamReader(System.in);
        BufferedReader Input = new BufferedReader(isr);
        try {
            int pil;
        do {
            System.out.println("\n======= MENU USER =========");
            System.out.println("|1.      Peminjaman       |");
            System.out.println("===========================");
            System.out.print("PILIHAN>  ");
        pil = Integer.parseInt(Input.readLine());
        switch (pil){
        case 1:            
            Komik.pilih();
            break;
        } 
            System.out.println("0. Menu Utama");
            System.out.println("9. Tutup");
            System.out.print("Pilihan Anda [0/9] : ");
            pil = Integer.parseInt(Input.readLine());
        }
        while (pil != 9); } 
        catch (IOException e){
            System.out.println("Error!!"+e.getMessage());
        }
    }
}
