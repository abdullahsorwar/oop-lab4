package edu.lab.model;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id; this.name = name;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }

    @Override
    public int compareTo(Employee other){
        // TODO: compare by name case-insensitively
        return this.name.compareToIgnoreCase(other.name);
        // throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String toString(){
        // TODO: "Employee{id=ID, name='NAME'}"
        return "Employee{id=" + id + ", name='" + name + "'}";
        // throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean equals(Object o){
        // TODO: consistent with compareTo on name (case-insensitive)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equalsIgnoreCase(employee.name);
        // throw new UnsupportedOperationException("TODO");
    }
    @Override
    public int hashCode(){
        // TODO: consistent with equals
        return Objects.hash(name.toLowerCase());
        // throw new UnsupportedOperationException("TODO");
    }
}
