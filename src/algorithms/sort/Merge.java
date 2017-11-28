package algorithms.sort;

import utils.Output;

/**
 * 归并排序
 */

public class Merge {

    public static int[] mergeSort(int[] unSortArray, int positionL, int positionM, int positionR) {
        int n1 = positionM - positionL + 1; // 11 - 8 + 1 = 4
        int n2 = positionR - positionM;// 15 - 11 = 4

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = unSortArray[positionL + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = unSortArray[positionM + j + 1];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = positionL; k <= positionR; k++) {
            if (L[i] <= R[j]) {
                unSortArray[k] = L[i];
                i = i + 1;
            } else {
                unSortArray[k] = R[j];
                j = j + 1;
            }
            Output.printIntArray(unSortArray);
        }

        return unSortArray;

    }

}
