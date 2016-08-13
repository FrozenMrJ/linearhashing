import java.util.ArrayList;
public class linearHashMap
{  
	String str, strRevd,s;
	ArrayList<KeyClass> A;
	ArrayList<String> used;
	public linearHashMap()
 	{
     A=new ArrayList<KeyClass>();
	  used= new ArrayList<String>();
	}
	public void add(int num)
	{ 
	        if(A.size()==0)
			  {
				  System.out.println("here");
				  KeyClass key=new KeyClass();
				  if(num%2==1)
				     key.setKey("1");
				  else
				     key.setKey("0");	  
				  ValueClass v= new ValueClass();
				  v.addNumber(num);
				  key.setValue(v);	
				  v.setKeyPrev(key);			  
				  A.add(key);			  
			  }
			  else
		{	
	 str=Integer.toBinaryString(num);
	 strRevd= new StringBuilder(str).reverse().toString();
	 int j=0;   
	 boolean flag = false;
	    for(int i=1;i==1||i<str.length();i++)
	      {
				System.out.println("i::"+i);
         	s=strRevd.substring(0,i);
				s= new StringBuilder(s).reverse().toString();
				System.out.println("s::"+s);
				boolean gflag=false;
			   if(used.size()!=0)
						for(int l=0;l<used.size();l++){
						System.out.println("used.get(l)::"+used.get(l));
						  if((used.get(l)).equals(s)){
						  	System.out.println("in if gfflag is 0:");
						    gflag=true;
							 }}
				if(gflag) continue;			 
				for(;j<A.size();j++)
				  {

				  System.out.println("A.get(j::"+A.get(j).getKey());
				  if(s.equals(A.get(j).getKey()))
				     {
					   System.out.println("SHOULD BE HERE");
					     ValueClass val= A.get(j).getValue();
						  int ans= val.addNumber(num);
						  if(ans==-999)
						     {
							   used.add(A.get(j).getKey());
								System.out.println("Key b4 split:"+A.get(j).getKey());
								split(A.get(j),num);	
							  }	
						  flag=true;
						  break;
							  							  
					  }
				  }
				  System.out.println("flag::"+flag);
				  if(flag) break;	   
			 }
				 if(j==A.size())
	  {
	   boolean f=false;
	    for(int i=1;i==1||i<str.length();i++)
		 {  
		    
		    s=strRevd.substring(0,i);
			 s= new StringBuilder(s).reverse().toString();
		    for(int k=0;k<A.size();k++)
			 {
			  if((A.get(k).getKey()).equals(s))
			    continue;
			   else
				  
			    {
				  System.out.println("here111");
				  KeyClass key=new KeyClass();
				  key.setKey(s);
				  ValueClass v= new ValueClass();
				  v.addNumber(num);
				  key.setValue(v);	
				  v.setKeyPrev(key);			  
				  A.add(key);
				  f=true;
				  break;
				 }	 
			 }
			if(f) break; 
		 }	 
     }
    }
	}

	public void displayAll()
	{   
	   if(A.size()==0)
		  System.out.println("There are no elements in the table.");
		else
		{  
       for(int i=0;i<A.size();i++)
			A.get(i).getValue().display();
	   }	  
	}
	public void split(KeyClass spl, int n)
	{
		ValueClass val= spl.getValue();
		ValueClass next=new ValueClass();
		val.setNext(next);
		next.addNumber(n);
		val.sort();
		val.setNext(null);
		next.setPrev(null);
		A.add(next.getKeyPrev());

	}
	public int search(int number)
	{
	 int res=-999;
	 if(A.size()==0)
	  System.out.println("There are no elements in the table.");
	 else
	 { 
	 str=Integer.toBinaryString(number);
	 strRevd= new StringBuilder(str).reverse().toString();

	 for(int i=str.length();i>=0;i--)
	  {	
		 s=str.substring(0,i);
		 System.out.println("S: "+s);
		 for(int j=0;j<A.size();j++)
		   {  
			   if((A.get(j).getKey()).equals(s))
				{
				  res= A.get(j).getValue().search(number);
				  if(res==-999)
				    continue;
				  else
				    break;
				}	
		 	}
		}	
	 }		
	 return res;
  }
}