package javasessions;

public class IncrementAndDecrementOperators {
	

	public static void main(String[] args) {
	
	//++ Increase the value by 1
	
	int a = 1;
	int b = a++; //Post Increment
	
	System.out.println(a); // 2
	System.out.println(b); // 1 
	System.out.println("------------------");
	
	//Pre Increment
	
	int m = -99;
	int n = m++;
	System.out.println(m);  //-98
	System.out.println(n);  //-99
	System.out.println("------------------------");
	
	int c = 1;
	int d = ++c;
	System.out.println(c);
	System.out.println(d);
	System.out.println("----------------------");
	
	int f = -97;
	int g = ++f;
	System.out.println(f);
	System.out.println(g);
	System.out.println("------------------------");
	
	int t = 1;
	//System.out.println(t++);
	System.out.println(++t);
	System.out.println("-----------------------------");
	
	//Post Decrement
	
	int p = 2;
	int q = p--;
	System.out.println(p); // 1
	System.out.println(q); // 2
	System.out.println("--------------------------");
	
	int h = -999;
	int i = h--;
	System.out.println(h); // -1000
	System.out.println(i); // -999
	System.out.println("---------------------------");
	
	//Pre Decrement
	
	int s1 = 2;
	int s2 = --s1;
	System.out.println(s1); // 1
	System.out.println(s2); // 1
	System.out.println("----------------------------------");
	
	int v = 1;
	System.out.println(++v + v++);
	System.out.println(v);
	System.out.println("-------------------------------------");
	
	int mm = 1;
	System.out.println(mm++ + 4);
	System.out.println(mm);
	System.out.println("------------------------------");

	}

}
