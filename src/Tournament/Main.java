package Tournament;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//result result = new result ();
		tournament tour = new tournament ();
		//command command = new command ();
		String index = "";
		
		tour.add_result();
		do
		{
			System.out.println("Добавить еще один результат? (1 или 0)");
			index = scan.nextLine();
			if (Integer.parseInt(index) == 1)
				tour.add_result();
		}while(Integer.parseInt(index) != 0);
		tour.sort_and_print_table();
		
	}

}
