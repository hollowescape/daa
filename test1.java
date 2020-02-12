import java.util.*;

public class test1{
	public static void main(String argu[])
	{
		stable s=new stable();
		Scanner o=new Scanner(System.in);
		System.out.println(" enter the value of men and women");
		int n=o.nextInt();
		s.womenpref(n);
		s.printwomen(n);
		s.menpref(n);
		s.printmen(n);
		s.stable(n);
		s.afterstable(n);
	}	
}

