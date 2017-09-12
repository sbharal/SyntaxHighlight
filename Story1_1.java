//Story -- 2

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Story1_1 {

 public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  String str = sc.nextLine();
  
  
  HashMap<String, String> input = new HashMap<String, String>();
    
  input.put("as" , "[blue]");
  input.put("and" , "[red]");
  input.put("if" , "[red]");
  input.put("then" , "[green]");
  input.put("when" , "[blue]");
    for (Map.Entry<String, String> entry : input.entrySet())
    {
             String key = entry.getKey();
             String values = entry.getValue();
             str = str.replaceAll(key, values+key+values);
                 
     }
    
    System.out.print(str); 
 	}
}