package salary_slip;

public class Allowance_Pf extends EmployeeSalary  {
	double hra;
	double pf;
	public void hra_pf()
	{
		inputSalaryDetails();
		
		hra = 0.05*(base_pay);
		pf =0.2*(base_pay);
	}

}
