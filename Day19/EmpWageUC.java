public class EmpWageUC
{
      public static void main(String[] args)
    {

                int is_FULL_TIME=1;
                int Emp_Rate_Per_hr=20;

                int emp_hr=0;
                int emp_wage=0;

                double empCheck = Math.floor(Math.random() * 10) %2;

                if(empCheck == is_FULL_TIME)
                {
                        System.out.println("Employee is Present");
                        emp_hr=8;

                }
                else
                {
                        System.out.println("Employee is Absent");
                }
                emp_wage = Emp_Rate_Per_hr * emp_hr;
                System.out.println("emp_Wage:" + emp_wage);

        }

}
