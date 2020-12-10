import java.util.ArrayList;

import javax.swing.JFrame;

public class CorrectChange extends JFrame
{
	
	public CorrectChange(){
		
		//use the print statment to test the method 
		//test
		//System.out.println(getNotes(134.55));
	}
	
	
	public String getNotes(double change ) {
		 String changeNeeded="";
	      
	      int fiftyNoteNeeded=0;
	      int twentyNoteNeeded=0;
	      int tenNoteNeeded=0;
	      int fiveNoteNeeded=0;
	      int fiftyCentNeeded=0;
	      int twentyCentNeeded=0;
	      int tenCentNeeded=0;
	      int fiveCentNeeded=0;
	      int oneCentNeeded=0;
	      
	      double changeRemaining= change;//this gets the value of the change and be updated every time a new number of notes is calculated
	      
	      //get the amount of notes needed and subtract this value from changeRemaining
	      if(changeRemaining/50.00>=1) {
	    	  fiftyNoteNeeded=(int) (changeRemaining/50.00);
	    	  changeRemaining=Math.round((changeRemaining-(fiftyNoteNeeded*50.00)) * 100.0) / 100.0;//round the new value to 2 decimal places 
	      }
	      
	      if(changeRemaining/20.00>=1) {
	      twentyNoteNeeded=(int) (changeRemaining/20.00);
	      changeRemaining=Math.round((changeRemaining-(twentyNoteNeeded*20.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/10.00>=1) {
	      tenNoteNeeded=(int) (changeRemaining/10.00);
	      changeRemaining=Math.round((changeRemaining-(tenNoteNeeded*10.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/5.00>=1) {
	      fiveNoteNeeded=(int) (changeRemaining/5.00);
	      changeRemaining=Math.round((changeRemaining-(fiveNoteNeeded*5.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/0.50>=1) {
		  fiftyCentNeeded=(int) (changeRemaining/0.50);
		  //changeRemaining=changeRemaining-(fiftyCentNeeded*0.50);
		  changeRemaining=Math.round((changeRemaining-(fiftyCentNeeded*0.50)) * 100.0) / 100.0;
		  } 
	      
	      
	      if(changeRemaining/0.20>=1) {
		  twentyCentNeeded=(int) (changeRemaining/0.20);
		  changeRemaining=Math.round((changeRemaining-(twentyCentNeeded*0.20)) * 100.0) / 100.0;
		  }

	      
	      if(changeRemaining/0.10>=1) {
		  tenCentNeeded=(int) (changeRemaining/0.10);
		 // changeRemaining=changeRemaining-(tenCentNeeded*0.10);
		  changeRemaining=Math.round((changeRemaining-(tenCentNeeded*0.10)) * 100.0) / 100.0;
		  }

	      
	      if(changeRemaining/0.05>=1) {
		  fiveCentNeeded=(int) (changeRemaining/0.05);
		  changeRemaining=Math.round((changeRemaining-(fiveCentNeeded*0.05)) * 100.0) / 100.0;
		  }

	      if(changeRemaining/0.01>=1) {
			  oneCentNeeded=(int) (changeRemaining/0.01);
			  changeRemaining=Math.round((changeRemaining-(oneCentNeeded*0.01)) * 100.0) / 100.0;
	      }
	      changeNeeded="Fifty Notes:"+fiftyNoteNeeded+"\nTwenty notes:"+twentyNoteNeeded+"\nTen notes:"+tenNoteNeeded+"\nFive notes:"+fiveNoteNeeded+
	    		  "\nFifty cent coin:"+ fiftyCentNeeded +"\nTwenty cent coin:"+ twentyCentNeeded+"\nTen cent coin:"+ tenCentNeeded
	    		  +"\nFive cent coin:"+ fiveCentNeeded+"\nOne cent coin:"+ oneCentNeeded;
	      
		return changeNeeded;
	}
	
	
	
	public static void main(String[] args) {
		 new CorrectChange();
	}
   
   
}
