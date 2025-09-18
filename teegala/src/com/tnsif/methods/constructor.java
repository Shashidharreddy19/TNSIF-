package com.tnsif.methods;

public class constructor {

	public static void main(String[] args) {
		class Student {
		    private int id;
		    private String name;
		    private double marks;
		    public Student() {
		        id = 0;
		        name = "Unknown";
		        marks = 0.0;
		    }
		    public Student(int id, String name) {
		        this.id = id;
		        this.name = name;
		        marks = 0.0;
		    }
		    public Student(int id, String name, double marks) {
		        this.id = id;
		        this.name = name;
		        this.marks = marks;
		    }
		    public void display() {
		        System.out.println("Student ID: " + id);
		        System.out.println("Student Name: " + name);
		        System.out.println("Marks: " + marks);
		        System.out.println("----------------------");
		    }
		}
		        Student s1 = new Student();
		        s1.display();
		        Student s2 = new Student(101, "shashi");
		        s2.display();
		        Student s3 = new Student(102, "rohith", 85.5);
		        s3.display();

	}

}
