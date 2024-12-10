/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: WorkoutStrategy.java
 * Description: The WorkoutStrategy interface defines the contract for generating a workout plan.
 * It is intended to be implemented by various workout strategy classes, which will provide different implementations of how a workout plan should be generated based on intensity and equipment.
 */

package edu.bu.met.cs665;

public interface WorkoutStrategy {
    /**
     * Generates a workout plan based on the specified intensity level and whether equipment will be used.
     *
     * @param intensity   The intensity level of the workout (e.g., "beginner", "intermediate", "rigorous").
     * @param useEquipment A boolean value indicating whether the workout will use equipment (true) or not (false).
     * @return A WorkoutPlan object representing the generated workout plan.
     */
    WorkoutPlan generateWorkoutPlan(String intensity, boolean useEquipment);
}
