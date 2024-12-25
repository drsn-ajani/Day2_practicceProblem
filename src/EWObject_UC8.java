public class EWObject_UC8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public final String Company;
    public final int wage_per_hour;
    public final int max_working_hour;
    public final int max_working_days;

    public EWObject_UC8(String Company, int wage_per_hour, int max_working_hour, int max_working_days) {
        this.Company = Company;
        this.wage_per_hour = wage_per_hour;
        this.max_working_hour = max_working_hour;
        this.max_working_days = max_working_days;
    }

    public void compute_wage() {
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
        EWObject_UC8 Trends = new EWObject_UC8("Trends", 10, 140, 22);
        EWObject_UC8 Adidas = new EWObject_UC8("Adidas", 20, 120, 26);

        Trends.compute_wage();
        System.out.println("\n\n");
        Adidas.compute_wage();

    }


}
