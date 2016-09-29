import java.util.*;
import java.io.*;

public class A04{

	public void input(){
		Scanner s = new Scanner(System.in);

	        System.out.print("국어 점수를 입력하세요 :");
                int kor = s.nextInt();

                System.out.print("영어 점수를 입력하세요 :");
                int eng = s.nextInt();

                System.out.print("수학 점수를 입력하세요 :");
                int math = s.nextInt();

                int total = kor+eng+math;
                double avg = (double)total/3.0;
                print("입력하신 점수의 총점은  "+total+"이고\n");
                print("평균은 "+avg+" 입니다");

		if (kor >= eng && kor >= math) print("국어점수가 우수합니다");
		else if(eng >= kor && eng >= math) print("영어점수가 우수합니다");
		else print("수학점수가 우수합니다");
	}

	void print(String str){
                System.out.println(str);
        }

	public static void main(String[] args){
                new A04().input();
	}
}
