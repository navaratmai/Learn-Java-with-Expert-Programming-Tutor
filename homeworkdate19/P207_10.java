package homeworkdate19;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class P207_10
{
	private static final String[] ROMAN =
	{ "M", "D", "C", "L", "X", "V", "I" };
	private static final int[] DIGIT =
	{ 1000, 500, 100, 50, 10, 5, 1 };

	private String valueText;

	// �����������Methods��������������
	public String getText(int amount)
	{
		BigDecimal value = new BigDecimal(amount);
		this.valueText = getRomanNumber(value);
		return this.valueText;
	}

	public String getText(long amount)
	{
		BigDecimal value = new BigDecimal(amount);
		this.valueText = getRomanNumber(value);
		return this.valueText;
	}

	public String getText(String amount)
	{
		BigDecimal value = new BigDecimal(amount.trim());
		this.valueText = getRomanNumber(value);
		return this.valueText;
	}

	public String getText(Number amount)
	{
		BigDecimal value = new BigDecimal(String.valueOf(amount));
		this.valueText = getRomanNumber(value);
		return this.valueText;
	}

	private static String getRomanNumber(BigDecimal amount)
	{
		String roman = "";
		if (amount.compareTo(BigDecimal.ONE) < 0)
		{
			return "Value of RomanNumeral must be positive.";
		}
		if (amount.compareTo(BigDecimal.valueOf(new Long("3999"))) > 0)
		{
			return "Value of RomanNumeral must be 3999 or less.";
		}
		int N = Integer.parseInt(amount.toString());
		for (int i = 0; i < DIGIT.length; i++)
		{
			while (N >= DIGIT[i])
			{
				roman += ROMAN[i];
				N -= DIGIT[i];
			}
		}
		return roman;
	}

	public static void main(String[] args)
	{
		/*int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;*/
		String roman;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int num[] = {1,5,10,50,100,500,1000};
		int count[] = new int[10];

		System.out.print("Please input Roman number : ");
		roman = sc.nextLine();
		String [] s = roman.split(",");
		for (int i = 0; i < s.length; i++)
		{
			if (s[i] == "I")
			{
				total = total + 1;
			}
			if (s[i] == "V")
			{
				total = total + 5;
			}
			if (s[i] == "X")
			{
				total = total + 10;
			}
			if (s[i] == "L")
			{
				total = total + 50;
			}
			if (s[i] == "C")
			{
				total = total + 100;
			}
			if (s[i] == "D")
			{
				total = total + 500;
			}
			if (s[i] .equals( "M"))
			{
				total = total + 1000;
			}
		}
		System.out.println(total);

	}

}
