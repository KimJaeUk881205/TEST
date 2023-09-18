import java.util.Arrays;

public class Main {

  public static int[] getSlice(int[] arr, int stIndx, int enIndx) {

    int[] sclicedArr = new int[enIndx - stIndx];

    for (int i = 0; i < sclicedArr.length; i++) {
      sclicedArr[i] = arr[stIndx + i];
    }

    return sclicedArr;
  }

  public static void main(String args[]) {

    int[] arr = { 20, 65, 87, 19, 55, 93, 76, 98, 54, 21 };

    int stIndx = 2, enIndx = 7;

    int[] sclicedArr = getSlice(arr, stIndx - 1, enIndx + 1);

    System.out.println("Slice of an Array: " + Arrays.toString(sclicedArr));
  }
}