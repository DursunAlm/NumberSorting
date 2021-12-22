/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbersorting;

import java.util.Scanner;
/*
 *Patika dev kapsamındaki java101 dersi içerisindeki koşullu durumlar sayı sıralama ödevi
 */
/**
 *
 * @author alimdursun
 */
public class NumberSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("sıralamak istediğiniz sayıları girin: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if((a>b)&&(a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if((b>a)&&(b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else{
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }
    }
    
}
