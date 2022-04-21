package com.spacesimulator.ships;

import java.util.Scanner;

public class SpaceShip {
    private String name;
    private String galacticLicensePlate;
    private float acceleration;
    private float xSpeed;
    private float ySpeed;
    private float xCoordenate;
    private float yCoordenate;
    private float xDirection;
    private float yDirection;
    private String SpaceShipASCII =
                    "__\n" +
                    "| \\\n" +
                    "=[_|H)--._____\n" +
                    "=[+--,-------'\n" +
                    " [|_/\"\"" + "\n";

    public SpaceShip(String name, String galacticLicensePlate) {
        this.name = name;
        this.galacticLicensePlate = galacticLicensePlate;
        this.acceleration = 0.0f;
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
        this.xCoordenate = 0.0f;
        this.yCoordenate = 0.0f;
        this.xDirection = 0.0f;
        this.yDirection = 0.0f;
    }