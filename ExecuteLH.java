import java.util.Scanner;
public class ExecuteLH
{
	public static void main(String[] args)
	{
      linearHashMap lhm= new linearHashMap();
		System.out.println("...................LINEAR HASHING........................");
		Scanner in= new Scanner(System.in);
		while(true)
		  {
		    System.out.println("\n.......................................................");
		    System.out.println("Enter option:");
			 System.out.println("1. insert");
			 System.out.println("2. Search");
			 System.out.println("3. display contents of table");
			 System.out.println("4. exit");
			 int op=in.nextInt();
			 switch(op)
			  {
			    case 1:System.out.println("Enter element");
				        lhm.add(in.nextInt());
						  break;
				 case 2:System.out.println("Enter element to be searched for");
				        int ele= lhm.search(in.nextInt());
						  if(ele!=-999)
						     System.out.println("it is the "+(ele+1)+" element under the above key");
						  else
						     System.out.println("Element not found");	  
//						  lhm.displayAll();
						  break;
				 case 3:System.out.println("DISPLAY.............");
				        lhm.displayAll();
						  break;
				 default:System.out.println("EXITING.............");
				         return;		  		  		  		  
			  }
		  }
	}
}