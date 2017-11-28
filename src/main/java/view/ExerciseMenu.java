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

public class ExerciseMenu extends Menu {

	private static final long serialVersionUID = 6309236411171449861L;

	private JPanel contentPane;

	public ExerciseMenu(Exercise exercise) {
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

			for (int i = 0; i < exercise.getIntervals().size(); i++) {
				JPanel aerobicWindow = new JPanel();
				contentPane.add(aerobicWindow);

				JLabel lblSetX = new JLabel("Set " + i + ":");
				aerobicWindow.add(lblSetX);

				JSpinner spinner = new JSpinner();
				jSpinners[i] = spinner;

				aerobicWindow.add(spinner);
				JLabel lblMinutes = new JLabel("min");
				aerobicWindow.add(lblMinutes);
			}

		} else if (exercise instanceof ExerciseDynamic) {
			ExerciseDynamic exerciseDynamic = (ExerciseDynamic) exercise;

			JSpinner[] jSpinners = new JSpinner[exerciseDynamic.getReps().size()];

			for (int i = 0; i < exerciseDynamic.getReps().size(); i++) {
				JPanel dynamicWindow = new JPanel();
				contentPane.add(dynamicWindow);

				JLabel lblSetX = new JLabel("Set " + i + ":");
				dynamicWindow.add(lblSetX);

				JSpinner spinner = new JSpinner();
				jSpinners[i] = spinner;

				dynamicWindow.add(spinner);
				JLabel lblReps = new JLabel("reps");
				dynamicWindow.add(lblReps);
			}
		} else {
			ExerciseIsometric exerciseIsometric = (ExerciseIsometric) exercise;
			JSpinner[] jSpinners = new JSpinner[exerciseIsometric.getIntervals().size()];

			for (int i = 0; i < exerciseIsometric.getIntervals().size(); i++) {
				JPanel isometricWindow = new JPanel();
				contentPane.add(isometricWindow);

				JLabel lblSetX = new JLabel("Set " + i + ":");
				isometricWindow.add(lblSetX);

				JSpinner spinner = new JSpinner();
				jSpinners[i] = spinner;

				isometricWindow.add(spinner);
				JLabel lblSeconds = new JLabel("s");
				isometricWindow.add(lblSeconds);

			}
		}
	}
}