/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: CardioBuilder.java
 * Description: The CardioBuilder class is responsible for building a cardio workout plan.
 * It allows the user to add exercises and calculates the total time for the workout based on the duration and number of sets.
 * The builder pattern is used to construct a WorkoutPlan step by step.
 */

package edu.bu.met.cs665;

public class CardioBuilder {
    private WorkoutPlan plan;
    private int totalTime = 0;

    /**
     * Constructs a new CardioBuilder instance, initializing an empty WorkoutPlan.
     */
    public CardioBuilder() {
        this.plan = new WorkoutPlan();
    }

    /**
     * Adds an exercise to the workout plan with a specified duration and number of sets.
     * Breaks are not added to the workout plan anymore.
     *
     * @param name The name of the exercise to add.
     * @param duration The duration of each exercise in minutes.
     * @param sets The number of sets to perform for the exercise.
     * @return The current CardioBuilder instance to allow method chaining.
     */
    public CardioBuilder addExercise(String name, int duration, int sets) {
        plan.addExercise(name, duration, sets);
        totalTime += duration * sets; // Calculate total time based on sets for exercises only
        return this;
    }

    /**
     * Builds the final WorkoutPlan based on the exercises added so far.
     *
     * @return The constructed WorkoutPlan object.
     */
    public WorkoutPlan build() {
        return plan;
    }

    /**
     * Returns the total time of the workout plan in minutes.
     *
     * @return The total time of the workout plan.
     */
    public int getTotalTime() {
        return totalTime;
    }
}
