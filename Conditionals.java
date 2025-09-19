public class Conditionals {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a>b) {
            System.out.println("a is greater than b");
        } else if(a<b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // Nested if
        int c = 30;
        if(a < b) {
            if(b < c) {
                System.out.println("a is less than b and b is less than c");
            }
        }

        // Switch case
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
