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
		
		result.commands(command1, command2);
		result.goals(score);
	}
	
	private static String[] commands = {" "," "," "," "," "," "," "," "," "," "};	//Массив комманд
	private static int[] commands_points = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};			//Очки комманд
	private static int i = 0;
	
	public static void calculate_table(String command_win, String command_loose, boolean draw) {
		boolean command_win_point = false;
		boolean command_loose_point = false;
		
		for (i=0;i<commands.length;i++)
		{
			if (commands[i].equals(command_win))
			{
				command_win_point = true;
				if (draw)
					commands_points[i] ++;
				else
					commands_points[i] += 3;
			}
			if (commands[i].equals(command_loose))
			{
				command_loose_point = true;
				if (draw)
					commands_points[i] ++;
			}
		}
		
		if (command_win_point == false)
		{
			i = 0;
			while (command_win_point == false)
			{
				if (commands[i]==" ")
				{
					commands[i] = command_win;
					command_win_point = true;
					if (draw)
						commands_points[i] ++;
					else
						commands_points[i] += 3;
				}
				i ++;
			}
		}			
		
		if (command_loose_point == false)
		{
			i = 0;
			while (command_loose_point == false)
			{
				if (commands[i]==" ")
				{
					commands[i] = command_loose;
					command_loose_point = true;
					if (draw)
						commands_points[i] ++;
					else
						commands_points[i] += 0;
				}
				i ++;
			}
		}
	}
	
	public void sort_and_print_table(){
		int change_int;
		String change_Str;
		//Сортировка
		for (i=0;i<commands.length;i++)
			for (int j = commands.length-1; j > i; j--)
				if (commands_points[i] < commands_points[j])
				{
					change_int = commands_points[i];
					commands_points[i] = commands_points[j];
					commands_points[j] = change_int;
					change_Str = commands[i];
					commands[i] = commands[j];
					commands[j] = change_Str;
				}
		//Печать
		for (i=0;i<commands.length;i++)
			if (commands[i] != " ")
		System.out.println(commands[i] + " " + commands_points[i]);
	}
		
}
