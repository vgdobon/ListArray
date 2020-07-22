package com.hiberus;

import java.util.ArrayList;
import java.util.List;

public class ArrayListII {
    public static void main(String[] args) {
        List<Float> miListaFloat = new ArrayList<Float>();
        miListaFloat.add(1f);
        miListaFloat.add(2f);
        miListaFloat.add(3f);

        miListaFloat.add(0,1.2f);

        List<Integer> miListaIntegeR= new ArrayList<Integer>();
        miListaIntegeR.add(1);
        miListaIntegeR.add(2);
        miListaIntegeR.add(3);
        miListaIntegeR.add(4);
        System.out.println(miListaIntegeR.get(2));

        for (Integer valor:miListaIntegeR) {
            System.out.println(valor);
        }

    }
}
