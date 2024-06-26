package javaBean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person  {
    private String name;
    private int age;
    private PropertyChangeSupport propertySupport;

    public Person() {
        propertySupport = new PropertyChangeSupport(this);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        propertySupport.firePropertyChange("name", oldName, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        propertySupport.firePropertyChange("age", oldAge, age);
    }

    // Listener methods
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Add a PropertyChangeListener
        person.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property name has changed from: " + evt.getOldValue() + " to: " + evt.getNewValue());
            }
        });

        // Change the name property
        person.setName("John");

        // Change the age property
        person.setAge(25);

    }
}