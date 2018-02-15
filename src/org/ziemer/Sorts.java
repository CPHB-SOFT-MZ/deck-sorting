package org.ziemer;

public class Sorts {
    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exchange(Comparable[] comparables, int i, int j) {
        Comparable swap = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = swap;
    }
}
