package employee;

import java.util.Scanner;

public class Main{
    
    static Scanner s = new Scanner(System.in);

    static int ch;

    static int id ;
    static String name;
    static int age ;
    static String department ;
    static String code ;
    static double salaryRate ;

    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();
        
        manager.addEmployee(new Employee(1, "Minh", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(2, "Quang", 32, "BA", "BA001", 1.3));
        manager.addEmployee(new Employee(3, "Minh", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(4, "Quang", 32, "BA", "BA001", 1.3));
        manager.addEmployee(new Employee(5, "Minh", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(6, "Quang", 32, "BA", "BA001", 1.3));
        manager.addEmployee(new Employee(7, "Minh", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(8, "Quang", 32, "BA", "BA001", 1.3));
        manager.addEmployee(new Employee(9, "Minh", 20, "IT", "IT001", 1.5));
        manager.addEmployee(new Employee(10, "Quang", 32, "BA", "BA001", 1.3));

  
        do{
            System.out.println("1.Insert Employee");
            System.out.println("2.Show list of Employees ");
            System.out.println("3.Delete Employee");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1 : 
                    EnterDetailEmployeeToAdd();

                    manager.addEmployee(new Employee(id, name, age, department, code, salaryRate));
                break;

                case 2: 
                    System.out.println("            --------List Employees--------");
                    manager.displayAllEmployees();
                    System.out.println("                    ************        ");
                break;

                case 3: 
                    System.out.print("ID Employee to Delete: ");
                    int id_to_del = s.nextInt();

                    boolean result = manager.removeEmployee(id_to_del);
                    
                    if(result == true){
                        manager.displayAllEmployees();
                        System.out.println("Deleted Success");
                        
                    }
                    else{
                        manager.displayAllEmployees();
                        System.out.println("No have ID " + id_to_del + " to delete");
                    }
                    
                break;
            
                default:
                    break;
            }
        }while(ch != 0);
        s.close();

    }

    private static void EnterDetailEmployeeToAdd(){
        System.out.print("ID : ");
        id = s.nextInt();

        s.nextLine();

        System.out.print("Name : ");
        name = s.nextLine();

        System.out.print("Age : ");
        age = s.nextInt();

        s.nextLine();

        System.out.print("Department : ");
        department = s.nextLine();

        System.out.print("Code : ");
        code = s.nextLine();

        System.out.print("salaryRate : ");
        salaryRate = s.nextDouble();
    }

}

    

