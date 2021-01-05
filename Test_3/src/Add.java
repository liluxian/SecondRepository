
import java.util.*;
class Add{
    public static void main(String[] args){
        int[] list1={1,3,5,7,9};
        int[] list2={2,4,6,8,10};
        System.out.println(Arrays.toString(merge(list1,list2)));
    }
    /*
    ��������ĺϲ�
    ����Ҫ���������� ����֮���г��ж�
    */
    public static int[] merge(int[] list1,int[] list2){
        /*
        �ȿ��������Ƿ�Ϊ��
        ��Ϊ�շ���null
        ĳ��Ϊ�շ�����һ��
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
        //ֻ������������null������ٿ��Ǿ������
        int[] list3=new int[list1.length+list2.length];//����һ������Ϊ����list����֮�͵�list3����
        int p1=0;//���list1��ֵ
        int p2=0;//���list2��ֵ
        int p3=0;//��������Ұ���list1��list2��ֵ
        while(true){
            if(p1==list1.length&&p2==list2.length){//�����߶�������ʱѭ������
                break;
            }
            if(p1<list1.length&&p2==list2.length){//list2�����ˣ�ֱ�Ӱ�list1��ֵ���δ���
                list3[p3++]=list1[p1++];
            }else if(p1==list1.length&&p2<list2.length){//list1�����ˣ�ֱ�Ӱ�list2��ֵ���δ���
                list3[p3++]=list2[p2++];
            }else{//��û������Ƚ�˭С���ȷ�˭
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