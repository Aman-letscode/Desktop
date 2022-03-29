interface College{
    String name="Walchand College Of Engginearing Sangli";
}

class Departmet{
   public int dept_no;
    public String dept_name;
}

class Teacher extends Departmet implements College{
    String name;
    String qualification;

    void setInfo(String name,String qualification,int dept_no,String dept_name)
    {
            this.name=name;
            this.dept_name=dept_name;
            this.dept_no=dept_no;
            this.qualification=qualification;
    }

    void displyData()
    {
        System.out.println("College name:-"+College.name);
        System.out.println("Teacher name"+name);
        System.out.println("Qualification:-"+qualification);
        System.out.println("Department no.:-"+dept_no);
        System.out.println("Department name:-"+dept_name);
    }

}

 class Ass2_12{
    public static void main(String[] args) {
        
        Teacher t=new Teacher();
        t.setInfo("Aman","B.tech",1,"COMPUTER SCIENCE");

        t.displyData();
    }
}
