package org.tsu;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jon Doe", Employee.Profession.PROGRAMMER, 900.00, Employee.Gender.MALE);
        Employee.Statistic statistic = employee.new Statistic(employee);

        System.out.println(employee);

        StringBuilder sb = new StringBuilder();

        String hasMoreThanAverage = String
                .format("%s has %s than the average salary.\n",
                        employee.getName(),
                        (statistic.hasMoreThanTheAverage() ? "more" : "less"));

        String yearlySalary = String
                .format("%s yearly salary is %.2f",
                        employee.getGender() == Employee.Gender.MALE ? "His" : "Her",
                        statistic.getYearlySalary());

        sb.append(hasMoreThanAverage);
        sb.append(yearlySalary);

        System.out.println(sb);
    }
}
