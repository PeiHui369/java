@ smallest among 3 nums
Math.min(Math.min(x, y), z);

@ count vowels
 if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }

@ display middle char (len odd 1 char, len even 2 chars)
public static String middle(String str)
    {
        int position; 
        int length;
        if (str.length() % 2 == 0)            //even
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else                                  //odd
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

@count words
int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
        if (" ".equals(str.substring(0, 1))){count--;}
        if (" ".equals(str.substring(str.length() - 1))){count--;}

        return count + 1;
}

---
@ Pentagonal number
(i * (3 * i - 1))/2;

@ Future investment value
rate*=0.01;
rate/12;  //Monthly interest
investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

@ leap year
return (year % 4 == 0) && ((y%100 != 0) || (year%100==0)&&(year%400 ==0))
  
@Print char between 2 characters (i.e. A to P), print 20 chars per line
public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {       //print char between
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");             //20 chars per line
        }
		System.out.print("\n");
    }

@ takes a number n as input to display an n-by-n matrix
public static void printMatrix(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random()*2) + " "); //Math.random() generate 0.0<=x<1.0, so int of x*2 always get 0 or 1
            }
            System.out.println();
        }
    }

@ calc area of triangle
//Test valid (sum of 2 sides > another side)
if( side1 + side2 > side3 &&
side2 + side3 > side1 &&
side1 + side3 > side2) return true;
// area
public static double area_triangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;                    //#
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3)); //#
        return area;
    }

@ calc area of pentagon
 public static double pentagon_area(int n, double s) {    //n is number of sides, side is side length
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }

@ Twin prime number
- diff = 2 (only 1 composite num between them)
for (int i = 2; i < 100; i++) {

            if (is_Prime(i) && is_Prime(i + 2)) {           //#
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }

public static boolean is_Prime(long n) {

        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;
        }
        return true;
    }

@ Count no. of digits in int have value 2
public static int test(int num)
   {
    int ctr = 0;
    int n = num;
    do{
      if (n % 10 == 2){
          ctr ++;
      }
      n /= 10;
     }while(n > 0);
      return ctr;
   }

@ accept 3 int, check whether consecutive (diff 1, mean & median equal)
 - find max,min,mid -> max-mid = 1 && mid - min = 1
 public static boolean test(int x, int y, int z){
    int max_num = Math.max(x, Math.max(y, z));
    int min_num = Math.min(x, Math.min(y, z));
    int middle_num = x+y+z - max_num - min_num;
    return (max_num - middle_num) == 1 && (middle_num - min_num == 1);
  }

@ accept 3 int, true if 1 of them is mid point between other 2
- find max & min, midpoint1=(max+min)/2, midpoint2=x+y+z-max-min; true if midpoint 1 = midpoint2
public static boolean test(int x, int y, int z){
    int max = Math.max(x, Math.max(y,z));
    int min = Math.min(x, Math.min(y,z));
    double mid_point1 = (max + min) / 2.0;
    int mid_point2 = x + y + z - max - min;
    return (mid_point1 == mid_point2);
  }

@ display factors of 3 [81 = 3 * 3 * 3 * 3 * 1]
public static void test(int n){
    System.out.print(n + " = ");
    int result = n;
    while (result % 3 == 0){
        System.out.print("3 * ");
        result = result / 3;
    }
    System.out.print(result);
}

@ Check whether every digit of given int is even
public static boolean test(int n){
    final int f = 10;
    if (n == 0){
        return false;
    }
    while(n != 0){
        if((n % f) % 2 != 0){       //#
            return false;
        }
        n /= 10;
    }
     return true;
   }

[R] @ Check whether all char VOWELS
public static boolean test(String input) {
    String str_vowels = "aeiou";
    String phrase = input.toLowerCase();                //#
    for (int i = 0; i < phrase.length(); i++) {
      if (str_vowels.indexOf(phrase.charAt(i)) == -1)   //#
        return false;
    }
    return true;
  }

[R]@ Extracting first digit from (+ve & -ve)
public static int test(int n){
       int fact_num = 10;
       while(n / fact_num != 0){
        fact_num *= 10;
    }
    return Math.abs(n / (fact_num/10));
  }

[R]@ Display current date & time
import java.util.Scanner;
public class Exercise15 {
 
 public static void main(String[] args) {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = (int)(totalSeconds % 60);

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = (int)(totalMinutes % 60);

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (int)(totalHours % 24);

        long totalDays = totalHours / 24;

        // current year
        int currentYear = (int)(totalDays / 365) + 1970;


        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;
        if (currentHour > 0) daysInCurrentYear++; // add today

        // get current month number
        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);

        // getting current month name
        String month = getMonthName(currentMonthNum);

        // getting day of current month
        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

        int startDay = getStartDay(currentYear, currentMonthNum);
        int today = (int) daysInCurrentYear - daysTillCurrentMonth;
        String dayOfWeek = dayNameOfWeek( ((startDay + today) % 7));

        // Display results
        System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today +", " + currentYear
        +" " + currentHour + ":"
                + currentMinute + ":" + currentSecond );

    }

    public static String dayNameOfWeek(int dayOfWeek) {

        switch (dayOfWeek) {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
    }

    public static int numberOfLeapYearsSince1970(long year) {

        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i))count++;
        }
        return count;
    }


    public static int getMonthFromDays(int year, int days) {
        int dayTracker = 0;
        for (int i = 1; i <= 12; i++) {

            dayTracker += getNumberOfDaysInMonth(year, i);

            if (dayTracker > days) return i;
        }
        return 12;
    }

    public static int getNumOfDaysToReachThatMonth(int year, int month) {
        int dayTracker = 0;
        for (int i = 1; i < month; i++) {

            dayTracker += getNumberOfDaysInMonth(year, i);


        }
        return dayTracker;
    }

    /** Get the start day of month/1/year */
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /** Get the total number of days since January 1, 1800 */
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


    /** Get the English name for the month 1-12 */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

}









