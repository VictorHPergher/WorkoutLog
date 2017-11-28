/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pergher
 */
public class ExerciseIsometric extends Exercise {
	private double weight;
	private ArrayList<Double> reps;
	private double suggestedRest; // opcional

	private ExerciseIsometric(ExerciseIsometricBuilder builder) {
		this.title = builder.title;
		this.equipment = builder.equipment;
		this.reps = builder.sets;
		this.weight = builder.weight;
		this.description = builder.description;
		this.suggestedRest = builder.suggestedRest;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<Double> getSets() {
		return reps;
	}

	public void setSets(ArrayList<Double> sets) {
		this.reps = sets;
	}

	public double getSuggestedRest() {
		return suggestedRest;
	}

	public void setSuggestedRest(double suggestedRest) {
		this.suggestedRest = suggestedRest;
	}

	public static class ExerciseIsometricBuilder extends Exercise implements ExerciseBuilder {

		private double weight;
		private ArrayList<Double> sets;
		private double suggestedRest; // opcional

		public ExerciseIsometricBuilder(String title, String equipment, ArrayList<Double> sets, Double weight) {
			this.title = title;
			this.equipment = equipment;
			this.sets = sets;
			this.weight = weight;
		}

		@Override
		public ExerciseIsometricBuilder addDescription(String description) {
			this.description = description;
			return this;
		}

		public ExerciseIsometricBuilder addSuggestedReps(Double suggestedReps) {
			this.suggestedRest = suggestedReps;
			return this;
		}

		public Exercise build() {
			return new ExerciseIsometric(this);
		}
	}

}
