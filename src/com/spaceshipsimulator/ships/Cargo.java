package com.spaceshipsimulator.ships;
import java.util.Scanner;

public class Cargo extends SpaceShip {

    private int cargo;
    private int loadQuantity;
    private String CargoShipASCII = "\t             `. ___\n" +
            "                    __,' __`.                _..----....____\n" +
            "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
            "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
            ",'________________                          \\`-._`-','\n" +
            " `._              ```````````------...___   '-.._'-:\n" +
            "    ```--.._      ,.                     ````--...__\\-.\n" +
            "            `.--. `-`                       ____    |  |`\n" +
            "              `. `.                       ,'`````.  ;  ;`\n" +
            "                `._`.        __________   `.      \\'__/`\n" +
            "                   `-:._____/______/___/____`.     \\  `\n" +
            "                               |       `._    `.    \\\n" +
            "                               `._________`-.   `.   `.___\n" +
            "                                                  `------'`";

    public Cargo(String name, String galacticLicensePlate, int cargo) {
        super(name, galacticLicensePlate);
        this.cargo = cargo;
        this.loadQuantity = 0;
    }

    public void load() {
        if (loadQuantity < getCargo()) {
            loadQuantity++;
            System.out.println("Added Load");
        } else {
            System.out.println("Can't add more Cargo.");
        }
    }

    public void unload() {
        if (loadQuantity > 0) {
            loadQuantity--;
            System.out.println("Extracted Load");
        } else {
            System.out.println("There is no load to be Extracted");
        }
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getLoadQuantity(){return  loadQuantity;}

    @Override
    public String toString() {
        return "\n" + CargoShipASCII +
                "\n Máximum Cargo Load: " + getCargo() + " - " + " (Actual Cargo: " + loadQuantity + ")" +
                "\n Space Ship Name: " + getName() +
                "\n Galactic License Plate: " + getGalacticLicensePlate();
    }


}
