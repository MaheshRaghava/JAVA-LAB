class Stringbuffer
{
public static void main(String []args) 
{
	StringBuffer str = new StringBuffer("JANHVI KAPOOR");
	String message = str.toString();
	System.out.println(message);
	str.delete(2,4);
	System.out.println("after delete"+str);
	str.deleteCharAt(3);
	System.out.println("after char delete"+str);
	
}
}
