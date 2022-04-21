package com.spaceshipsimulator.ships;

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


}
