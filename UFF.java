public class UFF
  {
	public void sort()
	{
	  String str= '1'+getKeyPrev().getKey();
	  ValueClass v= getNext();
	  int digit= v.ReturnFirst();
	  int nextk=Integer.parseInt(str, 2);
	  System.out.println("NextK: "+nextk);
	  for(i=0;i<4;i++)
	   {
			if((arr[i]&nextk)==0)
			 { 
			  v.addNumber(arr[i]);
			  delete(arr[i]);
          } 
		}
	  if((digit&nextk)==0)
	    {
		  System.out.println("I:"+i+"\n array size"+arr.length);
		  v.addNumber(arr[i]);
		  delete(arr[i]);
		 }	
	  else
	    addNumber(arr[i]);	 
	}
	public void delete(int n)
	{	
  	  if(search(n)!=-999)
				{  
				   int j=0;
				   for(int i=0;i<str.length();i++)
         	  {	
		           s=strRevd.substring(0,i);
		           for(j=0;j<A.size();j++)
		             { 
                        if((A.get(j).getKey()).equals(s))
			               	{
			                  	 System.out.println("Element found in key "+A.get(j));
										 break;
			                	}
					    }
				  }
				   int res=A.get(j).getValue().delete(n);  	  				
			    	if(res==0)
				    { 
                A.get(j).setValue(null);
					 char ch=s.charAt(0);
					 s=s.substring(s.charAt(1));
					 A.remove(A.get(j));
					 if(ch==0)
					   ch=1;
					 else                                  
					   ch=0;
					 s=ch+s;
					 for(int k=0;k<A.size();k++)
					 {
					  if(s==(A.get(k).getKey()))
					   {
					    s=s.substring(s.charAt(1));
						 A.get(k).setKey(s);
						} 		          
					  break;
					 } 	  
				    }	 
				}			       
	}	
	public int delete(int n)
	{
		int j=-999;
		for(i=0;i<arr.length;i++)
		  {
		    if(arr[i]==n)
			  {
				j=i;
			  }  
		  }
		for(int k=i;k<arr.length-1;k++)
		 {
		  arr[k]=arr[k+1];
		 }  
		 arr[arr.length-1]=0;
		return j;  
	}	
}