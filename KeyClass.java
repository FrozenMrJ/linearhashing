public class KeyClass
{
   private String key;
	private ValueClass point;
	public KeyClass()
	 {
          key=null;   	
			 point=null;
	 }
	public void setKey(String n)
	 {
	 		 key=n;
	 } 
	public void setValue(ValueClass val)
	 {
	 		 point=val;
	 }
	public String getKey()
	{
			 return key;
	}  
	public ValueClass getValue()
	{
	       return point;
	}
}