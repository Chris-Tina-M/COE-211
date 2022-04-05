import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FinancesManager {
   public static void main(String[]args) throws IOException {
   try { 
        FileWriter fw = new FileWriter(new File("expenses.text"));
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outToFile = new PrintWriter(bw);
        String n = "";
        String i = "";
        double p = 0;
        String log;
        String a = "y";
        String c = "y";

        Scanner fileScan = new Scanner(new File("expenses.text"));
        Scanner scan = new Scanner(System.in);

    do {
         
          System.out.println("Input your name");
          n = scan.nextLine();

          System.out.println("What did you purchase?");
          i = scan.nextLine();

          System.out.println("How much did you pay? (in USD)");
          p = scan.nextDouble();
          scan.nextLine();

          outToFile.println(n + " purchased " + i + " for " + p + " US Dollars.");
          fw.close();
          System.out.println("Would you like to log another purchase?(y/n)");
          a = scan.nextLine();
      
          }
            while(a.equalsIgnoreCase("y"));
            System.out.println("Would you like to read a summary of your purchases?(y/n)");
            c = scan.nextLine();
            outToFile.close();
            scan.close();
            
               if(c.equalsIgnoreCase("y")){
                  while(fileScan.hasNext()){
                    log = fileScan.nextLine();
                    System.out.println(log);
               
                        }
            }
            
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
             
    }
}
          