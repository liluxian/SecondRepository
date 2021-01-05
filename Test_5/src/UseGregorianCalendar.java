import java.util.GregorianCalendar;
public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar();
        int a = day.get(GregorianCalendar.YEAR);
        int b = day.get(GregorianCalendar.MONTH);
        int c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("修改前"+ a + " 年 " + b + "月" + c + "日");
        long l = 1234567898765L;
        day.setTimeInMillis(l);
        a = day.get(GregorianCalendar.YEAR);
        b = day.get(GregorianCalendar.MONTH);
        c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("修改后" + a + " 年 " + b + "月" + c + "日");
    }
}