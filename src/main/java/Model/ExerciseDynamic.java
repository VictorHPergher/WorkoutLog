/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class ExerciseDynamic extends Exercise {
	private ArrayList<Integer> reps;
	private int[] tempo; // opcional
	private double weight;
	private double suggestedRest; // opcional

	public ArrayList<Integer> getReps() {
		return reps;
	}

	public void setReps(ArrayList<Integer> reps) {
		this.reps = reps;
	}

	public int[] getTempo() {
		return tempo;
	}

	public void setTempo(int[] tempo) {
		this.tempo = tempo;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSuggestedRest() {
		return suggestedRest;
	}

	public void setSuggestedRest(double suggestedRest) {
		this.suggestedRest = suggestedRest;
	}

}
