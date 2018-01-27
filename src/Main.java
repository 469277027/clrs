import algorithms.problemsolving.FindMaximumSubarray;
import algorithms.sort.InsertionSort;
import algorithms.sort.Merge;
import utils.Output;

public class Main {

    public static void main(String[] args) {

//        insertionSort();
//        mergeSort();
        findMaximumSubArray();
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
        int[] unSortArray = new int[]{2, 4, 5, 7, 1, 2, 3, 6, 1};
        Output.printIntArray(Merge.mergeSort(unSortArray, 0, unSortArray.length - 1));
    }


    /**
     * 求最大子数组
     */
    private static void findMaximumSubArray() {
        int[] sourceArray = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        Output.printIntArray(FindMaximumSubarray.findMaximumSubArray(sourceArray, 0, sourceArray.length - 1));
    }


}
