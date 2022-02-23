package com.test;
import java.util.Scanner;
class SmartCard{
    int emp_idn;
    public  void MarkAttendencs(Employee e)
    {
        emp_idn = e.getEmpId();
        System.out.println("Employee "+emp_idn+ " is marked Present");
    }
    public  int getEmpIdn(Employee e)
    {
        return  e.empid;
    }
}
class Employee{
    int empid;
    Employee()
    {
        System.out.print("Enter the employee id: ");
        Scanner sc  = new Scanner(System.in);
        this.empid = sc.nextInt();

    }
    int getEmpId()
    {
        return  empid;
    }
    public  void  login(SmartCard sc)
    {
        int eid = sc.getEmpIdn(this);
        System.out.println("Login Successful for Employee"+eid);
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println("*** ASSOCIATION BETWEEN EMPLOYEE AND SMART CARD ***");
        Employee e = new Employee();
        System.out.println("NEW EMPLOYEE IS CREATED");
        SmartCard scd = new SmartCard();
        scd.MarkAttendencs(e);
        e.login(scd);
    }
}
