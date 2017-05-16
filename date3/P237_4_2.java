package date3;

public class P237_4_2
{

	public static void main(String[] args)
	{
		double n,a,b;
		a = 50e6;
		b = 70e6;
		n = Math.log(a/b)/Math.log(1.02/1.03);
		n = Math.ceil(n);//ปัดขึ้น
		System.out.println(n);

	}

}
