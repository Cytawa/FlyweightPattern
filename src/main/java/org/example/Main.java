package org.example;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        SpaceShipFactory factory = new SpaceShipFactory();

        IntStream. range(0,10).forEach((i)->{
            SpaceShip spaceShip = factory.getSpaceShip("Cruiser");

            spaceShip.setPositionX(i);
            spaceShip.setPositionY(i);
            spaceShip.display();

        });

        IntStream. range(0,10).forEach((i)->{
            SpaceShip spaceShip = factory.getSpaceShip("Fighter");

            spaceShip.setPositionX(ThreadLocalRandom.current().nextInt(i, 50));
            spaceShip.setPositionY(ThreadLocalRandom.current().nextInt(i, 100));
            spaceShip.display();

        });

        System.out.println("Zostało stworzonych " + factory.caacheSize()+"  obiektów");
    }
}