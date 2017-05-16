package date6;

import java.util.Scanner;

public class P77_1
{

	public static void main(String[] args)
	{
		String [] name = new String[10];
		String [] surname = new String[10];
		int [] score = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < score.length; i++)
		{
			System.out.println("Please input name,surname,score");
			name[i] = sc.nextLine();
			surname[i] = sc.nextLine();
			score[i] = sc.nextInt();
			sc.nextLine();
		}
		int max_index = -1;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < score.length; i++)
		{
			if(score[i] > max)
			{
				max = score[i];
				max_index = i;
			}
		}
		System.out.println(name[max_index] + " " + surname[max_index]);
	}

}
