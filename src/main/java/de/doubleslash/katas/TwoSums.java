package de.doubleslash.katas;

public class TwoSums {
  private TwoSums() {
  }

  public static int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        int num1 = nums[i];
        int num2 = nums[j];
        if (num1 + num2 == target && i != j) {
          return new int[] {i, j};
        }
      }
    }

    return new int[] {};
  }
}
