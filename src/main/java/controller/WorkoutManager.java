/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import model.Workout;

public class WorkoutManager implements Serializable {

	private static final long serialVersionUID = 4141333640187059208L;
	private HashMap<String, Workout> workouts;
	private ArrayList<String> registeredDates;
	private ArrayList<Workout> routines;

	// format day/month/year
	private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private final Date now = Calendar.getInstance().getTime();
	private int routineListSize;

	public int getRoutineListSize() {
		return routineListSize;
	}

	public ArrayList<String> getRegisteredDates() {
		return this.registeredDates;
	}

	public Workout getWorkout(String date) {
		return workouts.get(date);
	}

	public Workout getRoutine(int index) {
		return routines.get(index);
	}

	public Workout createRoutine() {
		Workout routine = new Workout();
		routines.add(routine);
		routineListSize = routines.size();
		return routine;
	}

	public void deleteRoutine(int index) {
		routines.remove(index);
	}

	public Workout newWorkoutEmpty() {
		Workout workout = new Workout();
		String reportDate = dateFormat.format(now);
		workouts.put(reportDate, workout);
		registeredDates.add(reportDate);
		return workout;
	}

	public Workout newWorkoutFromRoutine(Workout routine) {
		Workout workout = routine;
		String reportDate = dateFormat.format(now);
		workouts.put(reportDate, workout);
		registeredDates.add(reportDate);
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
