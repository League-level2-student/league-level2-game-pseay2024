package main;

import javax.swing.JButton;

public class sh {
	sh()
	{
		
	}
	
	void buttonClick(JButton jba, String turn)
	{
		jba.setText(turn);
		jba.setEnabled(false);
	}
	
	String changeTurn(String turn)
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
