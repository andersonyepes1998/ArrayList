package com.edu.cesde;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);

        ArrayList<Integer> data = new ArrayList();

        data.add(0,5);
        data.add(2);
        data.add(3);
        data.add(2,10);

        /*System.out.println(data.get(0));*/

        for (int i = 0; i < data.size(); i++ ){
            System.out.println(data.get(i));
        }
    }
}
