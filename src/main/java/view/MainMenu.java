package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MainMenu extends Menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4372775313321311235L;
	private JPanel contentPane;

	public MainMenu() {
		super();
		setTitle("WorkoutLog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);

		JButton btnNewButton = new JButton("Editor");
		panel_3.add(btnNewButton);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		JLabel lblStartWorkout = new JLabel("Start Workout:");
		panel_2.add(lblStartWorkout);

		JSeparator separator = new JSeparator();
		panel_2.add(separator);

		JPanel panel = new JPanel();
		panel_2.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblYourRoutines = new JLabel("Your routines:");
		panel.add(lblYourRoutines);
		for (int i = 0; i < workoutManager.getRoutineListSize(); i++) {
			JButton button = new JButton(workoutManager.getRoutine(i).getTitle());
			int j = i; // NO SE PORQUE NECESITO HACER ESTO. DENTRO DEL ACTIONLISTENER I NO ES ACEPTADO
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					workoutManager.newWorkoutFromRoutine(j);
				}
			});
			panel.add(button);
		}

		JSeparator separator_1 = new JSeparator();
		panel_2.add(separator_1);

		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JLabel lblSuggestedRoutines = new JLabel("Suggested routines");
		panel_1.add(lblSuggestedRoutines);

		JButton btnSuggestedRoutineList = new JButton("To be implemented");
		panel_1.add(btnSuggestedRoutineList);

		JSeparator separator_2 = new JSeparator();
		panel_2.add(separator_2);

		JButton btnNewEmptyWorkout = new JButton("New empty workout");
		panel_2.add(btnNewEmptyWorkout);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);

		JButton btnStats = new JButton("Stats");
		btnStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// gotoStatsMenu();
			}
		});
		panel_4.add(btnStats);
	}

}
