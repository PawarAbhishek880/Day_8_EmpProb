
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Employee");
        System.out.println("------------------------------------------------");

        Employee emp = new Employee();

        emp.isEmpPresent("Abhishek");

        emp.calcDailyWage(8, "FULL TIME");

        emp.wagesofMonth();

        emp.wagesTillhour();

        emp.wagesTillDays();
    }
}
