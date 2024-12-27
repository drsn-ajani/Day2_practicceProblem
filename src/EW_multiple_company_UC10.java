class CompanyEmpWage_UC10 {
    public final String Company;
    public final int emp_rate_per_hour;
    public final int max_working_hour;
    public final int max_working_days;
    public int total_emp_wage;

    public CompanyEmpWage_UC10(String Company, int emp_rate_per_hour, int max_working_hour, int max_working_days) {
        this.Company = Company;
        this.emp_rate_per_hour = emp_rate_per_hour;
        this.max_working_hour = max_working_hour;
        this.max_working_days = max_working_days;
    }

    public void set_total_emp_wage(int total_emp_wage) {
        this.total_emp_wage = total_emp_wage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for " + Company + " is: " + total_emp_wage;
    }
}


public class EW_multiple_company_UC10 {
    private final int IS_PART_TIME = 1;
    private final int IS_FULL_TIME = 2;

    private int number_of_company = 0;
    public CompanyEmpWage_UC10[] CompanyEmpWageArray;

    public EW_multiple_company_UC10() {
        CompanyEmpWageArray = new CompanyEmpWage_UC10[5];
    }

    private void addCompany(String Company, int emp_rate_per_hour, int max_working_hour, int max_working_days) {
        CompanyEmpWageArray[number_of_company] = new CompanyEmpWage_UC10(Company, emp_rate_per_hour, max_working_hour, max_working_days);
        number_of_company++;
    }

    private void compute_wage() {
        for (int i = 0; i < number_of_company; i++) {
            CompanyEmpWageArray[i].set_total_emp_wage(compute_wage(CompanyEmpWageArray[i]));
            System.out.println("\n");
            System.out.println(CompanyEmpWageArray[i]);
            System.out.println("\n");
        }
    }

    private int compute_wage(CompanyEmpWage_UC10 companyEmpWage) {
        int worked_days = 0, worked_hour = 0;

        while (worked_days < companyEmpWage.max_working_days && worked_hour < companyEmpWage.max_working_hour) {
            worked_days++;

            int choice = (int) Math.floor(Math.random() * 3) + 1;

            switch (choice) {
                case IS_PART_TIME:
                    worked_hour += 4;
                    break;
                case IS_FULL_TIME:
                    worked_hour += 8;
                    break;
                default:
                    break;
            }

            System.out.println("Day#: " + worked_days + " Employee worked Hour: " + worked_hour);
        }
        return worked_hour * companyEmpWage.emp_rate_per_hour;
    }

    public static void main(String[] args) {
        EW_multiple_company_UC10 empWageArray = new EW_multiple_company_UC10();
        empWageArray.addCompany("Trends", 10, 140, 22);
        empWageArray.compute_wage();
        empWageArray.addCompany("Adidas", 20, 20, 26);
        empWageArray.compute_wage();

    }
}
