package com.leartocode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class DealershipFileManager {
    private final String FileName = "dealership.csv";
    public Dealership getDealership(){
        Dealership dealership = null;
        try {
            FileReader fileReader = new FileReader(FileName);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            int counter = 0;
            while ((input = bufReader.readLine()) != null) {
                String[] getDealerInfo = input.split("\\|");
                String name = getDealerInfo[0];
                String address = getDealerInfo[1];
                String phoneNumber = getDealerInfo[2];

                 dealership = new Dealership(name, address, phoneNumber);

                //Stream<String> lines = bufReader.lines().skip(1);
                if (counter != 0) {
                    String[] parts = input.split("\\|");
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);


                    Vehicle vehicles = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicles);


                }
                counter++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
return dealership;


    }
    private void saveDealership(){

    }
}
