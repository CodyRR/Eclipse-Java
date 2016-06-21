package HW2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Select and option (1 or 2)");
		String input = br.readLine();
		int choice = Integer.parseInt(input);
		
		//Part B
		if(choice == 1){
			Vectorsetup system = new Vectorsetup();
		}
		else if(choice == 2){
			
			//Part C
			MemoryLeak blank;
			while(true){
				blank = new MemoryLeak();
			}
		}
		
	}

}


