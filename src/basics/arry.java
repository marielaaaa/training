package basics;

public class arry {

	public static void main(String[] args) {

				// Declaring Array
				String[] countries;
				
				//Declaring size of Array
				countries = new String[2];
				String[] city = new String[5];
				
				// Defining Array
				//countries[0] = "Afghanistan";
				//countries[1] = "Algeria";
				//countries[2] = "Albania";
				String[] numbers = {"1", "2", "3"};
				
				//Do While loop: enters loop then test condition
				int x = 0;
				int y = 0;
				do {	
					System.out.println("" + numbers[x]);
					x = x + 1;
					} while (x < 3);
						System.out.println("stop");
						
						
				//Do While Loop: test condition first before entering the loop
					boolean numfound = false;	
				while(!numfound){
					String a = numbers[y];
					if (a == "2"){
						System.out.println("Found!");
						numfound = true;
					}
					y++;
					
					
				//For Loop
					for (int m = 0; m < 3 ; m++){
						System.out.println("" + numbers[m]);
						
					}
				} 
						
				
				}
			}
