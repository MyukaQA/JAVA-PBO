package datauser;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class dataArray {
    public static String judulKomik(int index){
        ArrayList<String> Jkomik = new ArrayList<String>();
        Jkomik.add("naruto");
        Jkomik.add("Bleach");
        Jkomik.add("Doraemon");
        Jkomik.add("YU-GI-OH!");
        Jkomik.add("One Piece");
        return Jkomik.get(index-1);
    }
    
    public static int hargaKomik(int index){
        ArrayList<Integer> Hvolume = new ArrayList<Integer>();
        Hvolume.add(4000);
        Hvolume.add(2000);
        Hvolume.add(1500);
        Hvolume.add(2000);
        Hvolume.add(5000);
        return Hvolume.get(index-1);
    }
    
    public static String judulVolumeNaruto(int index){
        ArrayList<String> JVNaruto = new ArrayList<String>();
        JVNaruto.add("Uzumaki Naruto!");
        JVNaruto.add("Konohamaru");
        JVNaruto.add("Uchiha Sasuke!");
        JVNaruto.add("Hatake Kakashi!");
        JVNaruto.add("Pride Goeth Before a Fall");
        JVNaruto.add("Not Sasuke!");
        JVNaruto.add("Kakashi's Decision");
        JVNaruto.add("You Failed!");
        JVNaruto.add("The Worst Client");
        JVNaruto.add("Target #2");
        return JVNaruto.get(index-1);
    }
    
    public static String judulVolumeBleach(int index){
        ArrayList<String> JVBleach = new ArrayList<String>();
        JVBleach.add("Death & Strawberry");
        JVBleach.add("Starter");
        JVBleach.add("Headhittin'");
        JVBleach.add("WHY DO YOU EAT IT?");
        JVBleach.add("Binda-blinda");
        JVBleach.add("microcrack.");
        JVBleach.add("The Pink Cheeked Parakeet");
        JVBleach.add("Chase Chad Around");
        JVBleach.add("Monster and a Transfer [Struck Down]");
        JVBleach.add("Monster and a Transfer pt.2 [The Deathberry]");
        return JVBleach.get(index-1);
    }
    
    public static String judulVolumeDoraemon(int index){
        ArrayList<String> JVDoraemon = new ArrayList<String>();
        JVDoraemon.add("All The Way From a Future World");
        JVDoraemon.add("The Prophecy of Doraemon");
        JVDoraemon.add("Transforming Biscuits");
        JVDoraemon.add("Operation: Secret Spy");
        JVDoraemon.add("Kobe Abe");
        JVDoraemon.add("Antique Competition");
        JVDoraemon.add("Peko Peko Grasshopper");
        JVDoraemon.add("Chin Up To The Ancestors");
        JVDoraemon.add("Hunting Shades");
        JVDoraemon.add("Flattering Lipstick");
        return JVDoraemon.get(index-1);
    }
    
    public static String judulVolumeYugioh(int index){
        ArrayList<String> JVYugioh = new ArrayList<String>();
        JVYugioh.add("The Puzzle of the Gods");
        JVYugioh.add("Lying Eyes");
        JVYugioh.add("Hard Beat!!");
        JVYugioh.add("Escaped Prisoner");
        JVYugioh.add("The False Prophet");
        JVYugioh.add("Into the Fire");
        JVYugioh.add("The Face of Truth");
        JVYugioh.add("The Poison Man");
        JVYugioh.add("The Cards with Teeth (Part 1)");
        JVYugioh.add("The Cards with Teeth (Part 2)");
        return JVYugioh.get(index-1);
    }
    
    public static String judulVolumeOnepiece(int index){
        ArrayList<String> JVOnepiece = new ArrayList<String>();
        JVOnepiece.add("Romance Dawn");
        JVOnepiece.add("Luffy si Topi Jerami");
        JVOnepiece.add("Zoro si Pemburu Perompak");
        JVOnepiece.add("Kapten Morgan si Lengan Kapak");
        JVOnepiece.add("Raja Bajak Laut dan Sang Pendekar Pedang");
        JVOnepiece.add("Orang Pertama");
        JVOnepiece.add("Sahabat");
        JVOnepiece.add("Munculnya Nami");
        JVOnepiece.add("Si Wanita Iblis");
        JVOnepiece.add("Insiden di Rumah Minum");
        return JVOnepiece.get(index-1);
    }
}
