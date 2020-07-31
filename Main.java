import java.util.*;

public class Main { 

  public static void showArgs(String[] args) {
  Map<String, String> map = new HashMap<>();
    if(args.length>=2) {
        for(int i=0; i<args.length; i=i+2) {
          map.put(args[i], args[i+1]);
        }
      }
    System.out.println(args);
  }

	public static void main(String[] args) { 
    showArgs(args);
  }
} 
