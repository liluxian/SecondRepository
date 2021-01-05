import java.util.Date;
import java.util.Random;
import java.util.Timer;
public class UseStopWatch {
    public static void main(String[] args) {
        Random randpos = new Random(100001);
        double n[] = new double[100000];
        for(int i = 0; i< 100000;++ i) n[i] = randpos.nextDouble();
        StopWatch a = new StopWatch();//开始计时
        //选择排序
        for(int i = 0;i < 100000 - 1;++ i){
            int smallest = i;
            for(int j = i + 1;j < 100000;++ j){
                if(n[j] < n[smallest]){
                    smallest = j;
                }
            }
            if(i != smallest){
                double tool = n[i];
                n[i] = n[smallest];
                n[smallest] = tool;
            }
        }
        a.stop();//结束计时
        System.out.println(a.getElapsedTime()+"ms");
    }
}
class StopWatch{
    private Date startTime;
    private Date endTime;
    public StopWatch(){
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}