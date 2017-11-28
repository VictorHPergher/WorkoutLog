package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Exercise;
import model.ExerciseAerobic;
import model.ExerciseDynamic;
import model.ExerciseIsometric;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class MenuExercise extends Menu {

	private static final long serialVersionUID = 6309236411171449861L;

	private JPanel contentPane;

	public MenuExercise(Exercise exercise) {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JLabel lblExercisename = new JLabel(exercise.getTitle());
		contentPane.add(lblExercisename);

		JSeparator separator = new JSeparator();
		contentPane.add(separator);

		if (exercise instanceof ExerciseAerobic) {
			ExerciseAerobic exerciseAerobic = (ExerciseAerobic) exercise;
			JSpinner[] jSpinners = new JSpinner[exerciseAerobic.getIntervals().size()];

			JPanel aerobicWindow = new JPanel();
			contentPane.add(aerobicWindow);

			for (int i = 0; i < exercise.getIntervals().size(); i++) {

				JLabel lblSetX = new JLabel("Set " + i + ":");
				aerobicWindow.add(lblSetX);

				JSpinner spinner = new JSpinner();
				jSpinners[i] = spinner;

				aerobicWindow.add(spinner);
				JLabel lblMinutes = new JLabel("min");
				aerobicWindow.add(lblMinutes);

			}
			JButton btnSaveChanges = new JButton("Save changes");
			btnSaveChanges.addActionListener((e) -> {
				for (int j = 0; j < jSpinners.length; j++) {
					exerciseAerobic.getIntervals().set(j, (Integer) jSpinners[j].getValue());
				}
			});
			contentPane.add(btnSaveChanges);

		} else if (exercise instanceof ExerciseDynamic) {
			// ExerciseDynamic exerciseDynamic = (ExerciseDynamic) exercise;
			//
			// JSpinner[] jSpinners = new JSpinner[exerciseDynamic.getReps().size()];
			//
			// JPanel dynamicWindow = new JPanel();
			// contentPane.add(dynamicWindow);
			//
			// for (int i = 0; i < exerciseDynamic.getReps().size(); i++) {
			//
			// JLabel lblSetX = new JLabel("Set " + i + ":");
			// dynamicWindow.add(lblSetX);
			//
			// JSpinner spinner = new JSpinner();
			// jSpinners[i] = spinner;
			//
			// dynamicWindow.add(spinner);
			// JLabel lblReps = new JLabel("reps");
			// dynamicWindow.add(lblReps);
			// }
			// JButton btnSaveChanges = new JButton("Save changes");
			// btnSaveChanges.addActionListener((e) -> {
			// for (int j = 0; j < jSpinners.length; j++) {
			// exerciseDynamic.getReps().set(j, (Integer) jSpinners[j].getValue());
			// }
			// });
			// contentPane.add(btnSaveChanges);
		} else {
			ExerciseIsometric exerciseIsometric = (ExerciseIsometric) exercise;
			JSpinner[] jSpinners = new JSpinner[exerciseIsometric.getIntervals().size()];

			JPanel isometricWindow = new JPanel();
			contentPane.add(isometricWindow);

			for (int i = 0; i < exerciseIsometric.getIntervals().size(); i++) {

				JLabel lblSetX = new JLabel("Set " + i + ":");
				isometricWindow.add(lblSetX);

				JSpinner spinner = new JSpinner();
				jSpinners[i] = spinner;

				isometricWindow.add(spinner);
				JLabel lblSeconds = new JLabel("s");
				isometricWindow.add(lblSeconds);

			}
			JButton btnSaveChanges = new JButton("Save changes");
			btnSaveChanges.addActionListener((e) -> {
			});
			contentPane.add(btnSaveChanges);
		}

		ExerciseDynamic exerciseDynamic = (ExerciseDynamic) exercise;

		JSpinner[] jSpinners = new JSpinner[exerciseDynamic.getReps().size()];

		JPanel dynamicWindow = new JPanel();
		contentPane.add(dynamicWindow);
		dynamicWindow.setLayout(new BoxLayout(dynamicWindow, BoxLayout.X_AXIS));

		for (int i = 0; i < exerciseDynamic.getReps().size(); i++) {

			JLabel lblSetX = new JLabel("Set " + i + ":");
			dynamicWindow.add(lblSetX);

			JSpinner spinner = new JSpinner();
			jSpinners[i] = spinner;

			dynamicWindow.add(spinner);
			JLabel lblReps = new JLabel("reps");
			dynamicWindow.add(lblReps);
		}

		JButton btnAddReps = new JButton("Add reps");
		btnAddReps.addActionListener((e) -> {
			exerciseDynamic.getReps().add(0);
			dispose();
			new MenuExercise(exerciseDynamic);
		});

		JButton btnSaveChanges = new JButton("Save changes");
		btnSaveChanges.addActionListener((e) -> {
			for (int j = 0; j < jSpinners.length; j++) {
				exerciseDynamic.getReps().set(j, (Integer) jSpinners[j].getValue());

				// exercise = exerciseDynamic;

			}
		});

		JSeparator separator_1 = new JSeparator();
		contentPane.add(separator_1);
		contentPane.add(btnSaveChanges);

	}
}