public class EmployeeAttandance {
    public static void main(String[] args) {
        int IS_EMPLOYEE_PRESENT = 1;

        double empCheck = Math.floor(Math.random() * 100) % 2;

        if (empCheck == IS_EMPLOYEE_PRESENT) {
            System.out.println("EMPLOYEE IS PRESENT\n");
        } else {
            System.out.println("EMPLOYEE IS NOT PRESENT\n");
        }
    }
}
