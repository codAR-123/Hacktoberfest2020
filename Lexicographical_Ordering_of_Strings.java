/*Example:
	*Enter some strings to be sorted in lexicographical order according to dictionary: 

	#Input :->	apple zebra zip banana dog cat mirror xylophone star lemon bat

	#Output:->	*Strings in Lexicographical Order are:
			(1) apple 
			(2) banana 
			(3) bat
			(4) cat
			(5) dog
			(6) lemon
			(7) mirror
			(8) star
			(9) xylophone
			(10) zebra
			(11) zip 
*/

// #Code Starts from here ->>

import java.util.*;
public class Lexicographical_Ordering_of_Strings{ 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("*Enter some strings to be sorted in lexicographical order according to dictionary: ");
		ArrayList<String> a=new ArrayList<String>();
		Scanner sc=new Scanner(s.nextLine());
		s.close();
		while(sc.hasNext())
		{
			a.add(sc.next().toLowerCase());
		}
		sc.close();
		for(int i=0; i <a.size()-1; i++)
		{
			
			for(int j=0; j< a.size()-1; j++)
			{
				if(a.get(j).compareTo(a.get(j+1))>0)
				{
					String t=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1, t);					
				}
			}
		}
		System.out.println("\n*Strings in Lexicographical Order are:");
		for(int i=0; i<a.size(); i++)
		{
			System.out.println("("+(i+1)+") "+a.get(i)+" ");
		}
	}
}
