package labproject4;

public class TestPlayingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PlayingCard[] deck= new PlayingCard[52];
int count=0;
for(int suit=1;suit<=4;suit++) {
	for(int value=1;value<=13;value++) {
		PlayingCard pc=new PlayingCard(value,suit);
		deck[count]=pc;
		count++;
	}
}

for(PlayingCard pc:deck) {
	System.out.println(pc);
}









	}

}
