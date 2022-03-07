public class Advanced_Week{
	String day_1;
	int day_1_index;
	String day_2;
	int day_2_index;
	String day_3;
	int day_3_index;
	String day_4;
	int day_4_index;
	String day_5;
	int day_5_index;
	String day_6;
	int day_6_index;
	String day_7;
	int day_7_index;

	public Advanced_Week(){
		this.day_1 = "Monday";
		this.day_2= "Tuesday";
		this.day_3= "Wednesday";
		this.day_4= "Thursday";
		this.day_5= "Friday";
		this.day_6= "Saturday";
		this.day_7= "Sunday";
		this.day_1_index = 1;
		this.day_2_index = 2;
		this.day_3_index = 3;
		this.day_4_index = 4;
		this.day_5_index = 5;
		this.day_6_index = 6;
		this.day_7_index = 7;
}
	public void printDays() {
		 System.out.println(day_1_index + ": " + day_1 + ",\n" +day_2_index + ": " + day_2 + ",\n" +day_3_index + ": " + day_3 + ",\n" +day_4_index + ": " + day_4 + ",\n" +day_5_index + ": " + day_5 + ",\n" +day_6_index + ": " + day_6 + ",\n" +day_7_index + ": " + day_7 +".");


}
}