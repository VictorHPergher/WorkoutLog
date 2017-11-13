/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class ExerciseDynamic extends Exercise {

    private ArrayList<Integer> reps;
    private int[] tempo; // opcional
    private double weight;
    private double suggestedRest; // opcional

    private ExerciseDynamic(ExerciseDynamicBuilder builder) {
        this.title = builder.title;
        this.equipment = builder.equipment;
        this.reps = builder.reps;
        this.weight = builder.weight;
        this.description = builder.description;
        this.suggestedRest = builder.suggestedRest;
    }

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

    public static class ExerciseDynamicBuilder implements ExerciseBuilder {

        private ArrayList<Integer> reps;
        private int[] tempo; //optional
        private double weight;
        private double suggestedRest; //optional
        private String title, description, equipment; //description optional

        public ExerciseDynamicBuilder(String title, String equipment, ArrayList<Integer> reps, Double weight) {
            this.title = title;
            this.equipment = equipment;
            this.reps = reps;
            this.weight = weight;
        }

        public ExerciseDynamicBuilder addDescription(String description) {
            this.description = description;
            return this;
        }

        public ExerciseDynamicBuilder addTempo(int[] tempo) {
            this.tempo = tempo;
            return this;
        }

        public ExerciseDynamicBuilder addSuggestedReps(Double suggestedReps) {
            this.suggestedRest = suggestedReps;
            return this;
        }

        public Exercise build() {
            return new ExerciseDynamic(this);
        }
    }

}
