package labproject4;

import java.util.ArrayList;

public class TestPlayingCardArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<PlayingCard>deck=new ArrayList();

int count=0;

for(int suit=1;suit<=4;suit++) {
	for(int value=1;value<=13;value++) {
		PlayingCard pc=new PlayingCard(value,suit);
		deck.add(pc);
		count++;
	}
}

for(PlayingCard pc:deck) {
	System.out.println(pc);
}





























	}
	
	

	
	
	
	
	
	
}
