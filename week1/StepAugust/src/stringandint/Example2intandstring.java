package stringandint;

public class Example2intandstring {
	public static void main(String[] args) {
		int mathScore = 90;
		String ms = "98576";
		mathScore = Integer.valueOf(ms);
		System.out.println(mathScore);
	}
}


// result
// 98576
// if we add a letter in String ms = "98576B"; it error will happened 