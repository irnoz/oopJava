package org.tsu;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jon Doe", Employee.Profession.PROGRAMMER, 900.00, Employee.Gender.MALE);

        Employee.Statistic statistic = employee.new Statistic(employee);

        System.out.println("has above average: " + statistic.hasMoreThanTheAverage());
        System.out.println("yearly salary: " + statistic.getYearlySalary());
    }
}
