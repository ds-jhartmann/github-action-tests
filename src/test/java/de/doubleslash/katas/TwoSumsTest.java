package de.doubleslash.katas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TwoSumsTest {

  @Test
  void twoSum_1() {
    // Given
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expectedResult = {0, 1};

    // When
    int[] result = TwoSums.twoSum(nums, target);

    // Then
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void twoSum_2() {
    // Given
    int[] nums = {3,2,4};
    int target = 6;
    int[] expectedResult = {1,2};

    // When
    int[] result = TwoSums.twoSum(nums, target);

    // Then
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void twoSum_3() {
    // Given
    int[] nums = {3,3};
    int target = 6;
    int[] expectedResult = {0, 1};

    // When
    int[] result = TwoSums.twoSum(nums, target);

    // Then
    assertThat(result).isEqualTo(expectedResult);
  }
}
