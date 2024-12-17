public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // UC-1
        int IS_EMPLOYEE_PRESENT = 1;
        int EmployeeWagePerHour = 20;
        int full_day_hour = 8;

        double empCheck = Math.floor(Math.random() * 100) % 2;

        if (empCheck == IS_EMPLOYEE_PRESENT) {
            System.out.println("EMPLOYEE IS PRESENT\n");

            // UC-2
            double wage = EmployeeWagePerHour * full_day_hour;
            System.out.println("Employee Wage: " + wage);
        } else {
            System.out.println("EMPLOYEE IS NOT PRESENT\n");

            // UC-2
            System.out.println("Employee Wage: 0");
        }



    }
}
