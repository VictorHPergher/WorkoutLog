/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class ExerciseAerobic extends Exercise {

    private ArrayList<Interval> intervals;

    private ExerciseAerobic(ExerciseAerobicBuilder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.equipment = builder.equipment;
        this.intervals = builder.intervals;
    }

    public ArrayList<Interval> getIntervals() {
        return intervals;

    }

    public static class ExerciseAerobicBuilder extends Exercise implements ExerciseBuilder {

        private ArrayList<Interval> intervals;

        public ExerciseAerobicBuilder(String title, String equipment, ArrayList<Interval> intervals) {
            this.title = title;
            this.equipment = equipment;
            this.intervals = intervals;
        }

        @Override
        public ExerciseAerobicBuilder addDescription(String description) {
            this.description = description;
            return this;
        }

        public Exercise build() {
            return new ExerciseAerobic(this);
        }
    }
}
