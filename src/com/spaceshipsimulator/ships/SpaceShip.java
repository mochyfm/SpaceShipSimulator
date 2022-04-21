package com.spaceshipsimulator.ships;

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

    public static SpaceShip createStandardSpaceShip() {
        Scanner inputMedia = new Scanner(System.in);

        System.out.print("\n" + "Helloo! " + System.getProperty("user.name") + ", tell me the name of your mega cool SpaceShip: ");
        String userSpaceShipName = inputMedia.nextLine();

        System.out.print("Thank you!, but we are not done yet. Please tell me now the License Plate for your new Space Ship:");
        String userGalacticLicensePlate = inputMedia.nextLine();

        System.out.print("Very Cool!, thank you for the information. Enjoy the drive!" + "\n");

        return new SpaceShip(userSpaceShipName, userGalacticLicensePlate);
    }

    public void speedUp(float accelerationValue) {

        float newSpeed = accelerationValue + getxSpeed();
        setxSpeed(newSpeed);

        float newPosition = getxSpeed() + getxCoordenate();
        setxCoordenate(newPosition);
    }

    // Name Field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Galatic License Plate Field

    public String getGalacticLicensePlate() {
        return galacticLicensePlate;
    }

    public void setGalacticLicensePlate(String galacticLicensePlate) {
        this.galacticLicensePlate = galacticLicensePlate;
    }

    // Acceleration Field

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    // X-Speed Field

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Y-Speed Field

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // X-Coordenate Field

    public float getxCoordenate() {
        return xCoordenate;
    }

    public void setxCoordenate(float xCoordenate) {
        this.xCoordenate = xCoordenate;
    }

    // Y-Coordenate Field

    public float getyCoordenate() {
        return yCoordenate;
    }

    public void setyCoordenate(float yCoordenate) {
        this.yCoordenate = yCoordenate;
    }

    // X-Direction Field

    public float getxDirection() {
        return xDirection;
    }

    public void setxDirection(float xDirection) {
        this.xDirection = xDirection;
    }

    // Y-Direction Field

    public float getyDirection() {
        return yDirection;
    }

    public void setyDirection(float yDirection) {
        this.yDirection = yDirection;
    }

    @Override
    public String toString() {
        return "\n" + SpaceShipASCII +
                "\n Space Ship Name: " + getName() +
                "\n Galactic License Plate: " + getGalacticLicensePlate();
    }

}