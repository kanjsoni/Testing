/* 
Wap to take emp name, emp code, and basic salary of employee and compute the net salary of employee depends on the following condition.
1. DA 35% of the basic salary
2. CA 6% of basic salary
3. PF 8% of basic salary
4. HRA 15% of basic salary
5. ESI 2.5% of basic salary
6. LIC 3.5% of basic salary

*/ 

import java.util.Scanner;
public class EmpSalary {
    public static void main(String[] args) {
        
        ESalary x1= new ESalary();
        x1.empdata1();
        x1.compute();
        x1.display();
    }
    
}

class EmpData {
        Scanner in = new Scanner(System.in);
        String name;
        String emp_cod ;
        double basic_salary, da,ca, hra, gross_salary, pa, pf,esi, lic, net_salary;
        void empdata1(){
        System.out.println("Enter Employee name");
        name= in.nextLine();
        System.out.println("Enter Employee Code");
        emp_cod= in.nextLine();
        System.out.println("Enter your basic salary");
        basic_salary= in.nextDouble();
    }  
}
class ESalary extends EmpData{
    void compute(){
        da= (basic_salary*35)/100;
        ca= (basic_salary*5)/100;
        hra= (basic_salary*12)/100;
        pa= (basic_salary*18.5)/100;
        esi= (basic_salary*2.5)/100;
        lic= (basic_salary*3.5)/100;
        pf= (basic_salary*8)/100;
        gross_salary = (basic_salary+da+ca+hra+pa);
        net_salary =(gross_salary- lic- esi- pf);
    }
    void display(){
        System.out.println("Employee name:\t"+name);
        System.out.println("Employee code:\t"+emp_cod);
        System.out.println("Basic Salary: \t"+ basic_salary);
        System.out.println("Gross salary \t"+gross_salary);
        System.out.println("Net salary \t"+net_salary);
    }
    }


