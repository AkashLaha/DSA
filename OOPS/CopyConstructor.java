package com.akash.OOPS;

//class A{
//    int a;
//    String b;
//    A(){
//        a=10;
//        b="hello";
//        System.out.println(a+" "+b);
//    }
//    A(A ref){
//        a=ref.a;
//        b=ref.b;
//        System.out.println(a+" "+b);
//    }
//}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

//    //Shallow Copy Constructor
//    Student(Student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll= s1.roll;
//        this.marks=s1.marks;
//    }
    //Deep Copy Constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll= s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Student(){
        marks=new int[3];
        System.out.println("constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
//        A r=new A();
//        A r2=new A(r);
        Student s1=new Student();
        s1.name="Akash";
        s1.roll=123;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=70;


        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=60;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
