/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: MuscleBuildingStrategy.java
 * Description: MuscleBuildingStrategy is a concrete implementation of the WorkoutStrategy interface.
 * It generates a workout plan based on the specified intensity and whether equipment is used.
 * The workout plan includes various exercises aimed at building muscle, along with optional breaks.
 */

package edu.bu.met.cs665;

public class MuscleBuildingStrategy implements WorkoutStrategy {

    /**
     * Generates a workout plan based on the specified intensity and equipment usage.
     * The plan consists of muscle-building exercises, with the option to include breaks.
     *
     * @param intensity    The intensity level of the workout (beginner, intermediate, or rigorous).
     * @param useEquipment A boolean indicating whether equipment should be used in the workout.
     * @return A WorkoutPlan object containing the exercises and breaks for the specified workout.
     */
    @Override
    public WorkoutPlan generateWorkoutPlan(String intensity, boolean useEquipment) {
        CardioBuilder builder = new CardioBuilder();

        if (intensity.equals("beginner")) {
            if (useEquipment) {
                builder.addExercise("Dumbbell Curls", 5, 2)
                        .addExercise("Leg Press", 5, 2)
                        .addExercise("Chest Press", 5, 2)
                        .addExercise("Lat Pulldown", 5, 2);
            } else {
                builder.addExercise("Push-ups", 5, 2)
                        .addExercise("Bodyweight Squats", 5, 2)
                        .addExercise("Lunges", 5, 2)
                        .addExercise("Plank", 5, 2);
            }
        } else if (intensity.equals("intermediate")) {
            if (useEquipment) {
                builder.addExercise("Barbell Squats", 7, 3)
                        .addExercise("Bench Press", 7, 3)
                        .addExercise("Deadlifts", 7, 3)
                        .addExercise("Dumbbell Rows", 7, 3);
            } else {
                builder.addExercise("Pull-ups", 7, 3)
                        .addExercise("Dips", 7, 3)
                        .addExercise("Pike Push-ups", 7, 3)
                        .addExercise("Decline Push-ups", 7, 3);
            }
        } else if (intensity.equals("rigorous")) {
            if (useEquipment) {
                builder.addExercise("Clean and Jerk", 10, 3)
                        .addExercise("Snatch", 10, 3)
                        .addExercise("Weighted Pull-ups", 10, 3)
                        .addExercise("Squat Press", 10, 3);
            } else {
                builder.addExercise("Pistol Squats", 10, 3)
                        .addExercise("Handstand Push-ups", 10, 3)
                        .addExercise("One-Arm Push-ups", 10, 3)
                        .addExercise("Burpee Pull-ups", 10, 3);
            }
        }


        System.out.println("Total workout duration: " + builder.getTotalTime() + " minutes");
        return builder.build();
    }
}
