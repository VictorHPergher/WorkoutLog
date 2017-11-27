package view;

import java.io.IOException;

import javax.swing.JFrame;

import controller.ExerciseManager;
import controller.Persistence;
import controller.WorkoutManager;

public abstract class Menu extends JFrame {
	ExerciseManager exerciseManager;
	WorkoutManager workoutManager;
	String workoutManagerPath = "workoutManager.txt";
	String exerciseManagerPath = "exerciseManager.txt";

	public Menu() {
		tryRead("workoutManager.txt", "exerciseManager.txt");
		trySave();

	}

	private void trySave() {

	}

	public void tryRead(String workoutManagerPath, String exerciseManagerPath) {
		tryReadWorkoutManager(workoutManagerPath);
		tryReadExerciseManager(exerciseManagerPath);
	}

	public WorkoutManager tryReadWorkoutManager(String path) {
		WorkoutManager workoutManager;
		try {
			workoutManager = Persistence.read(path);
			System.out.println("Loaded: " + path);
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Could not load: " + path);
			workoutManager = new WorkoutManager();
			ex.printStackTrace();
		}
		return workoutManager;
	}

	public ExerciseManager tryReadExerciseManager(String path) {
		ExerciseManager exerciseManager;
		try {
			exerciseManager = Persistence.read(path);
			System.out.println("Loaded: " + path);
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Could not load: " + path);
			exerciseManager = new ExerciseManager();
			ex.printStackTrace();
		}
		return exerciseManager;
	}

}
