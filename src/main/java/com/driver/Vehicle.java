package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle{

    }
    public Vehicle(String name) {
            this.name= name;        // me
        currentSpeed=0;        //me
        currentDirection=0;     //me
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
               this.currentDirection= currentDirection+direction; //me
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
              currentSpeed=speed;   //me
              currentDirection=direction;   //me
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
          currentSpeed==0; //me
              System.out.println("stop method called - The vehicle is stopped");



    }

}
