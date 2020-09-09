/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Vasanth
 */
public class Cgpa {
    public static void main(String args[]){  
  
ArrayList array=new ArrayList();  
array.add(new students(01,"Vijay kannan", (float) 8.0));  
array.add(new students(02,"Harry christin", (float) 9.3));  
array.add(new students(03,"Sandeep sharma", (float) 9.8));  
array.add(new students(04,"Varun kumar", (float) 9.0));  
array.add(new students(05,"Keshav Ramanujam", (float) 8.9));  
array.add(new students(06,"Aakash chandha", (float) 9.9));  
array.add(new students(07,"Vasanth Ram", (float) 9.9));  
array.add(new students(36,"Anuj kumar", (float) 9.9));  
array.add(new students(16,"Vetri maaran", (float) 9.1));  
array.add(new students(45,"Kadhar khan", (float) 8.7));  
array.add(new students(56,"Michael ferguson", (float) 9.4));  
array.add(new students(01,"Viswa rooban", (float) 9.0));  
array.add(new students(01,"Balaji ", (float) 9.0));  
array.add(new students(01,"Siraj umar", (float) 9.0));  
array.add(new students(01,"Himal", (float) 9.0));  
array.add(new students(01,"Trishvanth", (float) 9.0));  
array.add(new students(01,"Nivetha", (float) 9.0));  
array.add(new students(01,"Harshni", (float) 9.0));  
array.add(new students(01,"Krishnakanth", (float) 9.0));  
array.add(new students(01,"Vandu murugan", (float) 9.0));  






  

  
System.out.println(" Array sorted by CGPA : ");  
  
Collections.sort(array,new Comparison());  

Iterator itr2=array.iterator();  
while(itr2.hasNext()){  
students st=(students)itr2.next();  
System.out.println(st.Rollno+" "+st.Name+" "+st.Cgpa);  
}  
}
}
class students{  
int Rollno;  
String Name;  
float Cgpa;  
students(int rollno,String name,float cgpa){  
this.Rollno=rollno;  
this.Name=name;  
this.Cgpa=cgpa;  
}  
} 
class Comparison implements Comparator{  
@Override
public int compare(Object x,Object y){  
students a=(students)x;  
students b=(students)y;  
  
if(a.Cgpa==b.Cgpa)  
return 0;  
else if(a.Cgpa>b.Cgpa)  
return 1;  
else  
return -1;  
}  
}  
