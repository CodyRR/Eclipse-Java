package HW2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Vector;

public class Vectorsetup {

	public Vectorsetup() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputer = new BufferedReader(new InputStreamReader(System.in));
		Boolean valid = true;
		Vector intSystem = new Vector();
		System.out.println("You are here");
		while(valid == true){
			System.out.println("Input a number or just press return");
			String input = inputer.readLine();
			if(input.isEmpty()){
				System.out.println("This will end.");
				break;
			}
			int num = Integer.parseInt(input);
			intSystem.add(num);
			
		}
		int display;
		for (Iterator i = intSystem.iterator(); i.hasNext();){
			display = (int)i.next();
			System.out.println(display);
		}

	}

}
