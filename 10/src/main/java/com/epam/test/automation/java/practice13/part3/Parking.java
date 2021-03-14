package com.epam.test.automation.java.practice13.part3;

public class Parking {
    private final Boolean[] parkPlaces;

    public Parking(int capacity) {
        parkPlaces = new Boolean[capacity];
        for (int i = 0; i < parkPlaces.length; i++) {
            parkPlaces[i] = false;
        }
    }

    public boolean arrive(int k) {//NOSONAR
        if (k > (parkPlaces.length - 1) || k < 0) throw new IllegalArgumentException();
        if (!parkPlaces[k]) {
            parkPlaces[k] = true;
            return true;
        } else {
            int i;
            if (k < parkPlaces.length - 1) {
                i = k + 1;
            } else {
                i = 0;
            }
            while (i != k) {
                if (!parkPlaces[i]) {
                    parkPlaces[i] = true;
                    return true;
                }
                if (i == parkPlaces.length - 1) i = 0;
                 else i++;
            }
        }
        return false;
    }

    public boolean depart(int k) {
        if (k > (parkPlaces.length - 1) || k < 0) {
            throw new IllegalArgumentException();
        }
        if (parkPlaces[k]) {
            parkPlaces[k] = false;
            return true;
        }
        return false;
    }

    public void print() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parkPlaces.length; i++) {
            if (parkPlaces[i]) {
                result.append("1");
            } else {
                result.append("0");
            }
        }
        System.out.println(result + "\n");


    }
}