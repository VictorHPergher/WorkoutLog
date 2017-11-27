/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author pergher
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2477121032774414812L;

	private String name;
	private int age;
	private boolean isMale;
	private double height, weight, bodyfat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsMale() {
		return isMale;
	}

	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBodyfat() {
		return bodyfat;
	}

	public void setBodyfat(double bodyfat) {
		this.bodyfat = bodyfat;
	}

}
