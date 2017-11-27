/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import model.Workout;

public class WorkoutManager {

	private HashMap<Date, Workout> workouts;
	private ArrayList<Workout> routines;

	private int routineAmount;

	public int getRoutineAmount() {
		return routineAmount;
	}

	public Workout getWorkout(Date date) {
		return workouts.get(date);
	}

	public Workout getRoutine(int index) {
		return routines.get(index);
	}

	public Workout createRoutine() {
		Workout routine = new Workout();
		routines.add(routine);
		routineAmount = routines.size();
		return routine;
	}

	public void deleteRoutine(int index) {
		routines.remove(index);
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

	//
	// TELA DE WORKING OUT
	//

	// ADICINOA UMA NOVA INSTANCIA DE UM EXERCICIO AO WORKOUT, A PARTIR DE UMA LISTA
	// DE EXERCICIOS VISIVEL NA TELA
	public void addExercise(Workout workout, int index, ExerciseManager em) {

	}

	public void removeExercise(Workout workout, int index) {
		routines.get(routines.indexOf(workout)).remove(index);
	}

}
