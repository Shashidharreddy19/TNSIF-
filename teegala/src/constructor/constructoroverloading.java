package constructor;

public class constructoroverloading {

	public static void main(String[] args) {
		class Student {
		    private int id;
		    private String name;
		    private double marks;

		    // Constructor 1: No parameters
		    public Student() {
		        id = 0;
		        name = "Unknown";
		        marks = 0.0;
		    }

		    // Constructor 2: Two parameters
		    public Student(int id, String name) {
		        this.id = id;
		        this.name = name;
		        marks = 0.0;
		    }

		    // Constructor 3: Three parameters
		    public Student(int id, String name, double marks) {
		        this.id = id;
		        this.name = name;
		        this.marks = marks;
		    }

		    // Method to display student details
		    public void display() {
		        System.out.println("Student ID: " + id);
		        System.out.println("Student Name: " + name);
		        System.out.println("Marks: " + marks);
		        System.out.println("----------------------");
		    }
		}

		        // Using Constructor 1
		        Student s1 = new Student();
		        s1.display();

		        // Using Constructor 2
		        Student s2 = new Student(101, "shashi");
		        s2.display();

		        // Using Constructor 3
		        Student s3 = new Student(102, "rohith", 85.5);
		        s3.display();
		    }
		}
