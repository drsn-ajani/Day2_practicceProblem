public class EmployyeeWageUC2 {
    public static void main(String[] args) {
        int IS_PRESENT_EMPLOYEE = 1;

        int EmployeeWagePerHour = 20;
        int full_day_hour = 8;

        double emp_check = Math.floor(Math.random() * 100) % 2;

        if (emp_check == IS_PRESENT_EMPLOYEE) {
            double wage = EmployeeWagePerHour * full_day_hour;

            System.out.println("Employee Wage: " + wage);
        } else {
            System.out.println("Employee is not present\n");
            System.out.println("Employee Wage: 0");
        }

    }
}
