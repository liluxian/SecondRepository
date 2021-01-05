import java.util.Scanner;
public class StrokeCard {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=(int)(Math.random()*4)+1;
        int y=(int)(Math.random()*13)+1;
        switch(y) {
        case 1:
             System.out.print("The card you picked is Ace of ");
             break;
        case 2:
            System.out.print("The card you picked is 2 of ");
            break;
        case 3:
            System.out.print("The card you picked is 3 of ");
            break;
        case 4:
            System.out.print("The card you picked is 4 of ");
            break;
        case 5:
            System.out.print("The card you picked is 5 of ");
            break;
        case 6:
            System.out.print("The card you picked is 6 of ");
            break;
        case 7:
            System.out.print("The card you picked is 7 of ");
            break;
        case 8:
            System.out.print("The card you picked is 8 of ");
            break;
        case 9:
            System.out.print("The card you picked is 9 of ");
            break;
        case 10:
            System.out.print("The card you picked is 10 of ");
            break;
        case 11:
            System.out.print("The card you picked is Jack of ");
            break;
        case 12:
            System.out.print("The card you picked is Queen of ");
            break;
        case 13:
            System.out.print("The card you picked is King of ");
            break;
        }
        switch(x) {
        case 1:
            System.out.print("Clubs");
            break;
        case 2:
            System.out.print("Diamonds");
            break;
        case 3:
            System.out.print("Hearts");
            break;
        case 4:
            System.out.print("Spades");
            break;
        }
	}
}
