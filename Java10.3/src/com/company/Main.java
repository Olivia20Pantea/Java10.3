package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> lista = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        lista.add(9);
        lista.add(4);
        lista.add(1);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        meniu();
    }
    public static void meniu()
    {
        String r= "yes";
        while(r.equals("yes"))
        {
            System.out.println("MENIU"+"\n"+"1.Adaugare nod"+"\n"+ "2.Stergere nod"+"\n"+ "3.Afisare lista");
            System.out.println("Introduceti o optiune: ");
            int x=scanner.nextInt();
            switch (x)
            {
                case 1:
                    adaugare();
                    break;
                case 2:
                    stergere();
                    break;
                case 3:
                    afisare();
                    break;
                default:
                    System.out.println("Optiune inexistenta!");
            }
            scanner.nextLine();
            System.out.println("Doriti sa continuati? yes/no: ");
            r=scanner.nextLine();
        }
    }
    static void adaugare()
    {
        System.out.println("Introduceti nodul pe care doriti sa il adaugati: ");
        int x=scanner.nextInt();
        lista.add(x);
    }
    static void stergere()
    {
        System.out.println("Introduceti nodul pe care doriti sa il stergeti: ");
        int x=scanner.nextInt();
        lista.remove(lista.lastIndexOf(x));
    }
    static void afisare()
    {
        sortare();
        lista.forEach(l -> System.out.println(l));
    }
    static void sortare()
    {
        int ok,i,aux;
        do{
            ok=0;
            for(i=0;i<lista.size()-2;i=i+2)
                if(lista.get(i)>lista.get(i+2))
                {
                    aux=lista.get(i);
                    lista.set(i,lista.get(i+2));
                    lista.set(i+2,aux);
                    ok=1;
                }
        }while(ok==1);
        do{
            ok=0;
            for(i=1;i<lista.size()-2;i=i+2)
                if(lista.get(i)<lista.get(i+2))
                {
                    aux=lista.get(i);
                    lista.set(i,lista.get(i+2));
                    lista.set(i+2,aux);
                    ok=1;
                }
        }while(ok==1);
    }
}