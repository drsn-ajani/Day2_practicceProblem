public class EmployyeWageUC4_Switch {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // UC-1
//        int IS_EMPLOYEE_PRESENT = 1;
        final int EmployeeWagePerHour = 20;
        int working_hour;

        final int IS_FULL_TIME_PRESENT = 1;
        final int IS_PART_TIME_PRESENT = 2;

        int empCheck = (int) Math.floor(Math.random() * 100) % 3;
//        double part_full = Math.floor(Math.random() * 100) % 2;

        System.out.println("empCheck is: " + empCheck);

        switch(empCheck) {
            case IS_FULL_TIME_PRESENT:
                System.out.println("Employee is Present for FULL time");
                working_hour = 8;
                break;

            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is Present for PART time");
                working_hour = 4;
                break;

            default:
                System.out.println("Employee is Absent");
                working_hour = 0;
                break;
        }

        System.out.println("Employee Daily Wage is: " + working_hour*EmployeeWagePerHour);




    }
}
