import java.util.*;
import java.io.*;
class A06{

	String name;
	int Kor;
	int Math;
	int Eng;

	double avg;
	String grade;
	
	void input(){
		Scanner s = new Scanner(System.in);

		print("이름 : ");
		this.name = s.next();

		Scanner i = new Scanner(System.in);
		
		print("국어점수 입력 : ");
		this.Kor = i.nextInt();
		
		print("수학점수 입력 : ");
		this.Math = i.nextInt();

		print("영어점수 입력 : ");
		this.Eng = i.nextInt();

		this.avg = (this.Kor + this.Math + this.Eng) /3;

		if (this.avg <=100 && this.avg >95) this.grade = "A+";
		else if (this.avg <=95 && this.avg >90) this.grade = "A";
		else if (this.avg <=90 && this.avg >85) this.grade = "B+";
		else if (this.avg <=85 && this.avg >80) this.grade = "B";
		else if (this.avg <=80 && this.avg >75) this.grade = "C+";
		else if (this.avg <=75 && this.avg >70) this.grade = "C";
		else if (this.avg <=70 && this.avg >65) this.grade = "D+";
		else if (this.avg <=65 && this.avg >60) this.grade = "D";
		if (this.avg <= 60) this.grade = "F";

		System.out.println("==================================");

		print("[" + this.name + "] 님은\n");
		print("평균은 " + this.avg + "이고\n");
		print("학점은 " + this.grade + "입니다\n");
	}

	void print(String str){
		System.out.print(str);
	}

	public static void main(String[] args)throws IOException{
		System.out.println("==================================");
		new A06().input();
	}
}
