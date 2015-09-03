package switchStatement;

public class Switchexample {
	public static void main(String[] args) {
	int month = 6;
    String monthString;
    switch (month) {
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
default: monthString = "Invalid month";
                 break;
    }
    System.out.println(monthString);

	}
}


//	int month = 6; Result => Invalid month
//	int month = 4; result => April
//	int month = 3; result => March