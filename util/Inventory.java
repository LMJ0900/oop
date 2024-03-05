package util;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Inventory <T> {
    private ArrayList<T> inventory;

    public Inventory(ArrayList<T> inventory) {
        this.inventory = new ArrayList<>();
    }

    public void add(T t) {
        inventory.add(t);
    }

    public T remove(int i) {
        return inventory.remove(i);
    }

    public boolean contains(T t) {
        return inventory.indexOf(t) >= 0;
    }

    public T get(int i) {
        return inventory.get(i);
    }



}
