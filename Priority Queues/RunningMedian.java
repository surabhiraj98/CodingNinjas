
import java.io.*;
import java.util.*;

public class Solution {

  int[] dataValues;
  int dataValuesSize = 0;
  int dataCenter = 0;
  boolean dataEven = false;

  public Solution(int size) {
    dataValues = new int[size];
  }

  private void fixSort(int[] values, int valuesSize) {
    for (int j = valuesSize - 1; j > 0; j--) {
      if (values[j] < values[j - 1]) {
        int t = values[j];
        values[j] = values[j - 1];
        values[j - 1] = t;
      } else {
        return;
      }
    }
  }

  private void sortLower(int nValue, int[] values, int valuesSize, int center) {
    System.arraycopy(values, center, values, center + 1, (valuesSize - center));

    values[center] = nValue;
    valuesSize++;
    for (int j = center; j > 0; j--) {
      if (values[j] < values[j - 1]) {
        int t = values[j];
        values[j] = values[j - 1];
        values[j - 1] = t;
      } else {
        return;
      }
    }
  }

  public int update(int nValue) {

    if (dataValuesSize < 3) {
      dataValues[dataValuesSize] = nValue;
      dataValuesSize++;
      fixSort(dataValues, dataValuesSize);
    } else {
      if (nValue > dataValues[dataCenter]) {
        dataValues[dataValuesSize] = nValue;
        fixSort(dataValues, dataValuesSize);
      } else {
        sortLower(nValue, dataValues, dataValuesSize, dataCenter);
      }
      dataValuesSize++;
    }



    int median = 0;
    if (dataEven) {
      median = dataValues[dataCenter];
      median += dataValues[dataCenter - 1];
      median = median / 2;
    } else {
      median = dataValues[dataCenter];
      dataCenter++;
    }
    dataEven = !dataEven;

    return median;
  }

  public int oldUpdate(int nValue) {
    dataValues[dataValuesSize] = nValue;
    dataValuesSize++;
    fixSort(dataValues, dataValuesSize);

    int median = 0;
    if (dataEven) {
      median = dataValues[dataCenter];
      median += dataValues[dataCenter - 1];
      median = median / 2;
    } else {
      median = dataValues[dataCenter];
      dataCenter++;
    }
    dataEven = !dataEven;

    return median;
  }
  public static void runningMedian(int arr[]) {
  
    Solution unstable = new Solution(arr.length);
    Solution stable = new Solution(arr.length);
    for (int i = 0; i < arr.length; i++) {
      //System.out.println("InputValue: " + arr[i]);
      //int usv = unstable.update(arr[i]);
      int sv = stable.oldUpdate(arr[i]);
      // if( i+3 > values.length ) {
     
      // }
     // System.out.println("" + sv + " - " + usv + " = " + (sv - usv));
        System.out.println(sv);
    }
  }
  private void printContent() {
    for (int i = 0; i < dataValuesSize; i++) {
      System.out.print(" " + dataValues[i]);
    }
    System.out.println();
  } 
}
