package com.leartocode;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

private Dealership dealership;

    public UserInterface() {

    }
    public void display(){
        init();

        boolean running= true;
        Scanner scanner = new Scanner(System.in);

        while(running) {


            System.out.println("1) process Get Price Request");
            System.out.println("2) process GetByMAkeModelRequest");
            System.out.println("3) processGetByYearRequest");
            System.out.println("4) processGetByColorRequest");
            System.out.println("5) processGetByMileageRequest");
            System.out.println("6) processGetByVehicleTypeRequest") ;
            System.out.println("7) processGetAllVehicleRequest");
            System.out.println("8) processAddVehicleRequest");
            System.out.println("9) processRemoveVehicleRequest");
            System.out.println("0) Back");
            System.out.println("Enter your selection: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    processGetPriceRequest();
                    break;

                case "2":
                    processGetByMAkeModelRequest();
                    break;

                case "3":
                    processGetByYearRequest();
                    break;

                case "4":
                    processGetByColorRequest();
                    break;

                case "5":
                    processGetByMileageRequest();
                    break;

                case "6":
                    processGetByVehicleTypeRequest();
                    break;

                case "7":
                    processGetAllVehiclesRequest();
                    break;

                case "8":
                    processAddVehicleRequest();
                    break;

                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "0":
                    running =false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;

            }

        }






    }
    private void init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();



    }

    private void displayVehicles(List<Vehicle> vehicles) {

            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }

    }
    public void processGetPriceRequest(){

    }

    public void processGetByMAkeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
}
