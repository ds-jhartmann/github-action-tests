package de.doubleslash.cucumber;

import static org.assertj.core.api.Assertions.assertThat;

import de.doubleslash.katas.TwoSums;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class TwoSumsStepDefinition {
  private int[] nums;
  private int target;
  private int[] result;

  @Given("a list of integers:")
  public void theListOfIntegers(List<Integer> number) {
    this.nums = number.stream().mapToInt(Integer::intValue).toArray();
  }

  @And("The target result {int}")
  public void theTargetResult(int target) {
    this.target = target;
  }

  @When("the method is executed")
  public void iPressAdd() {
    this.result = TwoSums.twoSum(nums, target);
  }

  @Then("the result should be:")
  public void theResultShouldBeOnTheScreen(List<Integer> expectedResult) {
    assertThat(this.result)
        .isEqualTo(expectedResult.stream().mapToInt(Integer::intValue).toArray());
  }

}
