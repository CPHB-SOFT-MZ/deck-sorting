package org.ziemer;

public class ShellSort implements Sort {

    @Override
    public void sort(Comparable[] comparables) {
        int N = comparables.length;
        int h = 1;

        while (h < N/3) h = 3*h + 1;

        while (h >= 1) {
            for(int i = h; i < N; i++) {
                for(int j = i; j >= h && less(comparables[j], comparables[j-h]); j -= h) {
                    exchange(comparables, j, j-h);
                }
            }
            h = h/3;
        }
    }

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exchange(Comparable[] comparables, int i, int j) {
        Comparable swap = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = swap;
    }
}
