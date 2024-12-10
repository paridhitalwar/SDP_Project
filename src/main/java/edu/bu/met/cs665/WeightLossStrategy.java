/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: WeightLossStrategy.java
 * Description: The WeightLossStrategy class implements a workout strategy designed for weight loss.
 * It generates a workout plan based on the specified intensity and equipment availability, which includes exercises for cardiovascular fitness, strength, and fat burning.
 */

package edu.bu.met.cs665;

public class WeightLossStrategy implements WorkoutStrategy {

    /**
     * Generates a workout plan based on the specified intensity and equipment availability.
     * The plan includes various exercises for weight loss, including cardiovascular exercises, strength training,
     * and bodyweight movements, with breaks included for beginner and intermediate levels.
     * A stretching session is added at the end of the workout.
     *
     * @param intensity The intensity level of the workout ("beginner", "intermediate", or "rigorous").
     * @param useEquipment A boolean indicating whether equipment is available for the workout.
     * @return A WorkoutPlan object containing the generated workout plan.
     */
    @Override
    public WorkoutPlan generateWorkoutPlan(String intensity, boolean useEquipment) {
        CardioBuilder builder = new CardioBuilder();

        if (intensity.equals("beginner")) {
            if (useEquipment) {
                builder.addExercise("Stationary Bike", 5, 2)
                        .addExercise("Elliptical Machine", 5, 2)
                        .addExercise("Rowing Machine", 5, 2)
                        .addExercise("Treadmill Walk", 5, 2);
            } else {
                builder.addExercise("Jumping Jacks", 5, 2)
                        .addExercise("High Knees", 5, 2)
                        .addExercise("Butt Kicks", 5, 2)
                        .addExercise("Mountain Climbers", 5, 2);
            }
        } else if (intensity.equals("intermediate")) {
            if (useEquipment) {
                builder.addExercise("Treadmill", 10, 2)
                        .addExercise("Rowing Machine", 10, 2)
                        .addExercise("Dumbbell Chest Press", 3, 1)
                        .addExercise("Lat Pulldown", 3, 1);
            } else {
                builder.addExercise("Jumping Jacks", 10, 2)
                        .addExercise("Mountain Climbers", 10, 2)
                        .addExercise("Burpees", 5, 2)
                        .addExercise("Squat Jumps", 5, 2)
                        .addExercise("Push-ups", 10, 2);
            }
        } else if (intensity.equals("rigorous")) {
            if (useEquipment) {
                builder.addExercise("Sprints", 10, 2)
                        .addExercise("Box Jumps", 4, 3)
                        .addExercise("Battle Ropes", 2, 2)
                        .addExercise("Kettlebell Swings", 2, 3);
            } else {
                builder.addExercise("Burpees", 15, 1)
                        .addExercise("Jump Lunges", 5, 2)
                        .addExercise("Plank to Push-up", 5, 2)
                        .addExercise("Jump Squats", 5, 2)
                        .addExercise("Mountain Climbers", 10, 2);
            }
        }

        System.out.println("Total workout duration: " + builder.getTotalTime() + " minutes");
        return builder.build();
    }
}
