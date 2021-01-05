import java.util.Date;
public class UseDate {
    public static void main(String[] args) {
        long l = 10000;
        Date day = new Date(l);
        System.out.println(l+":"+day.toString());
        for(int i = 0;i < 7;++ i){
            l *= 10;
            day.setTime(l);
            System.out.println(l+":"+day.toString());
        }
    }
}