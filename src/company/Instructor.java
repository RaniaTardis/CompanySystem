
package company;

public class Instructor extends Emp {
    private String cert;

    public Instructor()
    {
        super();
        cert=null;
    }
    //===================
    public Instructor(String x, double y, TrainingCourse z, String w)
    {
        super(x,y,z);
        cert=w;
    }
    //==========================
    public void setAllData(String x, double y, TrainingCourse z, String w)
      { super.setEmpName(x);
        super.setSalary(y);
        super.setCourse(z);
        cert=w;        
      }
    //=========================
    public String getCert()
    {
        return cert;
    }
    //=====================
    public double tax()
    {
        return super.getSalary() *0.10;
    }
    //=========================
    public double netSalary()
    {
        double n;
        if (super.getSalary()>1000)
            n=super.getSalary()-tax()+50;
         else
          n=super.getSalary()-tax()+100;  
        return n;
    }
    //===========================================
    public String toString()
    {
        return super.toString()+"\n net salary="+netSalary();
    }
}
