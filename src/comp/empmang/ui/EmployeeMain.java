package comp.empmang.ui;

import comp.empmang.entities.*;

public class EmployeeMain {

	public static void main(String  []args) {
		EmployeeMain project=new EmployeeMain();
		project.start();
	}
	public void start() {
		Employee []employees=new Employee[4];     //invalid new [4]Employee??
		Department d1=new Department("D123","developer");
		Department d2=new Department("D456","developer");
		Department d3=new Department("T123","tester");
		Department d4=new Department("T456","tester");
		
		Employee e1=new Developer(1,"Ayesha",d1,"JAVA");
		Employee e2=new Developer(2,"Ishaan",d2,"C#");
		
		Employee e3=new Tester(3,"Milan",d3,"TurboC");
		Employee e4=new Tester(4,"Rachit",d4,"GitBash");
		
	   employees[0]=e1;
 	   employees[1]=e2;
 	   employees[2]=e3;
 	   employees[3]=e4;
 	   
 	   for(int i=0; i<4; i++)
 	   {
 		   if(employees[i] instanceof Developer)
 		   {
 			   Developer employee = (Developer) employees[i];
 			   displayDeveloper(employee);
 		   }
 		   else
 		   {
 			   Tester employee = (Tester) employees[i];
 			   displayTester(employee);
 		   }
 	   }
    }
    
    public void displayDeveloper(Developer e){
 	   System.out.println("Language Used by User : "+ e.getLanguage());
 	   
    }
    public void displayTester(Tester e){
 	   System.out.println("Tools Used by User : "+ e.getTools());
 	   
    }
		
		
	}
