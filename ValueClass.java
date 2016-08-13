public class ValueClass
{
   private int arr[];
	private int latest, i;
	private KeyClass p;
	private ValueClass prev,next;
	public ValueClass()
	{
	  arr=new int[4];
	  latest=0;
	  next=null;
	  prev=null;
	  p=null;
	}
	public void setKeyPrev(KeyClass kc)
	{
	 p=kc;
	}
	public KeyClass getKeyPrev()
	{
	 return p;
	}
	public void setLatest()
	 {
	 	latest=0;
	 }
	public void setPrev(ValueClass p)
	{
	 prev=p;
	}
	public ValueClass getPrev()
	{
	  return prev;
	}
	public void setNext(ValueClass n)
	{
	  next=n;
	}
	public ValueClass getNext()
	{
	  return next;
	}
	public int addNumber(int num)
	{
	  if(latest==4)
	   return -999;
	  else
	  { 
	    int f=0;
	    for(int i=0;i<latest;i++)
		  if(arr[i]==num)
		    f=1;
		if(f==0)	 
	    arr[latest++]=num;	
	    return 0;
     }
	}
	public void display()
	{
	   if(latest==0)
		{
		 return;
		}
		else
		{
		System.out.print("\nKey: "+getKeyPrev().getKey()+"-->"); 
		for(i=0;i<latest;i++) 
		  System.out.print(arr[i]+"     \t");
	   }
	}
	public int search(int num)
	{  
	   int flag=-999;
		for(i=0;i<arr.length;i++)
		  {
		  	 if(arr[i]==num)
			  {
			  	 flag=i;
				 System.out.println("Element found in key "+getKeyPrev().getKey());
             display();
			  }
		  }
		return flag;  
	}
	public void sort()
	{
		System.out.println("in sort method");
       int num,i,temp[]= new int[5];    
		 ValueClass v=getNext();
		 KeyClass kc=new KeyClass();
		 kc.setValue(v);
		 v.setKeyPrev(kc);
		 if(latest==4)
		   {
				for(i=0;i<4;i++)
				  temp[i]=arr[i];
				temp[4]=v.ReturnElement(0);  
			}
		 else
		   {
				for(i=0;i<4;i++)
				  temp[i]=v.ReturnElement(i);
				temp[4]=arr[0];  
			}
		 for(i=0;i<4;i++)
		   arr[i]=0;
		 setLatest();	
		 v.setLatest();
		 String str1= '0'+getKeyPrev().getKey();
		 String str2= '1'+getKeyPrev().getKey();
		 getKeyPrev().setKey(str1);
		 v.getKeyPrev().setKey(str2);

		 for(i=0;i<5;i++)
		   { System.out.println("for loop:"+i+":"+temp[i]);
		 String numB= Integer.toBinaryString(temp[i]);
		 for(int t=numB.length();t<8;t++)
		   numB='0'+numB;
		 System.out.println("numB.(:"+numB);			  
			  System.out.println("numB.length(:"+numB.length());
			  			  System.out.println("str1.length(:"+str1.length());
				if((str1).equals(numB.substring(numB.length()-str1.length())))
				  {
				  	num= addNumber(temp[i]);
					if(num==-999)
					  {
				//	  	sort();
						break;
					  }
				  }
				  else  
				  {
				   num=v.addNumber(temp[i]);
					if(num==-999)
					  {
				//	   sort();
						break;
					  }
		        }  
			} 	
	}
	public int ReturnElement(int index)
	{
	  int n=0;
	  for(int i=0;i<4;i++)
	   {
	     if(index==i)
		     n=arr[i];
      }
	 return n;
	}
}