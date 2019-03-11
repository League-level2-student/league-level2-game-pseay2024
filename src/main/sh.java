package main;

import javax.swing.JButton;

public class sh {
	sh() { }
	
	static void buttonClick(JButton jba, String turn)
	{
		jba.setText(turn);
		jba.setEnabled(false);
	}
	
	static String changeTurn(String turn)
	{
		switch (turn)
		{
		case "x":
			return "o";
		case "o":
			return "x";
		}
		return "whaaaat has gone wrong????????";
	}
}
