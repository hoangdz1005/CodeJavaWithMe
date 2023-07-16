package inheritance;

import classGeneric.Person;

public class Employee <K,V,I> extends Person<K,V> {
    private I employeeAttribute;

    public Employee(K identifier, V information, I employeeAttribute) {
        super(identifier, information);
        this.employeeAttribute = employeeAttribute;
    }

    public I getEmployeeAttribute() {
        return employeeAttribute;
    }

    public void setEmployeeAttribute(I employeeAttribute) {
        this.employeeAttribute = employeeAttribute;
    }

    public static void main(String[] args) {
        Employee<String, String, String> employee = new Employee<>("E001", "Nguyễn Ngọc Hoàng", "Samsung SRV");
        String identifier = employee.getIdentifier();
        String information = employee.getInformation();
        String employeeAttribute = employee.getEmployeeAttribute();
        System.out.println( identifier + " - " + information + " - " + employeeAttribute);
    }
}
