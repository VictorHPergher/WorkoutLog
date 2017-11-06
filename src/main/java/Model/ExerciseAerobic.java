/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
        
        public static class ExerciseAerobicBuilder {

        private ArrayList<Interval> intervals;
        private String title, description, equipment; //description optional

        public ExerciseAerobicBuilder(String title, String equipment, ArrayList<Interval> intervals) {
            this.title = title;
            this.equipment = equipment;
            this.intervals = intervals;
        }

        public ExerciseAerobicBuilder addDescription(String description) {
            this.description = description;
            return this;
        }
    }
}
