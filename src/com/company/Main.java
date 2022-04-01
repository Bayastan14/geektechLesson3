package com.company;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.add("White");
        color.add("Pink");
        color.add("Yellow");
        for (String colors : color){
            System.out.println(color);

            for (int i = 0; i < color.size(); i++) {
                System.out.println(color.get(i));

                Collections.reverse(color);
                System.out.println(color);

                Collections.shuffle(color);
                System.out.println(colors);


            }

            }
        }

    }

