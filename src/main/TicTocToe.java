package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTocToe implements ActionListener{
	int buttonsClicked = 0;
	String turn = "x";
	JButton jbNW;
	JButton jbN;
	JButton jbNE;
	JButton jbW;
	JButton jb;
	JButton jbE;
	JButton jbSW;
	JButton jbS;
	JButton jbSE;
	JPanel jp;
	JFrame jf;
	final int WIDTH = 500;
	final int HEIGHT = 500;
	ArrayList<JButton> Buttons;
	
	TicTocToe() {
		jbNW = new JButton();
		jbN = new JButton();
		jbNE = new JButton();
		jbW = new JButton();
		jb = new JButton();
		jbE = new JButton();
		jbSW = new JButton();
		jbS = new JButton();
		jbSE = new JButton();
		jf = new JFrame();
		jp = new JPanel();
		Buttons = new ArrayList<JButton>();
	}

	void setup() {
		JOptionPane.showMessageDialog(null,
				"INSTRUCTIONS: You play this game by clicking on a square to put an X or and O in it. You win by getting three of the Xs or Os in a row/column/diagnal. You alternate turns with your opponent");
		Buttons.add(jbNW);
		Buttons.add(jbN);
		Buttons.add(jbNE);
		Buttons.add(jbW);
		Buttons.add(jb);
		Buttons.add(jbE);
		Buttons.add(jbSW);
		Buttons.add(jbS);
		Buttons.add(jbSE);
		jf.setSize(WIDTH, HEIGHT);
		for (JButton jba : Buttons)
		{
			jba.setPreferredSize(new Dimension(165,165));
			jba.addActionListener(this);
			jp.add(jba);
		}
		jf.add(jp);
		jf.pack();
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		TicTocToe ttt = new TicTocToe();
		ttt.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getID());
		System.out.println(e.getSource());
		switch (e.getID())
		{
		case 1001:
			//clicked
			for (JButton jba : Buttons)
			{
				if (e.getSource() == jba)
				{
					buttonsClicked++;
					sh.buttonClick(jba, turn);
					turn = sh.changeTurn(turn);
					Checker.check(Buttons);
				}
			}
			break;
		default:
			break;
		}
	}
}
