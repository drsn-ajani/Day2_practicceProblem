public class EWObject_UC8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;


    public static void compute_wage_function(String Company, int wage_per_hour, int max_working_hour, int max_working_days) {
        int worked_days = 0, worked_hour = 0;

        while (worked_days < max_working_days && worked_hour < max_working_hour) {
            int empCheck = (int) Math.floor(Math.random() * 3) + 1;
            worked_days++;

            switch (empCheck) {
                case IS_PART_TIME   ->  worked_hour += 4;
                case IS_FULL_TIME   ->  worked_hour += 8;
                default ->  worked_hour += 0;
            }
            System.out.println("Day#: " + worked_days + "; Hour: " + worked_hour);
        }

        System.out.println("Total Wage Obtained by Employee of " + Company + " is: " + worked_hour * wage_per_hour);
    }

    public static void main(String[] args) {
        compute_wage_function("Trends", 10, 140, 22);
        compute_wage_function("Adidas", 20, 120, 26);

    }


}
