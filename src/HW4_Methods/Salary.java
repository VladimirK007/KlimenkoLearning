package HW4_Methods;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        AgentSalary agent = new AgentSalary();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Agent`s working hours: ");
        agent.workingHours = scanner.nextInt();
        System.out.print("Enter the Agent`s rate: ");
        agent.rate = scanner.nextDouble();
        System.out.print("Enter the Agent`s years of experience: ");
        agent.yearsOfExperience = scanner.nextInt();
        System.out.print("Enter number of sales for the Agent: ");
        agent.numberOfSales = scanner.nextInt();
        System.out.print("Enter the sales amount for the Agent: ");
        agent.amountOfSales = scanner.nextInt();
        System.out.println("______________________");

        agent.BaseSalary();
        agent.BaseHoursRatio();
        agent.NumberOfSalesBonus();
        agent.AmountOfSalesBonus();
        agent.TotalSalary();

    }
}

class AgentSalary {
    int workingHours;
    double rate;
    int yearsOfExperience;
    double baseHourRatio;
    int numberOfSales;
    double numberOfSalesBonus;
    int amountOfSales;
    double amountOfSalesBonus;
    double totalSalary;
    double salary;

    public void BaseSalary() {

        if (workingHours > 160) {
            salary = 160 * rate +((workingHours-160)*1.5*rate);

        } else {salary = workingHours * rate;}
        System.out.println("The agent`s base salary: " + salary + " USD");
    }


    public void BaseHoursRatio() {
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
    }

    public void NumberOfSalesBonus() {
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
    }

    public void AmountOfSalesBonus() {
        if (amountOfSales > 15000) {
            amountOfSalesBonus = 250;
            System.out.println("Bonus depending on the Amount of sales: " + amountOfSalesBonus);
        }
        if (amountOfSales <= 15000) {
            amountOfSalesBonus = 0;
            System.out.println("Bonus depending on the Amount of sales " + amountOfSalesBonus);
        }
    }

    public void TotalSalary() {
        if (workingHours <= 160) {
            totalSalary = workingHours*rate*baseHourRatio + numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");
        }
        if (workingHours > 160) {
            totalSalary = 160 *rate*baseHourRatio + ((workingHours - 160) * 1.5*rate) + numberOfSalesBonus + amountOfSalesBonus;
            System.out.println("______________________");
            System.out.println(" The Agent`s Salary: " + totalSalary + " USD ");

        }
    }
}