/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author pergher
 */
public class ExerciseIsometric extends Exercise {
	private double weight;
	private ArrayList<Double> sets;
	private double suggestedRest; // opcional

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<Double> getSets() {
		return sets;
	}

	public void setSets(ArrayList<Double> sets) {
		this.sets = sets;
	}

	public double getSuggestedRest() {
		return suggestedRest;
	}

	public void setSuggestedRest(double suggestedRest) {
		this.suggestedRest = suggestedRest;
	}

}
