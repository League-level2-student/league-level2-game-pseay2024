package main;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tile {
	public static enum state {
		X, O, BLANK;
	}

	Rectangle collisionBox;
	state currentState = state.BLANK;
	Font f;

	Tile(Rectangle colBox) {
		collisionBox = colBox;
	}

	void clicked(boolean xTurn, state st) {
		f = new Font("Arial", 0, 50);
		currentState = st;
	}

	void update() {

	}

	void draw(Graphics g) {
		switch (currentState) {
		case X:
			g.drawString("X", 0, 50);
			break;
		case O:
			g.drawString("O", 0, 50);
			break;
		default:
			break;
		}
	}
}
