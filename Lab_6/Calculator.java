import java.util.Scanner;
public class Calculator1{
	private int num1;
	private int num2;
	private String operation;

	public Calculator(){
		this.num1=num1;
		this.num2=num2;
		Scanner scanCalc = new Scanner(System.in);
		System.out.println("Enter the value of the first integer: ");
		num1 = scanCalc.nextInt();
		System.out.println("Enter the value of the second integer: ");
		num2 = scanCalc.nextInt();
		System.out.println("Choose an operation: divide (/), multiply(x), subtract(-), or add(+)");
        	String operation = scan.next();
        	switch(operation){
		
		case "/":
			System.out.println(divide(num1, num2));
			break;
		case "x":
			System.out.println(multiply(num1, num2));
			break;
		case "-": 
			System.out.println(subtract(num1, num2));
			break;
		case "+": 
			System.out.println(add(num1, num2));
			break;
		 
}
}
    public String add(int num1, int num2) {
        int addition= num1 + num2;
        	return num1 + "+" + num2 + "=" + addition;     

}

    public String subtract(int num1,int num2) {
        int subtraction= num1 - num2;
        	return num1 + "-" + num2 + "=" + subtraction;
}

    public String multiply(int num1,int num2) {
        int multiplication= num1 * num2;
        	return num1 + "x" + num2 + "=" + multiplication;
}

    public String divide(int num1,int num2) {
        double division= num1 / (double)num2;
        	return num1 + "/" + num2 + "=" + division;
        		

        	}

}

        	