package Tournament;

public class result {
	
	private String command1, command2;
	private int command1_goals, command2_goals;
	
	public void commands(String command1, String command2) {
		this.command1 = command1;
		this.command2 = command2;
	}
	
	public void goals (String score) {
		char[] charScore = score.toCharArray();
		
		for (int i = 0; i < score.length(); i++)
			if (charScore[i] == '-')
			{
				if (i == 1)
					command1_goals = Character.getNumericValue(charScore[i-1]);
				else 
					command1_goals = Character.getNumericValue(charScore[i-1]) + Character.getNumericValue(charScore[i-2])*10;
				
				if (score.length()-i-1 == 1)
					command2_goals = Character.getNumericValue(charScore[i+1]);
				else 
					command2_goals = Character.getNumericValue(charScore[i+2]) + Character.getNumericValue(charScore[i+1])*10;
			}
		
		command command = new command();
		command.command(command1, command2, command1_goals, command2_goals);	
	}

}
