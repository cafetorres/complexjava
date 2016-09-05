package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        coplex c1 = new coplex(0,0);
        coplex c2 = new coplex(0,0);
        coplex c3 = new coplex (0,0);
        Scanner s=new Scanner(System.in);
	// write your code here
        System.out.println("Ingresa el primer numero real: ");
        c1.setR(s.nextInt());
        System.out.println("Ingresa el primer numero imaginario: ");
        c1.setI(s.nextInt());
        System.out.println("Ingresa el segundo numero real: ");
        c2.setR(s.nextInt());
        System.out.println("Ingresa el segundo numero imaginario: ");
        c2.setI(s.nextInt());
        System.out.println("Suma:");
        c3.suma(c1,c2);
        System.out.println(c3.getR()+"+"+c3.getI()+"i");
        System.out.println("Resta:");
        c3.resta(c1, c2);
        System.out.println(c3.getR()+""+c3.getI()+"i");
        System.out.println("Multiplicacion:");
        c3.mult(c1,c2);
        System.out.println(c3.getR()+"+"+c3.getI()+"i");


    }
}
