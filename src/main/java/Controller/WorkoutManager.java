/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Model.Workout;

public class WorkoutManager {
	private HashMap<Date, Workout> workouts;
	private ArrayList<Workout> routines;

	public Workout getPastWorkout(Date date) {
		return workouts.get(date);
	}

	public Workout getRoutine(int i) {
		return routines.get(i);
	}

	public Workout newWorkoutEmpty(Date date) {
		Workout workout = new Workout();
		workouts.put(date, workout);
		return workout;
	}

	public Workout newWorkoutFromRoutine(Date date, Workout routine) {
		Workout workout = routine;
		workouts.put(date, workout);
		return workout;
	}

}