package org.example;

import java.util.Map;
import java.util.WeakHashMap;

public class SpaceShipFactory {

    private Map<String, SpaceShip> spaceShipCache = new WeakHashMap<>();

    public SpaceShip getSpaceShip (String type){

        return spaceShipCache.computeIfAbsent(type, SpaceShip::new);

    }
    public int caacheSize(){
        return spaceShipCache.size();
    }
}
