package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTocToe {
	JFrame jf;
	GamePanel gp;
	final int WIDTH = 500;
	final int HEIGHT = 500;

	TicTocToe() {
		jf = new JFrame();
		gp = new GamePanel(Tile.state.X);
	}

	void setup() {
		JOptionPane.showMessageDialog(null,
				"INSTRUCTIONS: You play this game by clicking on a square to put an X or and O in it. You win by getting three of the Xs or Os in a row/column/diagnal. You alternate turns with your opponent");
		gp.startGame();
		jf.add(gp);
		jf.addMouseListener(gp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jf.pack();
		jf.setVisible(true);
		gp.startGame();
	}

	public static void main(String[] args) {
		TicTocToe ttt = new TicTocToe();
		ttt.setup();
	}
}
