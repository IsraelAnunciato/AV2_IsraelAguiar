public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void hires(Employee employee) {
        this.employees.add(employee);
    }
}

public class Employee {
    private String name;
    private Vehicle vehicle;

    public Employee(String name) {
        this.name = name;
    }

    public void drives(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

public abstract class Vehicle {
    private String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

public class Truck extends Vehicle {
    public Truck(String registrationNumber) {
        super(registrationNumber);
    }
}

public class Car extends Vehicle {
    private String transmission;

    public Car(String registrationNumber, String transmission) {
        super(registrationNumber);
        this.transmission = transmission;
    }
}