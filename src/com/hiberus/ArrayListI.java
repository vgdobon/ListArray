package com.hiberus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListI {
    public static void main(String[] args) {
        List<String> myListaString = new java.util.ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un color para añadir a la lista");
        String nuevoColor = sc.nextLine();

        myListaString.add(nuevoColor);
        myListaString.add("Rojo");
        myListaString.add("Amarillo");

        for (int i = 0; i < myListaString.size(); i++) {
            System.out.println(myListaString.get(i));
        }



    }
}
