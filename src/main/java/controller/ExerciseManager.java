/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import model.Exercise;
import model.ExerciseAerobic;
import model.ExerciseDynamic;
import model.ExerciseIsometric;
import model.Interval;

/**
 *
 * @author pergher
 */
public class ExerciseManager {

	private ArrayList<Exercise> availableExercises;
	private ArrayList<Exercise> deletedExercises;
	private HashMap<Double, Date> repMaxHistory;
        private String title;

	public double calculate1RepMax(int reps, double weight) {

            double OneRepMax = weight / reps;

            return OneRepMax;
	}

	public HashMap<Double, Date> get1RepMaxHistory(Exercise exercise) {
            return this.repMaxHistory;
	}

	public void deleteExercise(int index) {
            //transfere do arraylist available para o deleted
	}

	public void addInterval(int intesnity, double time, ExerciseAerobic exercise) {
            exercise.getIntervals().add(new Interval());
	}

	public void removeInterval(ExerciseAerobic exercise, int index) {

	}

	public void addSet(ExerciseDynamic exercise, int reps) {
	}

	public void addSet(ExerciseIsometric exercise, double time) {
	}

	public void removeSet(ExerciseIsometric exercise, int index) {

	}

	public void changeWeight(Exercise exercise, double weight) {
            availableExercises.get(availableExercises.indexOf(exercise)).setWeight(weight);
	}
        
        //creates exercises through builders
        
        //isometric exercises

        public void createIsoExercise(String title, String equipment, ArrayList<Double> sets, Double weight) {
            availableExercises.add(new ExerciseIsometric.ExerciseIsometricBuilder(title, equipment, sets, weight));
	}
        
        public void createIsoExercise(String title, String equipment, ArrayList<Double> sets, Double weight, String description) {
            availableExercises.add(new ExerciseIsometric.ExerciseIsometricBuilder(title, equipment, sets, weight)
                                    .addDescription(description));
	}
        
        public void createIsoExercise(String title, String equipment, ArrayList<Double> sets, Double weight, Double suggestedReps) {
            availableExercises.add(new ExerciseIsometric.ExerciseIsometricBuilder(title, equipment, sets, weight)
                                    .addSuggestedReps(suggestedReps));
	}
        
        public void createIsoExercise(String title, String equipment, ArrayList<Double> sets, Double weight, String description, Double suggestedReps) {
            availableExercises.add(new ExerciseIsometric.ExerciseIsometricBuilder(title, equipment, sets, weight)
                                    .addDescription(description)
                                    .addSuggestedReps(suggestedReps));
	}
	
	//dynamic exercises
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, String description) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addDescription(description));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, int[] tempo) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addTempo(tempo));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, Double suggestedReps) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addSuggestedReps(suggestedReps));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, String description, int[] tempo) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addDescription(description)
                                    .addTempo(tempo));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, String description, Double suggestedReps) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addDescription(description)
                                    .addSuggestedReps(suggestedReps));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, int[] tempo, Double suggestedReps) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addTempo(tempo)
                                    .addSuggestedReps(suggestedReps));
	}
        
        public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight, String description, int[] tempo, Double suggestedReps) {
            availableExercises.add(new ExerciseDynamic.ExerciseDynamicBuilder(title, equipment, reps, weight)
                                    .addDescription(description)
                                    .addTempo(tempo)
                                    .addSuggestedReps(suggestedReps));
	}
	
	//aerobic exercises
        public void createAerobicExercise(String title, String equipment, ArrayList<Interval> intervals) {
            availableExercises.add(new ExerciseAerobic.ExerciseAerobicBuilder(title, equipment, intervals));
        }
        
        public void createAerobicExercise(String title, String equipment, ArrayList<Interval> intervals, String description) {
            availableExercises.add(new ExerciseAerobic.ExerciseAerobicBuilder(title, equipment, intervals)
                                    .addDescription(description));
        }

}
