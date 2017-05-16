package homeworkdate3;

import java.util.Scanner;

public class P159_15
{

	public static void main(String[] args)
	{
		double w,h,s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("weight (Kg.)");
		w = sc.nextDouble();
		System.out.println("height (cen)");
		h = sc.nextDouble();
		
		s1 = Math.sqrt((w*h)/3600);
		s2 = (71.84*Math.pow(w,0.425)*Math.pow(h,0.725))/10000;
		s3 = 0.0003207*Math.pow(h,0.3)*Math.pow((1000*w),(0.7285-0.0188)*(3+Math.log10(w)));
		System.out.println("สูตรของ Mosteller " + s1);
		System.out.println("สูตรของ Dubois " + s2);
		System.out.println("สูตรของ Boyd " + s3);
		

	}

}
