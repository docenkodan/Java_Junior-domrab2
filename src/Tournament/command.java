package Tournament;

public class command {
	
	public String command_win, command_loose = "";
	public int goals_scored;
	public int missed_goals;
	boolean draw = false;
	
	public void command (String command1, String command2, int goals_scored, int missed_goals)
	{
		this.command_win = command1;
		this.command_loose = command2;
		this.goals_scored = goals_scored;
		this.missed_goals = missed_goals;
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
		tournament tour = new tournament ();
		tour.calculate_table(command_win, command_loose, draw);
	}
	
	
}
