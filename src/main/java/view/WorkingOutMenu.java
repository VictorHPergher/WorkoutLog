package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Workout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class WorkingOutMenu extends Menu {
	private Workout activeWorkout;

	private JPanel contentPane;

	public WorkingOutMenu() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);

		for (int i = 0; i < activeWorkout.getExercises().size(); i++) {
			JButton button = new JButton(workoutManager.getRoutine(i).getTitle());
			int j = i; // NO SE PORQUE NECESITO HACER ESTO. DENTRO DEL ACTIONLISTENER I NO ES ACEPTADO
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					workoutManager.newWorkoutFromRoutine(j);
				}
			});
			panel.add(button);
		}

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
	}

}