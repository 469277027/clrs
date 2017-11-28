import algorithms.sort.InsertionSort;
import algorithms.sort.Merge;
import utils.Output;

public class Main {

    public static void main(String[] args) {

//        insertionSort();
        mergeSort();
    }

    /**
     * 插入排序
     */
    private static void insertionSort() {
        int[] unSortArray = new int[]{31, 41, 59, 26, 41, 58};

        Output.printTitleAndIntArray("insertionAscSort", InsertionSort.insertionAscSort(unSortArray));
        Output.printTitleAndIntArray("insertionDestSort", InsertionSort.insertionDestSort(unSortArray));
    }


    /**
     * 归并排序
     */
    private static void mergeSort() {
        int[] unSortArray = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 2, 4, 5, 7, 1, 2, 3, 6, 9, 9, 9, 9, 9};
        Output.printIntArray(Merge.mergeSort(unSortArray, 8, 11, 15));
    }


}
