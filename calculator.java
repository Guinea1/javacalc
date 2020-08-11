import java.io.BufferedReader; import java.io.IOException; import 
java.io.InputStreamReader; public class Main {
	public static void main(String[] args) throws IOException
	{
	      BufferedReader inData = new BufferedReader ( new 
InputStreamReader( System.in) );
	      
	      // Setup
	      System.out.println( "Calculator" );
	      System.out.println("");
	      int num1 = 0;
	      int num2 = 0;
	      String op = "";
	      int out = 0;
	    	  System.out.println("What is your first number?");
	    	  try
	    	  {
	    	  num1 = Integer.parseInt( inData.readLine() );
	    	  }
	    	  catch(Exception err)
	    	  {
	    		  System.out.println("Enter numbers only! (must 
also be lower than 2147483647)");
	    		  return;
	    	  }
	    	  System.out.println("");
	    	  System.out.println("What is your operation? (use + - * 
/)");
	    	  op = inData.readLine();
	    	  if(op.equals("+"))
	    	  {
	    		  System.out.println("What is your second 
number?");
	    		  try
		    	  {
		    	  num2 = Integer.parseInt( inData.readLine() );
		    	  }
		    	  catch(Exception err)
		    	  {
		    		  System.out.println("Enter numbers 
only! (must also be lower than 2147483647)");
		    		  return;
		    	  }
	    		  System.out.println("");
	    		  out = (num1 + num2);
	    		  System.out.println(out);
	    	  }
	    	  else if(op.equals("-"))
		      {
	    		  System.out.println("What is your second 
number?");
	    		  try
		    	  {
		    	  num2 = Integer.parseInt( inData.readLine() );
		    	  }
		    	  catch(Exception err)
		    	  {
		    		  System.out.println("Enter numbers 
only! (must also be lower than 2147483647)");
		    		  return;
		    	  }
	    		  System.out.println("");
	    		  out = (num1 - num2);
	    		  System.out.println(out);
		      }
	    	  else if(op.equals("*"))
	    	  {
	    		  System.out.println("What is your second 
number?");
	    		  try
		    	  {
		    	  num2 = Integer.parseInt( inData.readLine() );
		    	  }
		    	  catch(Exception err)
		    	  {
		    		  System.out.println("Enter numbers 
only! (must also be lower than 2147483647)");
		    		  return;
		    	  }
	    		  System.out.println("");
	    		  out = (num1 * num2);
	    		  System.out.println(out);
	    	  }
	    	  else if(op.equals("/"))
	    	  {
	    		  System.out.println("What is your second 
number?");
	    		  try
		    	  {
		    	  num2 = Integer.parseInt( inData.readLine() );
		    	  }
		    	  catch(Exception err)
		    	  {
		    		  System.out.println("Enter numbers 
only! (must also be lower than 2147483647)");
		    		  return;
		    	  }
	    		  System.out.println("");
	    		  try
	    		  {
	    		  out = (num1 / num2);
	    		  }
	    		  catch(Exception err)
		    	  {
		    		  System.out.println("Cannot divide by 
0!");
		    		  return;
		    		  
		    	  }
	    		  System.out.println(out);
	    	  }
	    	  else
	    	  {
	    		  System.out.println("You must only enter + - * 
/");
	    	  }
	}
}
