package program;

public class reverse_string {

	public static void main(String[] args) {
		
		String s="Madam";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+ s.charAt(i);
		}
		System.out.println(rev);
		
		if (s.equalsIgnoreCase(rev))
		{
			System.out.println("Its a palidrome");
		}
		else
		{
			System.out.println("Its not palidrome");
		}
		
//		String a="madam";
//		String rev1="";
//		
//		for(int j=a.length()-1; j>=0; j--)
		

	}

}
