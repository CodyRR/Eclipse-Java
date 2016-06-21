import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;



public class SmashV extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel Player1, Player2, Player3, Player4;
	private static String name = "Super Smash Bros for Wii U/Character Icons/";
	private JButton randomizer = new JButton("Randomize");
	private CharacterSetup chara = new CharacterSetup();
	private JLabel Players[];
	
	public SmashV(){
		super("Smash");
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		ImageIcon image = new ImageIcon(name + "chr_00_question_01.png");
		Player1 = new JLabel("", JLabel.CENTER);
		Player1.setSize(134,123);
		Player1.setLocation(22,100);
		Player1.setIcon(image);
		Player2 = new JLabel("", JLabel.CENTER);
		image = new ImageIcon(name + "chr_00_question_02.png");
		Player2.setSize(134,123);
		Player2.setLocation(222,100);
		Player2.setIcon(image);
		Player3 = new JLabel("", JLabel.CENTER);
		image = new ImageIcon(name + "chr_00_question_03.png");
		Player3.setSize(134,123);
		Player3.setLocation(422,100);
		Player3.setIcon(image);
		Player4 = new JLabel("", JLabel.CENTER);
		image = new ImageIcon(name + "chr_00_question_04.png");
		Player4.setSize(134,123);
		Player4.setLocation(622,100);
		Player4.setIcon(image);
		
		Players = new JLabel[]{Player1, Player2, Player3, Player4};
		
		randomizer.setLocation(366, 323);
		randomizer.setSize(100,100);
		randomizer.addActionListener(this);
		randomizer.setEnabled(true);
		
		contentPane.add(Player1);
		contentPane.add(Player2);
		contentPane.add(Player3);
		contentPane.add(Player4);
		contentPane.add(randomizer);
		
		System.out.println("Here");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new SmashV();
		frame.setPreferredSize(new Dimension(1000,500));
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        } );
	}

	public void randomize(){
		
		
		Thread worker = new Thread(){
			public void run(){
				for(int i = 0; i < Players.length; i++){
					
					final int x = i;
					Random rand= new Random();
					int randomNum = rand.nextInt((51 - 0)+1) + 0;
					int randomColor = rand.nextInt((8-1)+1) +1;
					
					ImageIcon pic = new ImageIcon(name + "chr_00_"	+ chara.collection[randomNum] +"_0" + randomColor +".png");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e){
					
					}
					SwingUtilities.invokeLater(new Runnable(){

						public void run() {
							// TODO Auto-generated method stub
							Players[x].setIcon(pic);
						}
					
					});
				}
			}
		};
		worker.start();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == randomizer){
			randomizer.setEnabled(false);
			randomize();
			randomizer.setEnabled(true);
		}
		else{
			System.out.println("error");
		}
	}

}
