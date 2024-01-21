package org.example.collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Employee {

    private String name;
    private int employeeId;
    private List<String> Addresses;
    private Set<String> mobileNumbers;
    private Map<String,Double> courses;

    public Employee() {
        super();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setAddresses(List<String> addresses) {
        Addresses = addresses;
    }

    public void setMobileNumbers(Set<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public void setCourses(Map<String, Double> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public List<String> getAddresses() {
        return Addresses;
    }

    public Set<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public Map<String, Double> getCourses() {
        return courses;
    }
}
