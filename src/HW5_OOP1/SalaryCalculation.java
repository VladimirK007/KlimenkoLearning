package HW5_OOP1;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1 = new SalesAgentSalary(160, 2);
        SalesAgentSalary agent2 = new SalesAgentSalary(167, 2,
                3, 25, 16000);
        agent1.getSalary();
        System.out.println("======================================== ");
        agent1.baseSalaryCalc();
        agent1.baseHoursRatioCalc();
        agent1.numberOfSalesBonus();
        agent1.amountOfSalesBonus();
        agent1.totalSalary();

        agent2.getSalary();
        System.out.println("======================================== ");
        agent2.baseSalaryCalc();
        agent2.baseHoursRatioCalc();
        agent2.numberOfSalesBonus();
        agent2.amountOfSalesBonus();
        agent2.totalSalary();
    }
}

class SalesAgentSalary {

    private int workingHours;
    private double rate;
    private int yearsOfExperience;
    private double baseHourRatio;
    private int numberOfSales;
    private double numberOfSalesBonus;
    private int amountOfSales;
    private double amountOfSalesBonus;
    private double totalSalary;
    private double salary;

    public SalesAgentSalary(int workingHours, double rate) {

        this.workingHours = workingHours;
        this.rate = rate;

    }

    public SalesAgentSalary(int workingHours,
                            double rate,
                            int yearsOfExperience,
                            int numberOfSales,
                            int amountOfSales) {
        this.workingHours = workingHours;
        this.rate = rate;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfSales = numberOfSales;
        this.amountOfSales = amountOfSales;
    }


    double baseSalaryCalc() {


        if (workingHours > 160) {
            salary = 160 * rate + ((workingHours - 160) * 1.5 * rate);

        } else {
            salary = workingHours * rate;
        }
        System.out.println("The agent`s base salary: " + salary + " USD");
        return salary;

    }

    double baseHoursRatioCalc() {
        if (yearsOfExperience <= 2) {
            baseHourRatio = 1;
        }
        if ((yearsOfExperience > 2) && (yearsOfExperience <= 4)) {
            baseHourRatio = 1.2;
        }
        if ((yearsOfExperience > 4) && (yearsOfExperience <= 6)) {
            baseHourRatio = 1.3;
        }
        if (yearsOfExperience > 6) {
            baseHourRatio = 1.4;
        }
        System.out.println("The agent`s ratio: " + baseHourRatio);
        return baseHourRatio;
    }

    double numberOfSalesBonus() {
        if (numberOfSales > 20) {
            numberOfSalesBonus = 250;
            System.out.println("Bonus depending on the Number of sales: " + numberOfSalesBonus);
        }
        if (numberOfSales < 10) {
            numberOfSalesBonus = -150;
            System.out.println("Fine depending on the Number of sales: " + numberOfSalesBonus);
        }
        if ((numberOfSales >= 10) && (numberOfSales <= 20)) {
            numberOfSalesBonus = 0;
            System.out.println("Bonus depending on the Number of sales: " + numberOfSalesBonus);
        }
        return numberOfSalesBonus;
    }

    double amountOfSalesBonus() {
        if (amountOfSales > 15000) {
            amountOfSalesBonus = 250;
            System.out.println("Bonus depending on the Amount of sales: " + amountOfSalesBonus);
        }
        if (amountOfSales <= 15000) {
            amountOfSalesBonus = 0;
            System.out.println("Bonus depending on the Amount of sales " + amountOfSalesBonus);
        }
        return amountOfSalesBonus;
    }

    double totalSalary() {
        if (workingHours <= 160) {
            totalSalary = workingHours * rate * baseHourRatio + numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");
        }
        if (workingHours > 160) {
            totalSalary = 160 * rate * baseHourRatio + ((workingHours - 160) * 1.5 * rate) + numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");

        }
        return totalSalary;
    }

    public double getSalary() {
        return totalSalary;
    }
}






