import java.lang.Math;
public class Employee {

    public static final int FULL_TIME_WAGE = 20;
    public static final int PART_TIME_WAGE = 10;

    public void isEmpPresent(String empName) {
        if (((int)Math.round(Math.random())) == 1)
            System.out.println(empName + " is Present");
        else
            System.out.println(empName + " is not present");
    }

    public void calcDailyWage(int hour, String tml){
        switch (tml){
            case "FULL TIME":
                System.out.println("Numbers of Daily Employee wage is : " + (FULL_TIME_WAGE*hour));
                break;
            case "PART TIME":
                System.out.println("Numbers of Daily Employee wage is :  " + (PART_TIME_WAGE*hour));
                break;
            default:
                System.out.println("Please Enter Valid Working Time");
        }

    }


    public void wagesofMonth(){
        System.out.println("Wages for Days per Month is : " + (FULL_TIME_WAGE*20));
    }



    public void wagesTillhour(){
        int sum = 0;
        int hour = 100;
        while(hour > 0){
            hour = hour - 8;
            sum = sum + FULL_TIME_WAGE * 8;
        }
        System.out.println("Wages fore 100 hours: " + sum);
    }

    public void wagesTillDays(){
        int sum = 0;
       for(int i=1; i<21; i++){
            sum = sum + FULL_TIME_WAGE * 8;
        }
        System.out.println("Wages for 20 days: " + sum);
    }
}
