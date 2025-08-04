package projctt;
import java.util.Scanner;

abstract class Student1 
{
	protected String name;
	protected int rollno;
	protected int[] marks;
	protected double average;
    protected char grade;
    
    public Student1()
    {
    	
    }

	public Student1(String name, int rollno, int[] marks)
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		
	}
	 public void calculate()
	 {
		 int sum = 0;
	        for (int m : marks)
	        {
	        	sum += m;
	        }
	        	average = (float)sum/marks.length;
	        	if (average >= 80f)
	    	{
	                grade = 'A';
	            } else if (average >= 70f) {
	                grade = 'B';
	            } else if (average >= 60f) {
	                grade = 'C';
	            } else if (average >= 50f) {
	                grade = 'D';
	            } else {
	                grade = 'F';
	            }
	   }
	    public String getName()       { return name; }
	    public int    getRollNo()     { return rollno;}
	    public int[]  getMarks()      { return marks; }
	    public double getAverage()    { return average;}
	    public char   getGrade()      { return grade; }
	      
	    public abstract void display();
}

 class Student2 extends Student1
{
        
    	public Student2(String name, int rollno, int[] marks)
    	{
    		this.name = name;
    		this.rollno = rollno;
    		this.marks = marks;
    		calculate();
    }


    @Override
    public void display() {
       
        System.out.println("===== STUDENT REPORT =====");
        System.out.println("Name:    " + getName());
        System.out.println("Roll No: " + getRollNo());

       
        System.out.print("Marks:   ");
        for (int m : getMarks())
        {
            System.out.print(m + " ");
        }
        System.out.println();

        
        System.out.println("Average: " + getAverage());

        System.out.println("Grade:   " + getGrade());
    }
}
 


 public class StuRepo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        
         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Roll No: ");
         int roll = sc.nextInt();

         
         System.out.print("How many subjects? ");
         int count = sc.nextInt();

        
         int[] marks = new int[count];
         for (int i = 0; i < count; i++)
         {
             System.out.printf("Mark for subj %d: ", i+1);
             marks[i] = sc.nextInt();
         }

         sc.close();

         
         Student1 student = new Student2(name, roll, marks);
         System.out.println();
         student.display();
     }
 }