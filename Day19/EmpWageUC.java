public class EmpWageUC
{
	public static void main(String[] args)
	{
		int is_FULL_TIME=1;
		double empCheck = Math.floor(Math.random() * 10) %2;

		if(empCheck == is_FULL_TIME)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
