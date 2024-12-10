/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: Main.java
 * Description: The Main class is responsible for interacting with the user, gathering inputs related to workout type, intensity, and equipment preferences, and then generating a personalized workout plan based on the user's choices.
 * It uses the WorkoutPlanInterpreter to determine the appropriate workout strategy and displays the corresponding workout plan.
 */

package edu.bu.met.cs665;

import java.util.Scanner;

public class Main {

  /**
   * The entry point for the application. It prompts the user for input on workout type, intensity level,
   * and equipment usage, then generates and displays a workout plan based on the provided input.
   * It also handles invalid input by asking the user to re-enter valid values.
   *
   * @param args Command line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner scanner = new Scanner(System.in);

    // Ask user for workout type with validation
    String workoutType = getValidInput(scanner, "Enter the workout type (cardio, muscle, weightloss): ",
            new String[]{"cardio", "muscle", "weightloss"});

    // Ask user for intensity level with validation
    String intensity = getValidInput(scanner, "Enter the intensity level (beginner, intermediate, rigorous): ",
            new String[]{"beginner", "intermediate", "rigorous"});

    // Ask user if they want to use equipment (yes/no) with validation
    String useEquipmentInput = getValidInput(scanner, "Do you want to use equipment? (yes/no): ", new String[]{"yes", "no"});
    boolean useEquipment = useEquipmentInput.equals("yes");

    // Get the corresponding WorkoutStrategy based on user input
    try {
      WorkoutStrategy workoutStrategy = WorkoutPlanInterpreter.interpret(workoutType, intensity);

      // Generate the workout plan using the provided strategy
      WorkoutPlan workoutPlan = workoutStrategy.generateWorkoutPlan(intensity, useEquipment);

      // Display the generated workout plan
      System.out.println("\nWorkout Plan: ");
      for (WorkoutPlan.Exercise exercise : workoutPlan.getExercises()) {
        System.out.println(exercise);
      }

      // Display intensity interpretation
      String interpretation = WorkoutPlanInterpreter.interpretIntensity(intensity);
      System.out.println("\nIntensity Interpretation: " + interpretation);

    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Close the scanner
    scanner.close();
  }

  /**
   * Helper method for getting a valid input from the user. This method ensures that the input matches one of the
   * valid options and keeps prompting the user until a valid input is provided.
   *
   * @param scanner The scanner used to read user input.
   * @param prompt The message displayed to the user to ask for input.
   * @param validOptions An array of valid input options that the user can choose from.
   * @return The valid input provided by the user.
   */
  private static String getValidInput(Scanner scanner, String prompt, String[] validOptions) {
    String input;
    while (true) {
      System.out.print(prompt);
      input = scanner.nextLine().toLowerCase();
      for (String option : validOptions) {
        if (input.equals(option)) {
          return input;
        }
      }
      System.out.println("Invalid input. Please enter one of the following options: " + String.join(", ", validOptions));
    }
  }
}
