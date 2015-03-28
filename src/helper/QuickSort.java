package helper;

import java.util.Random;

public class QuickSort {
    private static void partition(Object[] o, int startIndex, int endIndex, int pivot) {
        exch(o, startIndex, pivot);

        int i = startIndex;
        int j = endIndex + 1;

        while (true) {
            while (comp(o[++i], o[startIndex]) < 0) {
                if (i == endIndex) {
                    break;
                }
            }
            while (comp(o[--j], o[startIndex]) > 0) {
                if (j == startIndex) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(o, i, j);
        }
        exch(o, j, startIndex);
    }

    private static void exch(Object[] o, int i, int j) {
        Object foo = o[i];
        o[i] = o[j];
        o[j] = foo;
    }

    private static int selectPivotIndex(Object[] o, int startIndex, int endIndex) {
        Random rand = new Random();
        int i1 = rand.nextInt(endIndex - startIndex + 1) + startIndex;
        int i2 = rand.nextInt(endIndex - startIndex + 1) + startIndex;
        int i3 = rand.nextInt(endIndex - startIndex + 1) + startIndex;
        return selectMedianIndex(o, i1, i2, i3);
    }

    private static int selectMedianIndex(Object[] o, int i1, int i2, int i3) {
        if (comp(o[i1], o[i2]) > 0) {
            if (comp(o[i2], o[i3]) > 0) {
                return i2;
            } else if (comp(o[i1], o[i3]) > 0) {
                return i3;
            } else {
                return i1;
            }
        } else {
            if (comp(o[i1], o[i3]) > 0) {
                return i1;
            } else if (comp(o[i2], o[i3]) > 0) {
                return i3;
            } else {
                return i2;
            }
        }
    }

    private static int comp(Object obj1, Object obj2) {
        return ((Comparable) obj1).compareTo((obj2));
    }

    public static void quickSort(Object[] o) {
        quickSort(o, 0, o.length - 1);
    }

    private static void quickSort(Object[] o, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = selectPivotIndex(o, start, end);
        partition(o, start, end, pivot);
        quickSort(o, start, pivot);
        quickSort(o, pivot + 1, end);
    }
}
