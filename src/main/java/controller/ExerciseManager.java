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

	public void createIsoExercise(String title, String equipment, ArrayList<Double> sets, Double weight) {
		
	}
	
	public void createDynamExercise(String title, String equipment, ArrayList<Integer> reps, Double weight) {
            
	}
	
	public void createAerobicExercise(String title, String equipment, ArrayList<Interval> intervals) {
            
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

	public void removeSet(Exercise exercise, int index) {

	}

	public void changeWeight(Exercise exercise, double weight) {

	}

}
