import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CompanyEmpWage_UC {
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmpWage_UC(String company, int empRatePerHour,
                             int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }
}

public class EmpWageBuilder_UC implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private LinkedList<CompanyEmpWage_UC> companyEmpWageUCList;
    private Map<String, CompanyEmpWage_UC> companyToEmpWageMap;

    public EmpWageBuilder_UC() {
        companyEmpWageUCList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage_UC companyEmpWageUC = new CompanyEmpWage_UC(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageUCList.add(companyEmpWageUC);
        companyToEmpWageMap.put(company, companyEmpWageUC);
    }

    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage_UC companyEmpWageUC : companyEmpWageUCList) {
            companyEmpWageUC.setTotalEmpWage(this.computeEmpWageForCompany(companyEmpWageUC));
            System.out.println(companyEmpWageUC);
        }
    }

    private int computeEmpWageForCompany(CompanyEmpWage_UC companyEmpWageUC) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWageUC.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWageUC.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }

        return totalEmpHrs * companyEmpWageUC.empRatePerHour;
    }

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageBuilder_UC empWageBuilderUC = new EmpWageBuilder_UC();
        empWageBuilderUC.addCompanyEmpWage("Trends", 10, 140, 22);
        empWageBuilderUC.addCompanyEmpWage("Adidas", 20, 20, 26);
        empWageBuilderUC.computeEmpWage();
        System.out.println("Total Wage for Trends: " + empWageBuilderUC.getTotalWage("Trends"));
    }
}
