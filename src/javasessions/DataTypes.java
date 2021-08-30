package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		byte b = 10;
		b=30;
		byte b1=20;
		byte b2=0;
		byte b3=-100;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);	
		
		float f = (float) 12.33;
		float f1 = 12.43f;
		System.out.println(f);
        System.out.println(f1);
        
        //double:
        
        double d =12.3333d;
        System.out.println(d);
        System.out.println("---------------------");
        
        //char
        
        char c ='a';
        char c5='b';
        char bt='1';
        char ct='$';
        System.out.println(c);
        System.out.println(c+c5);
        System.out.println("-------------");
        System.out.println(c5+ct);
        System.out.println(bt+ct);
        
	}

}
