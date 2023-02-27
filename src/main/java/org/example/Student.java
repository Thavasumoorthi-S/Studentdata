package org.example;
//package datastructure;
public class Student {
        private  String name;
        private  int age;
        private  double gpa;
        Student()
        {
            this.name="";
            this.age=0;
            this.gpa=0.0;
        }
        public void setname(String name)
        {
            this.name=name;
        }
        public void setage(int age)
        {
            this.age=age;
        }
        public void setgpa(Double gpa)
        {
            this.gpa=gpa;
        }
        public String getname()
        {
            return this.name;
        }
        public int getage()
        {
            return this.age;
        }
        public double getgpa()
        {
            return this.gpa;
        }
    }