package homeworkdate5;

import java.util.Scanner;

public class P165_9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("Plase input score : ");
		score = sc.nextInt();
		if(score >= 80)
		{
			System.out.println("คะแนน " + score + " ได้เกรด  A ");
		}
		else if(score >= 70)
		{
			System.out.println("คะแนน " + score + " ได้เกรด  B ");
		}
		else if(score >= 60)
		{
			System.out.println("คะแนน " + score + " ได้เกรด  C ");
		}
		else if(score >= 50)
		{
			System.out.println("คะแนน " + score + " ได้เกรด  D ");
		}
		else
		{
			System.out.println("คะแนน " + score + " ได้เกรด  F ");
		}

	}

}
