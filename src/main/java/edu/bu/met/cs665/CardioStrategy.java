/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: CardioStrategy.java
 * Description: CardioStrategy is a concrete implementation of the WorkoutStrategy interface.
 * It generates a workout plan based on the specified intensity and whether equipment is used.
 * The workout plan includes various exercises and optional breaks.
 */
package edu.bu.met.cs665;

public class CardioStrategy implements WorkoutStrategy {
    /**
     * Generates a workout plan based on the specified intensity and equipment usage.
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
                builder.addExercise("Elliptical Machine", 5, 2)
                        .addExercise("Stationary Bike", 5, 2)
                        .addExercise("Rowing Machine", 5, 2)
                        .addExercise("Treadmill Walk", 5, 2);
            } else {
                builder.addExercise("Jumping Jacks", 5, 2)
                        .addExercise("High Knees", 5, 2)
                        .addExercise("Butt Kicks", 5, 3)
                        .addExercise("Mountain Climbers", 5, 2);
            }
        } else if (intensity.equals("intermediate")) {
            if (useEquipment) {
                builder.addExercise("Box Jumps", 7, 3)
                        .addExercise("Kettlebell Swings", 7, 3)
                        .addExercise("Rowing Machine", 7, 3)
                        .addExercise("Jump Rope", 7, 3);
            } else {
                builder.addExercise("Burpees", 7, 3)
                        .addExercise("Mountain Climbers", 7, 3)
                        .addExercise("Jump Rope", 7, 3)
                        .addExercise("High Knees", 7, 3);
            }
        } else if (intensity.equals("rigorous")) {
            if (useEquipment) {
                builder.addExercise("Sprints", 10, 3)
                        .addExercise("Box Jumps", 10, 3)
                        .addExercise("Battle Ropes", 10, 3)
                        .addExercise("Stair Climbing", 10, 3);
            } else {
                builder.addExercise("Running", 10, 3)
                        .addExercise("High Knees", 10, 3)
                        .addExercise("Jumping Jacks", 10, 3)
                        .addExercise("Burpees", 10, 3);
            }
        }

        System.out.println("Total workout duration: " + builder.getTotalTime() + " minutes");
        return builder.build();
    }
}
