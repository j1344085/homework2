import java.util.*;
import java.io.*;
        class A02 {
                static double input_degree;
                
		//void print(String str){
	        //       System.out.println(str);
	        //}
		
		public static void main (String[] arg) {
                	new A02().input();
       		}	

        	void input() {
                	Scanner s = new Scanner(System.in);
                	System.out.print("온도를 입력하세요 : ");
                	this.input_degree = s.nextDouble();
                	
			String kind;
                	Scanner c = new Scanner(System.in);
                	System.out.print("입력한 온도가 섭씨이면 c 를, 화씨온도이면 f 를 입력하세요 : ");
         	        kind = c.next();
                	if (kind.equals("c")|| kind.equals ("C"))
	        	        new A02().c();
                	else if (kind.equals("f") || kind. equals ("F"))
  	        		new A02().f();
                	else
                	        System.out.println("잘못 입력 하셨습니다.");
        	}

        	void c() {
                	double  output_degree;
                	output_degree = input_degree * 1.8 + 32;
                	System.out.printf("변환된 온도는 %1f 입니다. \n", output_degree);
        	}

        	void f() {
        	        double output_degree;
                	output_degree = (input_degree - 32) / 1.8;
                	System.out.printf("변환된 온도는 %1f 입니다. \n", output_degree);
       		}
	}

