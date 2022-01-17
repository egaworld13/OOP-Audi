package com.ega;

 public class Main { // galvenā klase, kurā tiek izsauktas pārējās klases
     public static void main(String[] args) {


        Second Audi = new Second();         //izveido jaunu second klases objektu.
         System.out.println("Pieejamā komplektācija: ");
         System.out.println("Kārbas tips: ");
            Audi.atrumkarba();              // izsauc metodi ar tās opcijām.
         System.out.println("Krāsa: ");
            Audi.krasa();
         System.out.println("Dzinējs: ");
             Audi.dzinejs();

         System.out.println();
         System.out.println();


         System.out.println("Jūsu komplektācija:");

         System.out.println("Kārbas tips: ");
            System.out.println(Audi.karba);  // izsauc atrībūtus, jeb mainīgos no otrās klases.
         System.out.println("Krāsa: ");
            System.out.println(Audi.krasa);
         System.out.println("Dzinējs: ");
            System.out.println(Audi.dzinejs);
//


     }
 }


