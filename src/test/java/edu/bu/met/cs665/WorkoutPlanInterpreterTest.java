/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: WorkoutPlanInterpreter.java
 * Description: Unit tests for the WorkoutPlanInterpreter class. This class tests the logic of interpreting workout types, intensities, and equipment requirements to ensure correct behavior.
 */

package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.*;

public class WorkoutPlanInterpreterTest {

    // 1. Test Case: Valid Workout Type Interpretation (Cardio)
    @Test
    public void testInterpretCardioWorkoutType() {
        // Arrange
        String workoutType = "cardio";
        String intensity = "beginner";

        // Act
        WorkoutStrategy strategy = WorkoutPlanInterpreter.interpret(workoutType, intensity);

        // Assert
        assertNotNull(strategy); // Ensure that the strategy is not null
        assertTrue(strategy instanceof CardioStrategy); // Ensure the strategy is of type CardioStrategy
    }

    // 2. Test Case: Invalid Workout Type
    @Test(expected = IllegalArgumentException.class)
    public void testInterpretInvalidWorkoutType() {
        // Arrange
        String workoutType = "yoga"; // Invalid workout type
        String intensity = "beginner";

        // Act
        WorkoutPlanInterpreter.interpret(workoutType, intensity); // Should throw IllegalArgumentException
    }

    // 3. Test Case: Intensity Interpretation (Beginner)
    @Test
    public void testInterpretIntensityBeginner() {
        // Arrange
        String intensity = "beginner";

        // Act
        String description = WorkoutPlanInterpreter.interpretIntensity(intensity);

        // Assert
        assertEquals("Low intensity, easy exercises.", description); // Assert that the description is correct
    }

    // 4. Test Case: Intensity Interpretation (Unknown)
    @Test
    public void testInterpretIntensityUnknown() {
        // Arrange
        String intensity = "extreme"; // Invalid intensity

        // Act
        String description = WorkoutPlanInterpreter.interpretIntensity(intensity);

        // Assert
        assertEquals("Unknown intensity level!", description); // Assert the unknown intensity response
    }

    // 5. Test Case: Equipment Requirement Check (Cardio)
    @Test
    public void testIsEquipmentNeededForCardio() {
        // Arrange
        String workoutType = "cardio";

        // Act
        boolean isEquipmentRequired = WorkoutPlanInterpreter.isEquipmentNeeded(workoutType);

        // Assert
        assertFalse(isEquipmentRequired); // Cardio typically does not require equipment
    }

    // 6. Test Case: Equipment Requirement Check (MuscleBuilding)
    @Test
    public void testIsEquipmentNeededForMuscleBuilding() {
        // Arrange
        String workoutType = "muscle";

        // Act
        boolean isEquipmentRequired = WorkoutPlanInterpreter.isEquipmentNeeded(workoutType);

        // Assert
        assertTrue(isEquipmentRequired); // MuscleBuilding generally requires equipment
    }
}
