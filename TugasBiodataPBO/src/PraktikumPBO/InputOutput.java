package PraktikumPBO;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama     : ");
    String Nama = input.nextLine();
        
        System.out.print("Alamat   : ");
    String Alamat = input.nextLine();
        
        System.out.print("No. Telp : ");
    double No = input.nextDouble();
    input.nextLine();
    
        System.out.print("Email    : ");
    String email = input.nextLine();
    
        
    String nama= ("Gilang Reza Saputra");
    System.out.println("Nama      : "+nama);
    String alamat= ("Griya Abdi Negara Sukabumi, Bandar lampung");
    System.out.println("Alamat    : "+alamat);
    String nomor = ("085768294239");
    System.out.println("No. Telp  : "+nomor);
    String Email = ("Gilangreza944@yahoo.co.id");
    System.out.println("Email     : "+Email);
    }
    
}
