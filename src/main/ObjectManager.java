package main;

import java.awt.Rectangle;

public class ObjectManager {
	Tile[][] ts = new Tile[3][3];

	ObjectManager() {

	}

	void setup() {
		ts[0][0] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[1][0] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[2][0] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[0][1] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[1][1] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[2][1] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[0][2] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[1][2] = new Tile(new Rectangle(0, 0, 50, 50));
		ts[2][2] = new Tile(new Rectangle(0, 0, 50, 50));
	}

	void checkCollision() {

	}
}
