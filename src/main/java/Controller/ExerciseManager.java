/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Model.Exercise;
import Model.ExerciseAerobic;
import Model.Interval;

/**
 *
 * @author pergher
 */
public class ExerciseManager {

	private ArrayList<Exercise> availableExercises;
	private HashMap<Double, Date> repMaxHistory;
	private String title;

	public double calculate1RepMax(int reps, double weight) {

		double OneRepMax = weight / reps;

		return OneRepMax;
	}

	public HashMap<Double, Date> get1RepMaxHistory(Exercise exercise) {
		return this.repMaxHistory;
	}

	public void addInterval(int intesnity, double time, ExerciseAerobic exercise) {
		exercise.getIntervals().add(new Interval());
	}

	public void removeInterval(ExerciseAerobic exercise, int index) {

	}
}
