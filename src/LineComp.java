

import java.util.Scanner;

public class LineComp {
    public static int x1;
    public static int x2;
    public static int y1;
    public static int y2;

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        int[] lineLengthArray = new int[2];
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter thr start and end Co-ordinates " +i+ " " );
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            System.out.println("Starting Points: (x1,y1) = " + x1 + " " + y1);
            System.out.println("End Points (x2,y2) = " + x2 + " " + y2);


            int lineLength = getLengthOfLine(); //function called

            lineLengthArray[i - 1] = lineLength;//1-1=0 , 2-1=1 stores in the respective location, array starts from 0 therefore we take i-1
            System.out.println("Length Of Line is " + i + " :" + lineLength);


            if (lineLengthArray[0] == lineLengthArray[1]) {
                System.out.println("Line 1 and Line 2 are Equal");
            } else if (lineLengthArray[0] > lineLengthArray[1]) {
                System.out.println("Line 1 is Grater than Line 2");
            }
            else {
                System.out.println("Line 1 is Smaller then line 2");
            }

        }

    }
    public static int getLengthOfLine() {

        return (int) Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
    }
}

