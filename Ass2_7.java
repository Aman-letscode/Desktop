import java.util.Scanner;

class Department {

    protected String departmentName;
    protected int department_no;

    

}

class Employee extends Department {

    protected int emp_id;
    protected String employeeFirstName;
    protected String employeeLastName;
    protected String gender;
    protected byte age;
    protected int experience;

    Employee()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee id:-");
        emp_id=sc.nextInt();
        System.out.print("Enter employee's first name:-");
        employeeFirstName=sc.next();
        System.out.print("Enter employee's last name:-");
        employeeLastName=sc.next();
        System.out.print("Enter gender of the employee:-");
        gender=sc.next();
        System.out.print("Enter he's/her age:-");
        age=sc.nextByte();
        System.out.print("Enter he's/her experience:-");
        experience=sc.nextInt();
        System.out.println("1)Buisness\n2)Marketing\n3)DESIGNING\n4)MAINTAINENCE");
        System.out.println("Chosse your depatment no");
        department_no=sc.nextInt();
        switch(department_no)
        {
            case 1:departmentName="BUISNESS";
            break;
            case 2:departmentName="MARKETING";
            break;
            case 3:departmentName="DESIGNING";
            break;
            case 4:departmentName="MAINTAINENCE";
            break;

            default:departmentName="null";
        }

    

        sc.close();
    }

}

class Allowance extends Employee {

    protected int homeAllowance=0;
    protected int healthAllowance=0;
    protected int travellAllowance=0;
    private int totalAllowance = 0;

    Allowance()
    {
        super();
    }

    public void calculateateAllowance() {
        if (departmentName == "BUISNESS") {
            homeAllowance = 20000;
            healthAllowance = 25000;
            travellAllowance = 50000;
        } else if (departmentName == "MARKETING") {
            homeAllowance = 18000;
            healthAllowance = 25000;
            travellAllowance = 35000;
        } else if (departmentName == "DESIGNING") {
            homeAllowance = 16000;
            healthAllowance = 23000;
            travellAllowance = 30000;
        } else if (departmentName == "MAINTAINENCE") {
            homeAllowance = 15000;
            healthAllowance = 20000;
            travellAllowance = 25000;
        }
        else{
            System.out.println("SOMETHING WRONG!");
            
        }

        totalAllowance = homeAllowance + healthAllowance + travellAllowance;
    }

    public int getAllowance() {

        System.out.println("Total allowance is :-");
        return this.totalAllowance;
    }
}

public class Ass2_7 {
    public static void main(String[] args) {

        Allowance allowance=new Allowance();
        allowance.calculateateAllowance();
        System.out.println(allowance.getAllowance()+"/-");
    }
}
