package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] GuestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("inserisci il tuo nome:");
        String name = scanner.nextLine();


        //verificare se il nome è presente nella lista

        boolean guestpresent = false;

        /* for(int i=0; i< GuestList.length; i++){
            if(GuestList[i].equals(name)){
                guestpresent = true;
            }
        }

         */

        // Check guest ciclo while

        int i = 0;

        while(i< GuestList.length){
            if(name.equals(GuestList[i])){
                guestpresent = true;
                break;
            } else{
                i++;
            }
        }

        //stampare se il nome è presente:"prego può entrare" e se non è presente stampare "mi spiace non può entrare"

        if(guestpresent){
            System.out.println("Prego può entrare");
        } else{
            System.out.println("Mi spiace non può entrare");
        }









        scanner.close();

    }
}
