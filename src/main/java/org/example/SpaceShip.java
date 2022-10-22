package org.example;

public class SpaceShip {
    private String type;
    private int positionX;
    private int positionY;

    public SpaceShip(String type) {
        this.type = type;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    public void display (){
        System.out.println(" statek kosmiczny typu : "+type+" w pozycji : "+ positionX+"  "+positionY);
    }
}
