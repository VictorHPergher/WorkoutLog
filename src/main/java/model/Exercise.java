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
public abstract class Exercise {
	protected String description, title, equipment;

	private double weight;
	private ArrayList<Double> sets;
	private ArrayList<Integer> reps;
	private ArrayList<Interval> intervals;

	public String getTitle() {
		return title;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<Double> getSets() {
		return sets;
	}

	public ArrayList<Integer> getReps() {
		return reps;
	}

	public ArrayList<Interval> getIntervals() {
		return intervals;
	}
}
