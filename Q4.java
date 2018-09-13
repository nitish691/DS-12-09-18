import java.util.Scanner;

class Q4
{
	static void Substrings(String str)
	{
		int i=0,j=0,k=1,len=str.length();
		
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<=len;j++)
			{
				System.out.println(k + " " + str.substring(i,j));
				k++;
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("String : " + str);
		System.out.println("Substrings :-");
		Substrings(str);
		System.out.println();
	}
}