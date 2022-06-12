package HW5_OOP1;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1 = new SalesAgentSalary(160, 2);
        SalesAgentSalary agent2 = new SalesAgentSalary(167, 2,
                3, 25, 16000);
        agent1.getSalaryTrial();
        System.out.println("======================================== ");
        agent2.getSalaryContractor();

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

    public double getSalaryTrial() {

        System.out.println("The Agent is in Trial Period ");

        if (workingHours > 160) {
            salary = 160 * rate + ((workingHours - 160) * 1.5 * rate);

        } else {
            salary = workingHours * rate;
        }
        System.out.println("The agent`s base salary: " + salary + " USD");
        return salary;

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


    public double getSalaryContractor() {

        if (workingHours > 160) {
            salary = 160 * rate + ((workingHours - 160) * 1.5 * rate);

        } else {
            salary = workingHours * rate;
        }

        System.out.println("The agent`s base salary: " + salary + " USD");

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


        if (numberOfSales > 20) {
            numberOfSalesBonus = 250;
            System.out.println("Bonus depending on the Number of sales: " +
                    numberOfSalesBonus);
        }
        if (numberOfSales < 10) {
            numberOfSalesBonus = -150;
            System.out.println("Fine depending on the Number of sales: " +
                    numberOfSalesBonus);
        }
        if ((numberOfSales >= 10) && (numberOfSales <= 20)) {
            numberOfSalesBonus = 0;
            System.out.println("Bonus depending on the Number of sales: " +
                    numberOfSalesBonus);
        }


        if (amountOfSales > 15000) {
            amountOfSalesBonus = 250;
            System.out.println("Bonus depending on the Amount of sales: " +
                    amountOfSalesBonus);
        }
        if (amountOfSales <= 15000) {
            amountOfSalesBonus = 0;
            System.out.println("Bonus depending on the Amount of sales " +
                    amountOfSalesBonus);
        }

        if (workingHours <= 160) {
            totalSalary = salary * baseHourRatio +
                    numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");
        }
        if (workingHours > 160) {
            totalSalary = 160 * baseHourRatio * rate + ((workingHours - 160) *
                    rate * 1.5) + numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");

        }
        return totalSalary;
    }
}






