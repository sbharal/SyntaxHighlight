package SyntaxHighlight;


import java.util.Scanner;

public class Story1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer strb = new StringBuffer();
		
		String[] arr = str.split("\\s+"); 
		for(String word : arr){
		if(word.equalsIgnoreCase("AS") || word.equalsIgnoreCase("if") || word.equalsIgnoreCase("AND") || word.equalsIgnoreCase("then") || word.equalsIgnoreCase("when")){
			strb.append("[blue]" + word + "[blue]");
			strb.append(" ");
			
		}else 
		   {
		    strb.append(word);
		    strb.append(" ");
		   }
		}
		
		System.out.println(strb);
		
	}

}
