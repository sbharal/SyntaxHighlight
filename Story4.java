package SyntaxHighlight;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Story4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strColor = sc.nextLine();
		
		HashMap<String, String> hashColor = new HashMap<>();
		hashColor.put("as" , "[blue]");
		hashColor.put("and" , "[red]");
		hashColor.put("if" , "[red]");
		hashColor.put("then" , "[green]");
		hashColor.put("when" , "[blue]");
		   
		    for(Map.Entry<String, String> entryColor : hashColor.entrySet()){
		    	String keyColor = entryColor.getKey();
		    	String valuesColor = entryColor.getValue();
		    	strColor = strColor.replaceAll(keyColor, valuesColor+keyColor+valuesColor);	
		    	}
		    
		    HashMap<String, String> hashCase = new HashMap<>();
		    hashCase.put("as" , "capital");
		    hashCase.put("and" , "capital");
		    hashCase.put("if" , "lower");
		    hashCase.put("then" , "lower");
		    hashCase.put("when" , "lower");
		    
		    for(Map.Entry<String, String> entryCase : hashCase.entrySet()){
		    	String keyCase = entryCase.getKey();
		    	String valuesCase = entryCase.getValue();
		    	if(valuesCase.equals("lower")){
		    		strColor = strColor.replaceAll(keyCase, keyCase.toLowerCase());
		    	}else if(valuesCase.equals("capital")){
		    		strColor = strColor.replaceAll(keyCase, keyCase.toUpperCase());
		    	}
		    }
		    
		    HashMap<String, String> hashStyle = new HashMap<>();
		    hashStyle.put("AND" , "[bold]");
		    hashStyle.put("if" , "[bold]");
		    
		    for(Map.Entry<String, String> entryStyle : hashStyle.entrySet()){
		    	String keyStyle = entryStyle.getKey();
		    	String valuesStyle = entryStyle.getValue();
		    		strColor = strColor.replaceAll(keyStyle, valuesStyle+keyStyle+valuesStyle);
		    	
		    }
		    	System.out.println(strColor);
		    	
		    }
	}


