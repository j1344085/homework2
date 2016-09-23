import java.util.*;
import java.io.*;

class A01{
	int age = 0;
		
	public static void main(String[] a){
		new A01().start();
	}
	
	void start(){
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력: ");
		int year = s.nextInt();
		
		this.age = 2016 - year + 1;
	}

	void print(){
		if(age < 20) System.out.println("미성년자 입니다");
		else System.out.println("성인 입니다");
	}




}
