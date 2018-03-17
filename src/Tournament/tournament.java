package Tournament;

import java.util.Scanner;

public class tournament {
	
	public void add_result() {		//Добавление результата
		Scanner scan = new Scanner (System.in);
		result result = new result ();
		
		System.out.print("Введите название команды 1: ");	
		String command1 = scan.nextLine();
		System.out.print("Введите название команды 2: ");	
		String command2 = scan.nextLine();
		System.out.print("Введите счет (2-0) : ");
		String score = scan.nextLine();
		int command1_goals = 0, command2_goals = 0;
		
		result.commands(command1, command2);
		result.goals(score);
	}
	
	public String[] commands = {null,"w","q"};		//Массив комманд
	public int[] commads_points = {0, 0, 0};	//Очки комманд
	
	public void calculate_table(String command_win, String command_lose, boolean draw) {
		int i = 0;
		boolean command_win_point = false;
		boolean command_lose_point = false;
		
		for (i=0;i<commands.length;i++)
		{
			if (commands[i].equals(command_win))
			{
				command_win_point = true;
				if (draw)
					commads_points[i] ++;
				else
					commads_points[i] += 3;
			}
			if (commands[i].equals(command_lose))
			{
				command_lose_point = true;
				if (draw)
					commads_points[i] ++;
				else
					commads_points[i] += 3;
			}
		}
		
		if (command_win_point = false)
		{
			for (i=0;i<commands.length;i++)
			{
			if (commands[i]==null)
			{
				commands[i] = command_win;
				if (draw)
					commads_points[i] ++;
				else
					commads_points[i] += 3;
			}
			}
		}			
		
		if (command_lose_point = false)
		{
			for (i=0;i<commands.length;i++)
			{
			if (commands[i]==null)
			{
				commands[i] = command_lose;
				if (draw)
					commads_points[i] ++;
				else
					commads_points[i] += 0;
			}
			}
		}
		
	}
	
	public void print_table(){
		for (int i=0;i<commands.length;i++)
			if (commands[i] != null)
		System.out.println(commands[i] + " " + commads_points[i]);
	}
		
}
