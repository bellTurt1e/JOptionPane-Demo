package ch2;

import javax.swing.JOptionPane;

public class inpout {
	public int mem;
	public String space;
	public boolean toast;
	
	
	
	public inpout(){
		String stuff = JOptionPane.showInputDialog("How many types of turtles do you like?");
		int me = Integer.parseInt(stuff);
		mem = me;
		String stuf = JOptionPane.showInputDialog("What would you name your turtle?");
		space = stuf;
		String st = JOptionPane.showInputDialog("Do turtles always tell the truth?");
		if (st=="true") {
			toast = true;
		}
		else 
		{
			toast = false;
		}
		if(toast == true) 
		{
			String g = new String();
			g="are";
	
		}
		else 
		{
			String g = new String();
			g="aren't";
		}
	}
	
		public String toString() 
		{
			String out = new String();
			out = "Your favorite turtle was: "+mem+"\n"+ "You wanted to name your turtle: "+space+"\n"+ "Turles always tell the truth: "+toast; 
			return out;
		}
		
		

	
	
	}
	

