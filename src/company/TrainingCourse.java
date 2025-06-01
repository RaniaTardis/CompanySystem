
package company;

public class TrainingCourse {
   private int ID;
   private String name;
   
   public TrainingCourse()
   {
       ID=0;
       name=null;
   }
   //==============================
 public TrainingCourse(int x, String y)
   {    if (x>=100 && x<=200)
         ID=x;
     else
          ID=100;
       name=y;
   }
   //==============================  
  public void setNameCourse(String y)
  {
      name=y;
  }
 //==========================
  public void setID( int x)
  {if (x>=100 && x<=200)
         ID=x;
     else
          ID=100;  
  }
 //=============================
   public String getNameCourse()
   {
       return name;
   }
   //=======================
   public int getID()
   {
       return ID;
   }
 public String toString()  
 {
     return (" Course name:"+ name + " course ID:"+ID);
}
}