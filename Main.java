package com.malcolm;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<CerealClass> allCereals = new ArrayList<>();
        addTestData(allCereals);
        for(CerealClass cereal:allCereals) {
            System.out.println(String.format("how many boxes of %s?",cereal.getCerealName()));
        int cerealQuantity=userInput.nextInt();
            double tempCornVal=cereal.getCornContainsGrams()*cerealQuantity;
            double tempSugarVal=cereal.getSugarContainsGrams()*cerealQuantity;
            double temp

        }
//allCereals.add


        System.out.println("Hello welcome to RobCo cereal administrator!" +
                "\nOur company is proud to produce these three fine cereals:" +
                "\nRice Crunchies, Morning Flakes, and Trianglz.");

        System.out.println("\nPlease enter the quantities you will need for your store\n" +
                "we will display all the information you could even need about these cereals.\nHow many boxes of Rice Crunchies?");
        int riceCrunchyQuantity = userInput.nextInt();
        System.out.println("How many boxes of Morning Flakes?");
        int morningFlakeQuantity = userInput.nextInt();
        System.out.println("How many boxes of Trianglz?");
        int trianglzQuantity = userInput.nextInt();
    }
        private static void addTestData(ArrayList<CerealClass> allCereals) {
            CerealClass riceCrunchies = new CerealClass("Rice Crunchies", .4, 0, .02, .001);
            CerealClass morningFlakes = new CerealClass("Morning Flakes", 0, .35, .04, .001);
            CerealClass trianglz = new CerealClass("Trianglz", .2, .2, .035, .0005);
            allCereals.add(0, riceCrunchies);
            allCereals.add(1, morningFlakes);
            allCereals.add(2, trianglz);
        }

        /*HashMap<Double,Double> riceHash=new HashMap<>();
        HashMap<Double,Double> cornHash=new HashMap<>();
        HashMap<Double,Double> sugarHash=new HashMap<>();
        HashMap <Double,Double> saltHash=new HashMap<>();

        riceHash.put(100., .5);
        riceHash.put(500., .43);
        riceHash.put(500.000000000001, .30);

        cornHash.put(80., .50);
        cornHash.put(80.0000000000001, .41);

        sugarHash.put(200., 1.15);
        sugarHash.put(200.000000000001, .95);

        saltHash.put(.00000001, .7);*/
    }


