import java.util.Scanner;

public class WifiDiagnosis {
  
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
  
// solution 1
System.out.println("Reboot your computer and try to reconnect");
System.out.print("Are you able to connect with the internet? (yes or no): ");
String choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your computer seemed to work");
return;
}
  
// solution 2
System.out.println("Reboot your router and try to reconnect");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your router seemed to work");
return;
}
  
// solution 3
System.out.println("Make sure the cables connecting the router are plugged in firmly and power is getting to your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Checking the router's cables seemed to work");
return;
}
  
// solution 4
System.out.println("Move your computer closer to your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Moving your computer closer to the router seemed to work");
return;
}
  
// solution 5
System.out.println("Contact your ISP\n"
+ "Make sure your ISP is hooked to your router.");
}
}