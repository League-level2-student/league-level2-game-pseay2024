package main;

import java.util.ArrayList;

import javax.swing.JButton;

public class Checker {
	Checker() { }
	ArrayList<JButton> bs;
	String check(ArrayList<JButton> bs)
	{
		this.bs = bs;
		//checking if the x has won the game
		String s = "x";
		if (cInd(s,0,1,2) || cInd(s,3,4,5) || cInd(s,6,7,8) || cInd(s,0,4,8) || cInd(s,2,4,6) || cInd(s,0,3,6) || cInd(s,1,4,7) || cInd(s,2,5,8))
		{
			return s; 
		}
		s = "o";
		if (cInd(s,0,1,2) || cInd(s,3,4,5) || cInd(s,6,7,8) || cInd(s,0,4,8) || cInd(s,2,4,6) || cInd(s,0,3,6) || cInd(s,1,4,7) || cInd(s,2,5,8))
		{
			return s; 
		}
		s = "";
		return s;
		
	}
	
	boolean cInd(String s, int a, int b, int c)
	{
		if (bs.get(a).getText() == s && bs.get(b).getText() == s && bs.get(c).getText() == s) return true;
		return false;
	}
}
