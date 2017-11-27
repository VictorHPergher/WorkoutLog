package view;

import java.awt.BorderLayout;
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

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4372775313321311235L;
	private JPanel contentPane;

	public MainMenu() {
		
		
		
		setTitle("WorkoutLog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JLabel lblStartWorkout = new JLabel("Start Workout:");
		contentPane.add(lblStartWorkout);

		JSeparator separator = new JSeparator();
		contentPane.add(separator);

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblYourRoutines = new JLabel("Your routines:");
		panel.add(lblYourRoutines);

		ArrayList<JButton> yourWorkouts = new ArrayList<>();
		
		//FAZ UM FOR PARA CRIAR UM BOTAO PARA TODO ROUTINE. ADICIONA ESTE ARRAYLIST AO PAINEL
		

		JButton btnYourWorkouts = new JButton("Your workouts");
		btnYourWorkouts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnYourWorkouts);

		JSeparator separator_1 = new JSeparator();
		contentPane.add(separator_1);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JLabel lblSuggestedRoutines = new JLabel("Suggested routines");
		panel_1.add(lblSuggestedRoutines);

		JButton btnSuggestedRoutineList = new JButton("Suggested routine list");
		panel_1.add(btnSuggestedRoutineList);

		JSeparator separator_2 = new JSeparator();
		contentPane.add(separator_2);

		JButton btnNewEmptyWorkout = new JButton("New empty workout");
		contentPane.add(btnNewEmptyWorkout);
	}

}
