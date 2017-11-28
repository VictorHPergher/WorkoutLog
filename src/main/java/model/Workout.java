/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template yin the editor.
 */
package model;

import java.util.ArrayList;

public class Workout {

	private ArrayList<Exercise> exercises;
	private String title;

	public void remove(int index) {
		exercises.remove(index);
	}

	public ArrayList<Exercise> getExercises() {
		return this.exercises;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
