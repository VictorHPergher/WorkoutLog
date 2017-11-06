/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

import Model.Workout;
import Model.Workout;
import java.util.ArrayList;

public class WorkoutManager {
	private ArrayList<Workout> pastWorkouts;
	private ArrayList<Workout> routines;

	public Workout getPastWorkout(int i) {
		return pastWorkouts.get(i);
	}

	public Workout getWorkout(int i) {
		return routines.get(i);
	}
	
	
	
}