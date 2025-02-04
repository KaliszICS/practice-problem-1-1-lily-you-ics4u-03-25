
class Notes {
	public static void main(String[] args) {

		//Output

		System.out.println("Hello"); //this prints a newline AFTER the output
		System.out.print(9); //print does NOT output a newline after the output
		System.out.println("same line");
		// System.out.printf();

		//declare the variable - creating the variable

		//lowercase first letter data types are primitive
		//uppercase first letter are not

		int num; //whole number
		String word; //text
		double fracNum; //fractional numbers - decimals numbers
		boolean trueFalse; //true or false values, used in loops, if statments etc.
		char c; //store a single character

		//Assign  or initialize your variable
		//Storing a value instead a variable
		num = 4;
		word = "\n\n\n\n\tHello";
		// the backlash is called the escape character.  It alters the function of the following character
		// \n - newline
		// \t - tab
		// \" - instead of ending a string, it is just a character
		// \\ - instead of being an escape character, the second backslash is a normal character
		fracNum = 3.5;
		fracNum = 4.0;
		trueFalse = true;
		c = ' ';
		c = 'a';

		//variable call - using the variable at any other point in your program
		//as long as it is not on the left side of the assignment symbol (=)


		// System.out.println(word);

		num = 10; 
		//after overwriting a variable.  Any code after this will use this value instead in its variable call

		//Operations -> Addition (+), Subtraction (-), Multiplication (*), Division (/), Mod (%) - Remainder

		//Right side happens before left side
		//num = 10
		num = num + 1; //num = 11

		//Division

		//integer division vs double division

		//If both numbers are integers, the result is an integer
		// System.out.println(8/5); //integer division can't store decimal points.
		//instead of 1.6 it drops the decimal point and leaves the 1.

		// System.out.println(4.5/2); //2.25

		// +=, *=, /=, -=, %=

		num = 0;
		num += 5; //num = num + 5;
		// System.out.println(num);

		num = 0;
		num += 5 * 3;
		// System.out.println(num);

		num = 0;
		num *= 5 + 3;  //num = num * (5 + 3);
		// System.out.println(num);

		num++; //num = num + 1;  Runs AFTER the rest of the code on the line
		++num; //Runs BEFORE the rest of the code on the line

		num  = 5;
		// System.out.println(++num); //6
		// System.out.println(num++); //6
		// System.out.println(num);  //7

		// System.out.println(10 % 3);  //Give the remainder of a division question.

	}
}
