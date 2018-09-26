/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		boolean b=true;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			for(int j=i;j<i;j++)
			{
				char ch1=str1.charAt(j);
				if(ch==ch1)
				{
					System.out.print(ch);
					b=true;
				}
				else
				{
					b=false;
				}
			}
			if(b==false)
			{
				break;
			}
		}
	}
	
}
