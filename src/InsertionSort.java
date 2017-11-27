import utils.Output;

//循环不变式
//循环不变式共有三条性质
//1. 初始化：循环第一次迭代之前，它为真
//2. 保持：如果循环的某次迭代之前它为真，那么下次迭代之前它仍为真
//3. 终止：在循环终止时，不变式为我们提供一个有用的性质，该性质有助于证明算法是正确的

public class InsertionSort {

    //升序排序（伪代码实现）
    public static int[] insertionAscSort(int[] notSortArray) {

        for (int j = 1; j < notSortArray.length; j++) {
            int key = notSortArray[j];
            int i = j - 1;

            while (i >= 0 && notSortArray[i] > key) {
                notSortArray[i + 1] = notSortArray[i];
                i = i - 1;
            }
            notSortArray[i + 1] = key;
            Output.printIntArray(notSortArray); // 打印步骤
        }

        return notSortArray;
    }

    //降序排序（2.1-2）
    public static int[] insertionDestSort(int[] notSortArray) {

        for (int j = 1; j < notSortArray.length; j++) {
            int key = notSortArray[j];
            int i = j - 1;

            while (i >= 0 && notSortArray[i] < key) {
                notSortArray[i + 1] = notSortArray[i];
                i = i - 1;
            }
            notSortArray[i + 1] = key;
            Output.printIntArray(notSortArray); //打印步骤
        }

        return notSortArray;
    }


}
