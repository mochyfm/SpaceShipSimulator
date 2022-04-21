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

    public static Cargo createCargoShip() {
        Scanner inputMedia = new Scanner(System.in);

        System.out.print("\n" + "Helloo! " + System.getProperty("user.name") + ", tell me the name of your mega cool Cargo Ship: ");
        String userSpaceShipName = inputMedia.nextLine();

        System.out.print("Thank you! now please tell me now the License Plate for your the " + userSpaceShipName + ": ");
        String userGalacticLicensePlate = inputMedia.nextLine();

        System.out.println("\n" + "Those names are awesome!, Could you tell me a Maximum Inventory Value for your Cargo Ship?.");
        System.out.print("This is the last question don't worry: ");
        int userCargo = inputMedia.nextInt();
        inputMedia.nextLine();

        System.out.print("\n" + "Very Cool!, thank you for the information. Enjoy the drive!");

        return new Cargo(userSpaceShipName, userGalacticLicensePlate, userCargo);
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
