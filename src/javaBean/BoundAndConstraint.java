package javaBean;
import java.beans.*;
import java.io.Serializable;
public class BoundAndConstraint {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeListener listener = new EmployeeListener();

        // Add listeners to the employee
        employee.addPropertyChangeListener(listener);
        employee.addVetoableChangeListener(listener);

        // Set the name property
        employee.setName("Alice");

        // Set the age property
        try {
            employee.setAge(25);
            employee.setAge(-5); // This will throw a PropertyVetoException
        } catch (PropertyVetoException e) {
            System.out.println("Failed to set age: " + e.getMessage());
        }

        // Print the current state of the employee
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
    }
}


class EmployeeListener implements PropertyChangeListener, VetoableChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Property " + evt.getPropertyName() + " changed from " +
                evt.getOldValue() + " to " + evt.getNewValue());
    }

    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        if ("age".equals(evt.getPropertyName())) {
            int newAge = (int) evt.getNewValue();
            if (newAge < 0 || newAge > 100) {
                throw new PropertyVetoException("Invalid age: " + newAge, evt);
            }
        }
    }
}
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // Support for property change listeners
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    // Support for vetoable change listeners
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    // No-argument constructor
    public Employee() {
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with PropertyChangeSupport
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        pcs.firePropertyChange("name", oldName, name);
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with VetoableChangeSupport
    public void setAge(int age) throws PropertyVetoException {
        int oldAge = this.age;
        vcs.fireVetoableChange("age", oldAge, age);
        this.age = age;
    }

    // Add a PropertyChangeListener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    // Remove a PropertyChangeListener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    // Add a VetoableChangeListener
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    // Remove a VetoableChangeListener
    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }
}
