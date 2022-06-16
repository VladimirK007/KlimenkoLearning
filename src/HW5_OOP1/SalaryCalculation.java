package HW5_OOP1;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1 = new SalesAgentSalary(182, 2);
        SalesAgentSalary agent2 = new SalesAgentSalary(170, 2,
                3, 25, 16000);
        System.out.println("The first agent`s salary: " + agent1.getSalary());
        System.out.println("The second agent`s salary: " + agent2.getSalary());

    }
}

class SalesAgentSalary {

    private int workingHours;
    private double rate;
    private int yearsOfExperience;
    private int numberOfSales;
    private int amountOfSales;
    private double salary;


    public SalesAgentSalary(int workingHours, double rate) {

        this.workingHours = workingHours;
        this.rate = rate;
        salary = setSalary(workingHours, rate);
    }

    public SalesAgentSalary(int workingHours, double rate, int yearsOfExperience,
                            int numberOfSales, int amountOfSales) {

        this.workingHours = workingHours;
        this.rate = rate;
        this.yearsOfExperience = yearsOfExperience;
        this.numberOfSales = numberOfSales;
        this.amountOfSales = amountOfSales;
        setSalary(workingHours, rate, yearsOfExperience, numberOfSales, amountOfSales);

    }

    public double baseSalary(int workingHours, double rate) {

        if (workingHours > 160) {
            salary = 160 * rate + ((workingHours - 160) * 1.5 * rate);

        } else {
            salary = workingHours * rate;
        }

        return salary;

    }
    public double baseHourRatio(int yearsOfExperience) {
        double baseHourRatio=0;

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
        return baseHourRatio;

    }

    public double numberOfSalesBonus(int numberOfSales) {
        double numberOfSalesBonus=0;
        if (numberOfSales > 20) {
            numberOfSalesBonus = 250;

        }
        if (numberOfSales < 10) {
            numberOfSalesBonus = -150;

        }
        if ((numberOfSales >= 10) && (numberOfSales <= 20)) {
            numberOfSalesBonus = 0;

        }
        return numberOfSalesBonus;
    }

    public double amountOfSalesBonus(int amountOfSales) {
        double amountOfSalesBonus =0;
        if (amountOfSales > 15000) {
            amountOfSalesBonus = 250;

        }
        if (amountOfSales <= 15000) {
            amountOfSalesBonus = 0;

        }
        return amountOfSalesBonus;
    }

    public void setSalary(int workingHours, double rate, int yearsOfExperience,
                          int numberOfSales, int amountOfSales) {

        if (workingHours < 160) {
            salary = workingHours * baseHourRatio(yearsOfExperience) * rate +
                    numberOfSalesBonus(numberOfSales) + amountOfSalesBonus(amountOfSales);
        } else {
            salary = (160 * baseHourRatio(yearsOfExperience) * rate) + ((workingHours - 160) * 1.5 * rate) +
                    numberOfSalesBonus(numberOfSales) + amountOfSalesBonus(amountOfSales);
        }

    }

    public double setSalary(int workingHours, double rate) {

        salary = baseSalary(workingHours, rate);
        return salary;
    }

     double getSalary() {

        return salary;
    }

}




