/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/09/2024
 * File Name: WorkoutPlan.java
 * Description: The WorkoutPlan class represents a workout routine, consisting of a list of exercises and their respective durations.
 * It also keeps track of the total time spent on the workout. The class allows adding exercises, either with just a duration or with a specified number of sets, and provides methods to retrieve the total workout time and to display the workout plan.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class WorkoutPlan {
    private List<Exercise> exercises;

    public WorkoutPlan() {
        this.exercises = new ArrayList<>();
    }
    /**
     * Adds an exercise to the workout plan with its duration and number of sets.
     *
     * @param name     The name of the exercise.
     * @param duration The duration of the exercise in minutes.
     * @param sets     The number of sets for the exercise.
     */
    public void addExercise(String name, int duration, int sets) {
        exercises.add(new Exercise(name, duration, sets));
    }

    public void addExercise(String name, int duration) {
        exercises.add(new Exercise(name, duration, 1));
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public static class Exercise {
        private String name;
        private int duration;
        private int sets;

        public Exercise(String name, int duration, int sets) {
            this.name = name;
            this.duration = duration;
            this.sets = sets;
        }

        public String getName() {
            return name;
        }

        public int getDuration() {
            return duration;
        }

        public int getSets() {
            return sets;
        }
        /**
         * Returns a string representation of the workout plan, including all exercises and their details (name, duration, and sets).
         *
         * @return A string representation of the workout plan.
         */
        @Override
        public String toString() {
            return name + " (" + duration + " mins, " + sets + " sets)";
        }
    }
}
