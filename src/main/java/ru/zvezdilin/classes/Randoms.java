package ru.zvezdilin.classes;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandomValue() {
        return new Random().nextInt(max - min + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandomValue();
            }
        };
    }
}