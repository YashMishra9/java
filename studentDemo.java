class Student{
    private String name;
    private int m1,m2,m3;
    
    Student(){
        name="Unknown";
        setMarks(0,0,0);
    }
    
    Student(String name,int m1,int m2,int m3){
        this.name="Yash";
        setMarks(m1,m2,m3);
    }
    
    void setMarks(int m1,int m2,int m3){
        if(m1>=0 && m1<=100 && m2>=0 && m2<=100 && m3>=0 && m3<=100){
            this.m1=m1;
            this.m2=m2;
            this.m3=m3;
        }
        else{
            System.out.println("Invalid marks");
        }
    }
    
    
    double percentage(){
        return (m1+m2+m3)/3.0;
    }
    
    String grade(){
        double p=percentage();
        if(p>=90){
            return "A";
        }
        else if(p>=70){
            return "B";
        }
        else if(p>=60){
            return "C";
        }
        else if(p>=50){
            return "D";
        }
        else if(p>=35){
            return "E";
        }
        else{
            return "F";
        }
    }
    
    
    void display(){
        System.out.println("Name "+ name);;
        System.out.println("percentage "+ percentage());
        System.out.println("grade "+ grade());
    }
}
public class studentDemo {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Student s1=new Student();
		Student s2=new Student("Yash",86,95,76);
		
		System.out.println("Student 1 ");
		s1.display();
		
		System.out.println("Student 2");
		s2.display();

	}
}
