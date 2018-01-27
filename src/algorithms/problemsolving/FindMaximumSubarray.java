package algorithms.problemsolving;

/**
 * 求最大子数组
 */
public class FindMaximumSubarray {


    /**
     * 求最大子数组
     *
     * @param sourceSubArray 原始数组
     * @param low            左边界
     * @param mid            中点
     * @param high           右边界
     * @return 结果数组，包括最大子数组的左边界，右边界，和
     */
    private static int[] findMaxCrossingSubarray(int[] sourceSubArray, int low, int mid, int high) {

        int[] returnedArray = new int[3];
        //左边的最大和
        int leftSum = Integer.MIN_VALUE;
        //左边的和
        int sum = 0;
        //左坐标
        int maxLeft = 0;
        for (int i = mid; i >= low; i--) {
            sum += sourceSubArray[i];
            if (sum > leftSum) {
                leftSum = sum;
                returnedArray[0] = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += sourceSubArray[j];
            if (sum > rightSum) {
                rightSum = sum;
                returnedArray[1] = j;
            }
        }

        returnedArray[2] = leftSum + rightSum;
        return returnedArray;
    }


    /**
     * 求最大子数组（递归过程）
     *
     * @param sourceSubArray 原始数组
     * @param low            求解上界
     * @param high           求解下界
     * @return 最大子数组
     */
    public static int[] findMaximumSubArray(int[] sourceSubArray, int low, int high) {
        int[] returnedArray = new int[3];
        if (low == high) {
            returnedArray[0] = low;
            returnedArray[1] = high;
            returnedArray[2] = sourceSubArray[low];
            return returnedArray;
        } else {
            int mid = (low + high) / 2;
            int[] leftMaximumSubArray = findMaximumSubArray(sourceSubArray, low, mid);
            int[] rightMaximumSubArray = findMaximumSubArray(sourceSubArray, mid + 1, high);
            int[] crossMaximumSubArray = findMaxCrossingSubarray(sourceSubArray, low, mid, high);

            if (leftMaximumSubArray[2] >= rightMaximumSubArray[2] && leftMaximumSubArray[2] >= crossMaximumSubArray[2]) {
                return leftMaximumSubArray;
            } else if (rightMaximumSubArray[2] >= leftMaximumSubArray[2] && rightMaximumSubArray[2] >= crossMaximumSubArray[2]) {
                return rightMaximumSubArray;
            } else {
                return crossMaximumSubArray;
            }
        }
    }

}
