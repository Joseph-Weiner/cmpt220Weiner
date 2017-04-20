package javaCatch;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class JavaCatchFrame extends JFrame {
	Choice pokemonChoice = new Choice();
	Pokemon[] pokeTable = QueryDB.loadDB();
	Choice ballChoice = new Choice();
	Choice statusChoice = new Choice();
	Choice oPower = new Choice();
	Choice grassChoice = new Choice();
	Choice hpChoice = new Choice();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCatchFrame frame = new JavaCatchFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public JavaCatchFrame() throws SQLException {
		setForeground(Color.LIGHT_GRAY);
		setTitle("JavaCatch Version 1.0");
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Cooper Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculateMyEncounter = new JButton("Calculate My Encounter");
		btnCalculateMyEncounter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pokemonIndex = pokemonChoice.getSelectedIndex();
				Pokemon selectedPokemon = pokeTable[pokemonIndex];
				
				if (ballChoice.getSelectedItem().equals("Poke Ball")){
					selectedPokemon.setPokeBall();
				} else if(ballChoice.getSelectedItem().equals("Great Ball")){
					selectedPokemon.setGreatBall();
				}else if(ballChoice.getSelectedItem().equals("Ultra Ball")){
					selectedPokemon.setUltraBall();
				}else if(ballChoice.getSelectedItem().equals("Safari Ball")){
					selectedPokemon.setSafariBall();
				}else if(ballChoice.getSelectedItem().equals("Fast Ball")){
					selectedPokemon.setFastBall();
				}else if(ballChoice.getSelectedItem().equals("Heavy Ball")){
					selectedPokemon.setHeavyBall();
				}else if(ballChoice.getSelectedItem().equals("Dusk Ball")){
					selectedPokemon.setDuskBall();
				}else if(ballChoice.getSelectedItem().equals("Lure Ball")){
					selectedPokemon.setLureBall();
				}else if(ballChoice.getSelectedItem().equals("Net Ball")){
					selectedPokemon.setNetBall();
				}else if(ballChoice.getSelectedItem().equals("Nest Ball")){
					selectedPokemon.setNestBall();
				}else if(ballChoice.getSelectedItem().equals("Heal Ball")){
					selectedPokemon.setHealBall();
				}else if(ballChoice.getSelectedItem().equals("Dive Ball")){
					selectedPokemon.setDiveBall();
				}else if(ballChoice.getSelectedItem().equals("Repeat Ball")){
					selectedPokemon.setRepeatBall();
				}else if(ballChoice.getSelectedItem().equals("Timer Ball")){
					selectedPokemon.setTimerBall();
				}else if(ballChoice.getSelectedItem().equals("Quick Ball")){
					selectedPokemon.setQuickBall();
				}else if(ballChoice.getSelectedItem().equals("Level Ball")){
					selectedPokemon.setLevelBall();
				}else if(ballChoice.getSelectedItem().equals("Moon Ball")){
					selectedPokemon.setMoonBall();
				}else if(ballChoice.getSelectedItem().equals("Friend Ball")){
					selectedPokemon.setFriendBall();
				}else if(ballChoice.getSelectedItem().equals("Sport Ball")){
					selectedPokemon.setSportBall();
				}else if(ballChoice.getSelectedItem().equals("Premier Ball")){
					selectedPokemon.setPremierBall();
				}else if(ballChoice.getSelectedItem().equals("Luxury Ball")){
					selectedPokemon.setLuxuryBall();
				}else if(ballChoice.getSelectedItem().equals("Cherish Ball")){
					selectedPokemon.setCherishBall();
				}else if(ballChoice.getSelectedItem().equals("UltraBeast Ball")){
					selectedPokemon.setUltraBeastBall();
					}
				//while (ballChoice.getSelectedItem().equals("Master Ball")){
					//System.out.println("Your chances of catching the pokemon are 100% and the pokeball will shake 3.0 times.");
					
				//}
				
				if (statusChoice.getSelectedItem().equals("No Condition")){
					selectedPokemon.setNoCondition();
				}else if (statusChoice.getSelectedItem().equals("Poisoned")){
					selectedPokemon.setPoisoned();
				}else if (statusChoice.getSelectedItem().equals("Asleep")){
					selectedPokemon.setAsleep();
				}else if (statusChoice.getSelectedItem().equals("Paralyzed")){
					selectedPokemon.setParalyzed();
				}else if (statusChoice.getSelectedItem().equals("Burned")){
					selectedPokemon.setBurned();
				}else if (statusChoice.getSelectedItem().equals("Frozen")){
					selectedPokemon.setFrozen();
				}
				
				
				if (oPower.getSelectedItem().equals("No O-Power")){
					selectedPokemon.setOPowerNone();
				}else if (statusChoice.getSelectedItem().equals("O-Power Level 1")){
					selectedPokemon.setOPower1();
				}else if (statusChoice.getSelectedItem().equals("O-Power Level 2")){
					selectedPokemon.setOPower2();
				}else if (statusChoice.getSelectedItem().equals("O-Power Level 3")){
					selectedPokemon.setOPower3();
				}
				
				
				if (grassChoice.getSelectedItem().equals("> 600")){
					selectedPokemon.setFirst();
				}else if (grassChoice.getSelectedItem().equals(">= 451 and <= 600")){
					selectedPokemon.setSecond();
				}else if (grassChoice.getSelectedItem().equals(">= 301 and <= 450")){
					selectedPokemon.setThird();
				}else if (grassChoice.getSelectedItem().equals(">= 151 and <= 300")){
					selectedPokemon.setFourth();
				}else if (grassChoice.getSelectedItem().equals(">= 31 and <= 150")){
					selectedPokemon.setFifth();
				}else if (grassChoice.getSelectedItem().equals("<= 30")){
					selectedPokemon.setSixth();
				}
				
				
				if (hpChoice.getSelectedItem().equals("100%")){
					selectedPokemon.setHp100();
				}else if (hpChoice.getSelectedItem().equals("75%")){
					selectedPokemon.setHp75();
				}else if (hpChoice.getSelectedItem().equals("50%")){
					selectedPokemon.setHp50();
				}else if (hpChoice.getSelectedItem().equals("25%")){
					selectedPokemon.setHp25();
				}else if (hpChoice.getSelectedItem().equals("10%")){
					selectedPokemon.setHp10();
				}
				//int rate1 = selectedPokemon.getRate();
				//double weight1 = selectedPokemon.getWeight();
				
				//Algorithm.getA();
				//Algorithm.getB();
				if (ballChoice.getSelectedItem().equals("Master Ball")){
					System.out.println("Your chances of catching the pokemon are 100% and the pokeball will shake 3.0 times.");
				}else{
					System.out.println("The Algorithm has been calculated successfully!");
					System.out.println("Your chances of catching the pokemon are " + selectedPokemon.getA() + "% and the pokeball will shake " + selectedPokemon.getB() + " times.");
				}
				//System.out.println("The Algorithm has been calculated successfully!");
				//System.out.println("Your chances of catching the pokemon are " + selectedPokemon.getA() + "% and the pokeball will shake " + selectedPokemon.getB() + " times.");
			}
		});
		btnCalculateMyEncounter.setBounds(200, 461, 220, 25);
		contentPane.add(btnCalculateMyEncounter);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(230, 438, 146, 14);
		contentPane.add(progressBar);
		
		pokemonChoice.setBounds(10, 31, 190, 35);
		contentPane.add(pokemonChoice);
		Pokemon[] pokeTable = QueryDB.loadDB();
		for ( int i = 0; i <= 801; i++ ) {
			Pokemon poke = pokeTable[ i ];
			String pName = poke.getName();
			pokemonChoice.add( pName );
		}
		
		
		JLabel lblSelectYourPokemon = new JLabel("Select your pokemon");
		lblSelectYourPokemon.setBounds(10, 10, 137, 16);
		contentPane.add(lblSelectYourPokemon);
		
		ballChoice.setBounds(10, 91, 193, 22);
		contentPane.add(ballChoice);
		ballChoice.add("Poke Ball");
		ballChoice.add("Great Ball");
		ballChoice.add("Ultra Ball");
		ballChoice.add("Master Ball");
		ballChoice.add("Safari Ball");
		ballChoice.add("Fast Ball");
		ballChoice.add("Heavy Ball");
		ballChoice.add("Dusk Ball");
		ballChoice.add("Lure Ball");
		ballChoice.add("Net Ball");
		ballChoice.add("Nest Ball");
		ballChoice.add("Heal Ball");
		ballChoice.add("Dive Ball");
		ballChoice.add("Repeat Ball");
		ballChoice.add("Timer Ball");
		ballChoice.add("Quick Ball");
		ballChoice.add("Level Ball");
		ballChoice.add("Moon Ball");
		ballChoice.add("Friend Ball");
		ballChoice.add("Sport Ball");
		ballChoice.add("Premier Ball");
		ballChoice.add("Luxury Ball");
		ballChoice.add("Cherish Ball");
		ballChoice.add("UltraBeast Ball");
		
		JLabel lblSelectYourPokeball = new JLabel("Select your PokeBall");
		lblSelectYourPokeball.setBounds(10, 68, 150, 16);
		contentPane.add(lblSelectYourPokeball);
		
		statusChoice.setBounds(10, 158, 192, 22);
		contentPane.add(statusChoice);
		statusChoice.add("No Condition");
		statusChoice.add("Poisoned");
		statusChoice.add("Asleep");
		statusChoice.add("Paralyzed");
		statusChoice.add("Burned");
		statusChoice.add("Frozen");
		
		JLabel lblStatusCondition = new JLabel("Status Condition?");
		lblStatusCondition.setBounds(10, 137, 145, 16);
		contentPane.add(lblStatusCondition);
		
		JLabel lblHowManyPokemon = new JLabel("How many Pokemon have you caught");
		lblHowManyPokemon.setBounds(10, 201, 243, 16);
		contentPane.add(lblHowManyPokemon);
		
		oPower.setBounds(349, 31, 168, 22);
		contentPane.add(oPower);
		oPower.add("No O-Power");
		oPower.add("O-Power Level 1");
		oPower.add("O-Power Level 2");
		oPower.add("O-Power Level 3");
		
		JLabel lblSelectYourOpower = new JLabel("Select Your O-Power");
		lblSelectYourOpower.setBounds(349, 10, 141, 16);
		contentPane.add(lblSelectYourOpower);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(53, 501, 528, 82);
		contentPane.add(textArea);
		textArea.setEditable(false);
		PrintStream printStream = new PrintStream(new CustomStream(textArea));
		
		PrintStream standardOut = System.out;
		
		System.setOut(printStream);
		System.setErr(printStream);
		
		
		JLabel lblHp = new JLabel("Approximate HP?");
		lblHp.setBounds(349, 91, 157, 16);
		contentPane.add(lblHp);
		
		
		grassChoice.setBounds(10, 234, 190, 22);
		contentPane.add(grassChoice);
		grassChoice.add("> 600");
		grassChoice.add(">= 451 and <= 600");
		grassChoice.add(">= 301 and <= 450");
		grassChoice.add(">= 151 and <= 300");
		grassChoice.add(">= 31 and <= 150");
		grassChoice.add("<= 30");
		
		hpChoice.setBounds(349, 125, 168, 22);
		contentPane.add(hpChoice);
		hpChoice.add("100%");
		hpChoice.add("75%");
		hpChoice.add("50%");
		hpChoice.add("25%");
		hpChoice.add("10%");
	}
}
