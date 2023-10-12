package salary_slip;
import java.util.Scanner;

public class EmployeeSalary {

	 double base_pay,ded_amnt,bonus;
	
     
	public void inputSalaryDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the basic pay    : ");
		base_pay=sc.nextDouble();
		System.out.print("Please enter deduction amount : ");
		 ded_amnt=sc.nextDouble();
		System.out.print("Please enter bonus amount     : ");
	    bonus=sc.nextDouble();
		sc.close();

		
	}
	
}
