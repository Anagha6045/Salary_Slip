package salary_slip;

public class Total_Salary extends  Allowance_Pf{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Total_Salary sc  =	new Total_Salary();
        sc.salarySlip();
	}
	
    public void salarySlip()
    {
    	hra_pf();
		
    	double salary_total = base_pay + bonus - hra - ded_amnt -pf;
    	System.out.println("---------Salary slip---------");

    	System.out.println("Basic pay   : "+(base_pay));
    	System.out.println("Deduct value: "+(ded_amnt));
    	System.out.println("Bonus       : "+(bonus));

		System.out.println("HrA         : "+(hra));
    	System.out.println("PF          : "+pf);

    	System.out.println("Salary      : "+salary_total);
    	
    }
}
