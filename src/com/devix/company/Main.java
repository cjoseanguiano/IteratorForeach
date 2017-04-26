package com.devix.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> colores = Arrays.asList("A", "B", "C", "D", "E");

        for (String color : colores) {
            System.out.println("El color es :" + color);
        }
    }
}
