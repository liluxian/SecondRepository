import java.util.Scanner;
public class Discount {
	public static void main(String[]args){
		boolean flag = false;//�Ƿ�������Ʊ�־λ
		boolean[] huaSe = new boolean[4];//��ɫ��־λ���鵽��Ϊtrue
		int count = 0;//��ȡ��������
		//���ƣ�ֱ�����ֻ�ɫ���鵽Ϊֹ
		while (!flag) {
			if (huaSe[0] && huaSe[1] && huaSe[2] && huaSe[3])
				flag = true;
			else {
				switch (choosePai(huaSe)) {
				case "Spades":
					huaSe[0] = true;
					break;
				case "Hearts":
					huaSe[1] = true;
					break;
				case "Diamonds":
					huaSe[2] = true;
					break;
				case "Clubs":
					huaSe[3] = true;
					break;
				}
				count++;
			}
		}
		System.out.println("Number of picks: "+count);
	}
	public static String choosePai(boolean[]huaSe){
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8",
				"9","10","Jack","Queen","King"};
		//������deck��ʼ��
		for(int i = 0;i < deck.length;i++)
			deck[i] = i;
		//ϴ�ƣ��������������
		for(int i = 0;i < deck.length;i++){
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		//ģ�����
		int i = (int)(Math.random()*52);
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		//�жϴ������Ƿ��ӡ����
		switch(suit){
		case "Spades":
			if(!huaSe[0])
				{System.out.println(rank+" of "+suit);huaSe[0] = true;}
			break;
		case "Hearts":
			if(!huaSe[1])
			    {System.out.println(rank+" of "+suit);huaSe[1] = true;}
			break;
		case "Diamonds":
			if(!huaSe[2])
			    {System.out.println(rank+" of "+suit);huaSe[2] = true;}
			break;
		case "Clubs":
			if(!huaSe[3])
			    {System.out.println(rank+" of "+suit);huaSe[3] = true;}
			break;
		}
		//���ػ�ɫ
		return suit;
	}
}
