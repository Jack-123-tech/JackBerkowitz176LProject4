package labproject4;

import java.util.ArrayList;

public class PlayingCard {

	private int value;
	private String suit;

	public static final int DIAMONDS=2;
	public static final int CLUBS=1;
	public static final int HEARTS=3;
	public static final int SPADES=4;


	public PlayingCard(int value,int suit ) {
		setValue(value);
		setSuite( suit);
	}

	public int getValue() {
		return value;
	}
	public String getSuit() {
		return suit;
	}

	public void setValue(int val) {
		value=val;
	}

	public void setSuite(int suitInt) {

		if(suitInt>=1&& suitInt<5) {


			if(suitInt==CLUBS) {
				suit="CLUBS";

			}

			if(suitInt==DIAMONDS) {
				suit="DIAMONDS";

			}
			if(suitInt==HEARTS) {
				suit="HEARTS";

			}
			if(suitInt==SPADES) {
				suit="SPADES";

			}

		}
		else {System.out.println("Invaided card");}
	}




public  String toString(){
	if (value ==1) {
		return "Ace of "+ suit;
	}
	
	
	else if (value ==11) {
		return "Jack "+suit ;
		
	}
	
	else if (value ==12) {
		return "Queen "+suit ;
	}
	
	else if (value ==13) {
		return  "King "+suit ;
	}
	
	
	
	else {
	return value+"of "+suit;
}
	
}
















}


