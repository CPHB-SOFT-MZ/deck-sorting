package org.ziemer;

public class ShellSort extends Sorts implements Sort {

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
}
