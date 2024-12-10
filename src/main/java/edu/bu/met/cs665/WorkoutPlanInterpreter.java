/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: WorkoutPlanInterpreter.java
 * Description: TThe WorkoutPlanInterpreter class is responsible for interpreting the workout type and intensity and returning the appropriate workout strategy and intensity description. It also helps determine if equipment is needed for a given workout type.
 */

package edu.bu.met.cs665;

public class WorkoutPlanInterpreter {

    /**
     * Interprets the workout type and returns the corresponding workout strategy.
     *
     * @param workoutType The type of workout, such as "cardio", "muscle", or "weightloss".
     * @param intensity The intensity level for the workout (e.g., "beginner", "intermediate", "advanced").
     * @return The appropriate WorkoutStrategy instance based on the workout type.
     * @throws IllegalArgumentException If the workout type is invalid.
     */
    public static WorkoutStrategy interpret(String workoutType, String intensity) {
        switch (workoutType) {
            case "cardio":
                return new CardioStrategy();
            case "muscle":
                return new MuscleBuildingStrategy();
            case "weightloss":
                return new WeightLossStrategy();
            default:
                throw new IllegalArgumentException("Invalid workout type. Please choose from cardio, muscle, or weightloss.");
        }
    }

    /**
     * Interprets the intensity level and returns a description of the workout intensity.
     *
     * @param intensity The intensity level, such as "beginner", "intermediate", or "advanced".
     * @return A description of the intensity level.
     */
    public static String interpretIntensity(String intensity) {
        switch (intensity) {
            case "beginner":
                return "Low intensity, easy exercises.";
            case "intermediate":
                return "Moderate intensity, moderate exercises.";
            case "rigorous":
                return "High intensity, challenging exercises.";
            default:
                return "Unknown intensity level!";
        }
    }

    /**
     * Determines if equipment is needed for the given workout type.
     *
     * @param workoutType The type of workout (e.g., "muscle", "cardio", or "weightloss").
     * @return True if the workout type requires equipment, otherwise false.
     */
    public static boolean isEquipmentNeeded(String workoutType) {
        return workoutType.equals("muscle");
    }
}
