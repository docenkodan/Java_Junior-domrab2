package Tournament;

public class command {
	
	private String command_win, command_loose = "";
	private boolean draw = false;
	
	public void command (String command1, String command2, int goals_scored, int missed_goals)
	{
		this.command_win = command1;
		this.command_loose = command2;
		if (goals_scored == missed_goals)
		{
			draw = true;
		}
		else
		{
			if (goals_scored > missed_goals)
			{
				this.command_win = command1;
				this.command_loose = command2;
			}
			else
			{
				this.command_win = command2;
				this.command_loose = command1;
			}
		}
		tournament.calculate_table(command_win, command_loose, draw);
	}
	
	
}
