package oops;

// create a Employee Class and Department Class with the following 
// instance variables.

// Employee-
// Eno-int
// Ename-string
// Esal-int
// Dno-int
// Comm-int
// YOE-int


// Department
// Dno-int
// Dname-string
// Dloc-string

// create necessary constructor and setters/getters

// Write a Main Class to read a set of n Employee records 
// and Department records

// You are now supposed to do the following 

// 1) Display the Number of Employees for a particular department
// 2) Display the Sum of Salaries of given Department No. 
// 3) Display the Department name who is drawing highest salary.

// Read the Department Records size followed by Department Records 
// followed by Employee Records size and Employee Records.



// input = 4
// 10 IT Hyd
// 20 FN Pune
// 30 AD BLR
// 40 HR Sec
// 5
// 101 abc 5000 10 400 2
// 102 tyz 6000 20 500 17
// 103 hyz 8000 30 600 22
// 104 ryz 16000 40 700 3
// 105 kyz 9000 10 800 12
// 10
// 20
// output = 2
// 6000
// HR

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Department d[] = new Department[n];
        for(int i=0;i<n;i++){
            d[i] = new Department(Integer.parseInt(sc.next()),sc.next(),sc.next());
        }
        n = sc.nextInt();
        Employee e[] = new Employee[n];
        for(int i=0;i<n;i++){
            e[i] = new Employee(Integer.parseInt(sc.next()),sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
        }
        int a = sc.nextInt();
		int b = sc.nextInt();
        sc.close();
		int count1 = 0;
		int sum = 0;
		int max = 0;
		int deptno = 0;
		for(Employee emp : e){
		    if(emp.dno==a){
		        count1++;
		    }
		    if(emp.dno==b){
		        sum += emp.esal;
		    }
		    if(max<emp.esal){
		        max = Math.max(max,emp.esal);
		        deptno = emp.dno;
		    }
		}
		System.out.println(count1);
		System.out.println(sum);
		for(Department dep : d){
		    if(dep.dno==deptno){
		        System.out.println(dep.dname);
		        return;
		    }
		}
    }
}
class Employee{
    int eno;
    String ename;
    int esal;
    int dno;
    int comm;
    int yoe;
    Employee(int eno,String ename,int esal,int dno, int comm, int yoe){
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.dno = dno;
        this.comm = comm;
        this.yoe = yoe;
    }
}
class Department{
    int dno;
    String dname;
    String dloc;
    Department(int dno, String dname, String dloc){
        this.dno = dno;
        this.dname = dname;
        this.dloc = dloc;
    }
}