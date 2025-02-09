public class EW_UC7 {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int wage_per_hour = 20;
    static final int max_working_hour = 100, max_working_days = 20;

    public static void compute_wage() {
        int worked_hour = 0, worked_days = 0;
        while (worked_hour <= max_working_hour && worked_days <= max_working_days) {
            int empcheck = (int) Math.floor(Math.random() * 100) % 3;

            worked_days++;

            switch (empcheck) {
                case IS_PART_TIME:
                    worked_hour += 4;
                    break;
                case IS_FULL_TIME:
                    worked_hour += 8;
                    break;
                default:
                    worked_hour += 0;
                    break;
            }
            System.out.println("Day#: " + worked_days + "; Hour: " + worked_hour);
        }

        System.out.println("Total Wage: " + wage_per_hour * worked_hour);
    }

    public static void main(String[] args) {
        compute_wage();
    }
}
