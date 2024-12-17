public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // UC-1
        int IS_EMPLOYEE_PRESENT = 1;
        int EmployeeWagePerHour = 20;
        int full_day_hour = 8;

        int IS_FULL_TIME_PRESENT = 1;
        int IS_PART_TIME_PRESENT = 2;

        double empCheck = Math.floor(Math.random() * 100) % 2;
        double part_full = Math.floor(Math.random() * 100) % 2;

        if (empCheck == IS_EMPLOYEE_PRESENT) {
            double working_hour = 0;

            // UC-2
            // UC-3

            if (part_full == IS_PART_TIME_PRESENT) {
                System.out.println("EMPLOYEE IS PRESENT FOR PART TIME\n");
                working_hour = 4;
            } else {
                System.out.println("EMPLOYEE IS PRESENT FOR FULL TIME\n");
                working_hour = 8;
            }

            double wage = EmployeeWagePerHour * working_hour;
            System.out.println("Employee Wage: " + wage);
        } else {
            System.out.println("EMPLOYEE IS NOT PRESENT\n");

            // UC-2
            System.out.println("Employee Wage: 0");
        }



    }
}
