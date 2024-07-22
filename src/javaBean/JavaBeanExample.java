package javaBean;

import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties
    private String name;
    private int age;

    // No-argument constructor
    public Person() {
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
public class JavaBeanExample {
    public static void main(String[] args) {
        // Create an instance of the Person JavaBean
        Person person = new Person();

        // Set properties using setter methods
        person.setName("John Doe");
        person.setAge(30);

        // Get properties using getter methods
        String name = person.getName();
        int age = person.getAge();

        // Print the properties
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
