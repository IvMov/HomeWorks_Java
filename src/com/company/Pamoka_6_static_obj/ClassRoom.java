package com.company.Pamoka_6_static_obj;

import java.time.LocalDateTime;

public class ClassRoom {
    public static void main(String[] args) {
        Asmuo asm1 = new Asmuo("Ivan", "Movchanets", (byte) 30);
        Asmuo asm2 = new Asmuo("Jonas", "Jonaitis", (byte) 15);
        System.out.println( asm1.canDrink());
        System.out.println( asm2.canDrink());
        System.out.println(asm2.grazinuSkaiciusPriimaVardas("Vasisfddsfdsa"));
        System.out.println(asm2.grazinuSkaiciusNekoNePriimu());
       asm2.nekoNeGrazinu();
        System.out.println(LocalDateTime.now());

    }
}
