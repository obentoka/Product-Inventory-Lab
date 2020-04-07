package services;

import models.Belt;
import sun.nio.ch.sctp.SctpNet;

import java.util.ArrayList;

public class BeltService {

    private static Integer nextId = 0;
    private ArrayList<Belt> inventory = new ArrayList<Belt>();

    public Belt create(Belt belt){
        inventory.add(belt);
        return belt;
    }

    public Belt create(String brand, String buckle, String color, Integer size, Float price) {
        Belt createdBelt = Belt
                .BeltBuilder
                .newInstance()
                .setId(nextId++)
                .setBrand(brand)
                .setBuckle(buckle)
                .setColor(color)
                .setSize(size)
                .setPrice(price)
                .build();

        inventory.add(createdBelt);
        return createdBelt;
    }

    public Belt findBelt(Integer id){
        return inventory.get(id);
    }

    public Belt[] findAll(){
        Belt[] retArr = new Belt[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            retArr[i] = inventory.get(i);
        }
        return retArr;
    }

    public Boolean delete(Integer id){
        return inventory.remove(id);
    }
}
