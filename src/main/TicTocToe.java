package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



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
	Checker chek;
	
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
		chek = new Checker();
		Buttons = new ArrayList<JButton>();
	}

	void setup() {
		JOptionPane.showMessageDialog(null,
				"INSTRUCTIONS: You play this game by clicking on a square to put an X or and O in it. You win by getting three of the Xs or Os in a row/column/diagnal. You alternate turns with your opponent. The first player will be X. The indication of the whose turn it is will be shown by the background color; red means it is x's turn and green means that it is o's turn. Have fun ;)");
		Buttons.add(jbNW);
		Buttons.add(jbN);
		Buttons.add(jbNE);
		Buttons.add(jbW);
		Buttons.add(jb);
		Buttons.add(jbE);
		Buttons.add(jbSW);
		Buttons.add(jbS);
		Buttons.add(jbSE);
		jp.setBackground(new Color(51, 204, 255));
		jf.setSize(WIDTH, HEIGHT);
		final int buttonSize = 150;
		for (JButton jba : Buttons)
		{
			jba.setOpaque(true);
			jba.setPreferredSize(new Dimension(buttonSize, buttonSize));
			jba.addActionListener(this);
			jba.setFont(new Font("arial", 100, 100));
			jp.add(jba);
		}
		jf.add(jp);
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
			for (JButton jb : Buttons)
			{
				if (e.getSource() == jb)
				{
					buttonsClicked++;
					sh.buttonClick(jb, turn);
					switch(turn)
					{
					case "x":
						jb.setBackground(new Color(255, 51, 0));
						jp.setBackground(new Color(25, 102, 25));
						break;
					case "o":
						//green
						jb.setBackground(new Color(51, 204, 51));
						jp.setBackground(new Color(127, 25, 0));
						break;
					}
					turn = sh.changeTurn(turn);
					
					switch (chek.check(Buttons))
					{
					case "x":
						//x won
						JOptionPane.showMessageDialog(null, "X has won. Congratulations!");
						reset();
						break;
					case "o":
						//o won
						JOptionPane.showMessageDialog(null, "O has won. Congratulations!");
						reset();
						break;
					case "":
						//nothing happened
						if (buttonsClicked == 9)
						{
							JOptionPane.showMessageDialog(null, "Nobody wins. Stalemate.");
							reset();
						}
						break;
					}
				}
			}
			break;
		default:
			break;
		}
		
	}
	void reset()
	{
		buttonsClicked = 0;
		turn = "x";
		jp.setBackground(new Color(51, 204, 255));
		for (JButton jba : Buttons)
		{
			jba.setBackground(null);
			jba.setText("");
			jba.setEnabled(true);
			jp.add(jba);
		}
	}
}
