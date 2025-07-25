import java.util.*;
public class numbergame{
	public static void main(String[]args){
		Random random=new Random();
		Scanner s1= new Scanner(System.in);
		int guess;
		int attempts=0;
		int max=100;
		int randomNumber=random.nextInt(min, max +1);
		System.out.println("guess no2 between 1 to 100: ");
		do{
			System.out.print("enter a guess: ");
			guess=s1.nextInt();
			attempts++;
			
			if(guess<randomNumber){
				System.out.print("TOO LOW! TRY AGAIN");
			}
			else if(guess>randomNumber){
				System.out.println("CORRECT!THE NUMBER WAS"+randomNumber);
			}else{
				System.out.println("correct !number was: "+randomNumber);
				System.out.println("# of attempts: " + attempts);
			}
				
		}while(guess != randomNumber);
	}
}
