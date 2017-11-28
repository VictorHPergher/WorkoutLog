package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

import controller.ExerciseManager;
import controller.Persistence;
import controller.WorkoutManager;
import model.User;

public abstract class Menu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1831615594212556305L;
	protected ExerciseManager exerciseManager;
	protected WorkoutManager workoutManager;
	protected User user;
	private String workoutManagerPath = "workoutManager.txt";
	private String exerciseManagerPath = "exerciseManager.txt";
	private String userPath = "user.txt";

	public Menu() {
		tryReadAll(workoutManagerPath, exerciseManagerPath, userPath);
		addSaveOnCloseListeners();
	}

	private void addSaveOnCloseListeners() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				trySaveAll();
			}

		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				trySaveAll();
			}

		});

	}

	private void trySaveAll() {
		Persistence.trySave(workoutManager, workoutManagerPath);
		Persistence.trySave(exerciseManager, exerciseManagerPath);
		Persistence.trySave(user, userPath);
	}

	public void tryReadAll(String workoutManagerPath, String exerciseManagerPath, String userPath) {
		workoutManager = tryReadWorkoutManager(workoutManagerPath);
		exerciseManager = tryReadExerciseManager(exerciseManagerPath);
		user = tryReadUser(userPath);
	}

	private User tryReadUser(String path) {
		User user;
		try {
			user = Persistence.read(path);
			System.out.println("Loaded: " + path);
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Could not load: " + path);
			user = new User();
			ex.printStackTrace();
		}
		return user;
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
