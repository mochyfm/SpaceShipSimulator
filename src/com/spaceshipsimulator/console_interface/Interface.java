package com.spaceshipsimulator.console_interface;

import com.spaceshipsimulator.ships.Cargo;
import com.spaceshipsimulator.ships.SpaceShip;

import java.util.Scanner;

public class Interface {

    public Interface() {

        Scanner valueInput = new Scanner(System.in);
        int userShipSelection;

        SpaceShip spaceShip = null;
        boolean spaceShipType;      // True -> Cargo | False -> Standard

        System.out.println("\n" + "Hello!, I have two choices for you; no, they are not color pills");

        System.out.println("Select a Space Ship: ");
        System.out.println("\n" + "1. Standard Space Ship");
        System.out.println("2. Cargo Space Ship");

        System.out.print("\n" + "Your answer: ");
        userShipSelection = valueInput.nextInt();
        valueInput.nextLine();

        System.out.println("\n\n" + "Nice Choice!, now answer me some questions...");
        System.out.print("\n" + "Wich name would you like to put to your Ship?: ");
        String shipName = valueInput.nextLine();
        System.out.print("\n" + "Ok, now... wich Galactic License Plate would you rather to put?: ");
        String licensePlate = valueInput.nextLine();

        if (userShipSelection == 2) {
            spaceShipType = true;

            System.out.println("Ok!, last one (I promise). Just because you have chosen a cargo ship.");
            System.out.print("How many containers can your ship carry?: ");
            int containersNumber = valueInput.nextInt();
            valueInput.nextLine();

            spaceShip = new Cargo(shipName, licensePlate, containersNumber);
        } else {
            spaceShipType = false;
            spaceShip = new SpaceShip(shipName, licensePlate);
        }

        System.out.println("Nice!, Thank you for your patience.");

        boolean menuStatus = true;

        while (menuStatus) {


            System.out.println("\n" + "Welcome captain!" + "\n");

            System.out.println(spaceShip + "\n");
            System.out.println("Current Horizontal Speed: " + spaceShip.getxSpeed());
            System.out.println("Current Horizontal Position: " + spaceShip.getxCoordenate());

            System.out.println("\n" + "We are awaiting orders: " + "\n");
            System.out.println("\t" + "1. Accelerate");
            System.out.println("\t" + "2. Brake!");
            System.out.println("\t" + "3. STOP");

            if (spaceShipType) {
                System.out.println("\t" + "4. Load Cargo");
                System.out.println("\t" + "5. Unload Cargo");
            }

            System.out.println("\n\t" + "0. We are landing here. (exit)" + "\n");

            System.out.print("Your orders?:");
            int captainOrder = valueInput.nextInt();

            switch (captainOrder) {
                case 1:
                    System.out.print("\n\n" + "Yes sir! How much do you want to accelerate?: ");
                    float accelerateValue = valueInput.nextInt();
                    valueInput.nextLine();

                    spaceShip.speedUp(accelerateValue);
                    break;
                case 2:
                    System.out.println("Yes sir! Pulling up the brake");
                    spaceShip.brake();
                    break;
                case 3:
                    System.out.println("Inmediatly Sir!! - Emergency brake ON");
                    spaceShip.emergencyStop();
                    break;
                case 4:
                    if (spaceShipType) {
                        System.out.println("Adding a container... ");
                        ((Cargo) spaceShip).load();
                    } else {
                        break;
                    }
                    break;
                case 5:
                    if (spaceShipType) {
                        System.out.println("Removing a container");
                        ((Cargo) spaceShip).unload();
                    } else {
                        break;
                    }
                    break;
                case 0:
                    System.out.println("Landing here... ");
                    menuStatus = false;
                    break;
                default:
                    System.out.println("Im sorry captain, what did you said?");
                    break;
            }


        }

    }

}
