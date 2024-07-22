package javaBean;
import java.beans.*;
import java.io.Serializable;

class Persons implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // No-argument constructor
    public Persons() {
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

class PersonBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor name = new PropertyDescriptor("name", Persons.class);
            PropertyDescriptor age = new PropertyDescriptor("age", Persons.class);

            // Customize the name property descriptor
            name.setDisplayName("Person Name");
            name.setShortDescription("The name of the person");

            // Customize the age property descriptor
            age.setDisplayName("Person Age");
            age.setShortDescription("The age of the person");

            return new PropertyDescriptor[] { name, age };
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public BeanDescriptor getBeanDescriptor() {
        BeanDescriptor descriptor = new BeanDescriptor(Persons.class);
        descriptor.setDisplayName("Person Bean");
        descriptor.setShortDescription("A simple person JavaBean");
        return descriptor;
    }
}

public class BeanInfoExample {
    public static void main(String[] args) {
        try {
            // Get the BeanInfo for the Person class
            BeanInfo beanInfo = Introspector.getBeanInfo(Persons.class);

            // Print the bean descriptor
            System.out.println("Bean: " + beanInfo.getBeanDescriptor().getDisplayName());
            System.out.println("Description: " + beanInfo.getBeanDescriptor().getShortDescription());

            // Print the property descriptors
            for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property: " + pd.getDisplayName());
                System.out.println("Description: " + pd.getShortDescription());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
