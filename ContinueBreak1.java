package chapter412;

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int jumsu,sum = 0 ,count=0;
double avg;
for(;;)
{
	Scanner stdIn = new Scanner(System.in);
	System.out.print(count+1 + "변 학생 점수 입력 : ");
	jumsu = stdIn.nextInt();
	if (jumsu < 0 )
	{
		System.out.println("프로그램 종료");
		break;
	}
	else if (jumsu>100)
	{
		System.out.println("다시 입하세요");
		continue; 
	}
	count++;
	sum =sum+jumsu;
	avg=sum/count;
	System.out.println("함게:"+sum+"편균"+avg);
	
}
	}

}
