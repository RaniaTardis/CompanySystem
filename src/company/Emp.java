
package company;

public class Emp {
    private String empName;
    private double salary;
    private TrainingCourse course;
    
    public Emp()
    {
        empName=null;
        salary=0;
        course= new TrainingCourse();// or course=null;
    }
   //=========================
    public Emp (String x, double y, TrainingCourse z)
    {  empName=x;
       if (salary<=3000)
       salary=y;
       else 
           salary=3000;
      course=z;
    }
    //==================================
    public void setEmpName(String x)
    {
        empName=x;
    }
    //=========================
    public void setSalary( double y)
    {
       if (salary<=3000)
       salary=y;
       else 
           salary=3000;
    }
    //===============================
    public void setCourse(TrainingCourse z)
    {
        course=z;
    }
    //===========================
    public String getEmpName()
    {
        return empName;
    }
    //======================
    public double getSalary()
    {
        return salary;
    }
    //======================
    public TrainingCourse getCourse()
    { return course;
    }
    //==========================
    public String toString()
    {
        return (" employee name is:"+empName+ "\n The course is:"+course);
    }
}
