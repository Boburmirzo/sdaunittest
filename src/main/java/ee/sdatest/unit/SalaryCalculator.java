package ee.sdatest.unit;

public class SalaryCalculator {

    public double calculateFor12Months(double monthlySalary,
                                       double bonus){
        return (12 * monthlySalary) + bonus;
    }
}
