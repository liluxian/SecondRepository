import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class MapBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Books> books=new HashMap<String,Books>();
 books.put("#31234563", new Books("#31234563","《我们都一样年轻又彷徨》",38.4,"hz"));
 books.put("#53453453", new Books("#53453453","《从你的全世界路过》",14.38,"bj"));
 books.put("#53453434", new Books("#53453434","《感谢自己的不完美》",52.8,"nj"));
 books.put("#83343413", new Books("#83343413","《找到意想不到的自己》",37.84,"sz"));
 books.put("#34535435", new Books("#34535435","《你值得拥有最好的一切》",66,"wh"));		
		Iterator iter=books.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry=(Map.Entry)iter.next();
			System.out.println(entry.getKey()+" - "+((Books)entry.getValue()).getName()+" - "+((Books)entry.getValue()).getMoney()+" - "+((Books)entry.getValue()).getFrom());
		}
	}

}
class Books {
	private String number;
	private String name;
	private double money;
	private String from;
	public Books() {}
	public Books(String number,String name,double money,String from) {
		this.number = number;
		this.name = name;
		this.money = money;
		this.from = from;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
} 