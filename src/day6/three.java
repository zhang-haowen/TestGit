package day6;

import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
         System.out.println("��������Ҫ���н׳˵���");
         int i=scanner.nextInt();
         int sum=1;
         int j=1;
         for(;j<i;j++){
             sum*=j;
         }System.out.println("�׳�Ϊ"+sum);


}
}
