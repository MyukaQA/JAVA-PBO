package login;

import java.util.Scanner;

public class Login {
    public static void Login() {
        String datauser[]={"mylian","rizqi","khamim","awe"};
        String datapass[]={"1A","1B","1C","1D"};
        int ketemu; 
        String username; 
        String password;
        int i;
        
        System.out.println("___________________________________________________");
        System.out.println("|                  SILAHKAN LOGIN                 |");
        System.out.println("|       UNTUK MENGAKSES DATA RENTAL KOMIK         |");
        System.out.println("|_________________________________________________|");
        Scanner masukan= new Scanner(System.in);
        for (String j = "Y"; j.equals("Y")||j.equals("y"); ){
            System.out.print("Masukkan Username = "); 
            username = masukan.nextLine();
            System.out.print("Masukkan Password = "); 
            password = masukan.nextLine();
            i=0; 
            ketemu=0; 
            while (i<4 && ketemu!=1){ 
                if (datauser[i].equals(username) && datapass[i].equals(password)){ 
                ketemu=1;
                }else{
                i++;
                } 
            }
            if(ketemu==1){ 
                System.out.println("======================="); 
                System.out.println("|SELAMAT DATANG "+username+"|"); 
                System.out.println("======================="); 
                
                break;
            }else{ 
                System.out.println("Username atau Password anda salah, tekan y untuk login, tekan t untuk keluar"); 
            j = masukan.nextLine();
            } 
        }
    }
}
