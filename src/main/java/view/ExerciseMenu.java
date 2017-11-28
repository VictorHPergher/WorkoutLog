package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Exercise;
import model.ExerciseAerobic;
import model.ExerciseDynamic;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;

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

		} else if (exercise instanceof ExerciseDynamic) {

		} else {

		}

	}

}
