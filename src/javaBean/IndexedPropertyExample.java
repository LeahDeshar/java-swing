package javaBean;

import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties
    private String name;
    private int[] grades;

    // No-argument constructor
    public Student() {
        grades = new int[5]; // Example: fixed size array for grades
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grades array
    public int[] getGrades() {
        return grades;
    }

    // Setter for grades array
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Getter for individual grade (indexed property)
    public int getGrade(int index) {
        return grades[index];
    }

    // Setter for individual grade (indexed property)
    public void setGrade(int index, int grade) {
        this.grades[index] = grade;
    }
}


public class IndexedPropertyExample {
    public static void main(String[] args) {
        // Create an instance of the Student JavaBean
        Student student = new Student();

        // Set the name property
        student.setName("Jane Doe");

        // Set grades using the indexed setter method
        student.setGrade(0, 85);
        student.setGrade(1, 90);
        student.setGrade(2, 78);
        student.setGrade(3, 88);
        student.setGrade(4, 92);

        // Get and print the name property
        String name = student.getName();
        System.out.println("Name: " + name);

        // Get and print the grades using the indexed getter method
        for (int i = 0; i < student.getGrades().length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + student.getGrade(i));
        }

        // Set the entire grades array using the array setter method
        int[] newGrades = {95, 80, 87, 89, 90};
        student.setGrades(newGrades);

        // Get and print the updated grades using the array getter method
        int[] grades = student.getGrades();
        System.out.println("Updated Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }
    }
}
