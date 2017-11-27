import utils.Output;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        int[] notSortArray = new int[]{31, 41, 59, 26, 41, 58};

        Output.printTitleAndIntArray("insertionAscSort",InsertionSort.insertionAscSort(notSortArray));
        Output.printTitleAndIntArray("insertionDestSort",InsertionSort.insertionDestSort(notSortArray));

    }


}
