/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class Workout {

	private ArrayList<Exercise> exercises;
	private String title;
	private boolean routine;
        
        public void remove(int index) {
            exercises.remove(index);
        }

}
