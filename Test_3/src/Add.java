
import java.util.*;
class Add{
    public static void main(String[] args){
        int[] list1={1,3,5,7,9};
        int[] list2={2,4,6,8,10};
        System.out.println(Arrays.toString(merge(list1,list2)));
    }
    /*
    有序数组的合并
    最主要的问题在于 数组之间有长有短
    */
    public static int[] merge(int[] list1,int[] list2){
        /*
        先考虑数组是否为空
        都为空返回null
        某个为空返回另一个
         */
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        //只有两个都不是null的情况再考虑具体操作
        int[] list3=new int[list1.length+list2.length];//创建一个长度为两个list长度之和的list3数组
        int p1=0;//存放list1的值
        int p2=0;//存放list2的值
        int p3=0;//存放有序且包含list1，list2的值
        while(true){
            if(p1==list1.length&&p2==list2.length){//当两者都遍历完时循环结束
                break;
            }
            if(p1<list1.length&&p2==list2.length){//list2结束了，直接把list1的值依次存入
                list3[p3++]=list1[p1++];
            }else if(p1==list1.length&&p2<list2.length){//list1结束了，直接把list2的值依次存入
                list3[p3++]=list2[p2++];
            }else{//都没结束则比较谁小，先放谁
                if(list1[p1]<=list2[p2]){
                    list3[p3++]=list1[p1++];
                }else{
                    list3[p3++]=list2[p2++];
                }
            }
        }
        return list3;
    }
}