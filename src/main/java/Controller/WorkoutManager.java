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
import Model.Workout;

public class WorkoutManager {
	private HashMap<Date, Workout> workouts;
	private ArrayList<Workout> routines;

	public Workout getWorkout(Date date) {
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

	// Clona uma rotina com novas instancias dos exercicios da rotina
	public Workout newWorkoutFromRoutine(Date date, Workout routine) {
		Workout workout = routine;
		workouts.put(date, workout);
		return workout;
	}

	// APAGA UMA ROTINA
	public void deleteRoutine(int i) {

	}

	// TELA DE WORKING OUT

	// ADICINOA UMA NOVA INSTANCIA DE UM EXERCICIO AO WORKOUT
	public void addExercise(Workout workout, Exercise exercise, ExerciseManager em) {

	}

	public void removeExercise(Workout workout, Exercise exercise) {

	}

}
