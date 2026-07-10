//Single Responsibility Principle (SRP)
void main() {
    //add employee
Employee emp = new Employee("Rabbi",4000);
    Employee emp2 = new Employee("Rabbi",4000);


// calculate salary
    SalaryCalculator calculator = new SalaryCalculator();
    IO.println("Total Salary: "+calculator.calculateSalary(emp));

    // Report
    ReportGenerator report = new ReportGenerator();
    report.generateReport(emp);


}
