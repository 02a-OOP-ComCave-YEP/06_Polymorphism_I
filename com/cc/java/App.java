package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        // output(queen.doYourJob());
        // output(queen.fly());

        // output(worker.doYourJob());
        // output(worker.fly());

        // output(drone.doYourJob());
        // output(drone.fly());


    }

    // Overloading --- gleiche M.-Name aber unterschiedliche P.-Struktur

    private static void pollObj(HoneyBee obj){

        output(obj.doYourJob());
        output(obj.fly()); } {

    }
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

