import java.util.Arrays;

public class Team
{
	//Instance fields
	private Student[] students; //A reference to the array of students in the team: Student [] students;
	private String name; //A reference to the team name: String name;
	
	//Constructor
	public Team(String name, Student[] students) //Two input parameters: String name, Student[] students
	{
		this.name = name;
		this.students = students;
	}
	
	//Return the String representation for the team: name + student list
	public String toString()
	{
		String result = this.name + ": "; //Team name: name
		for (int i=0; i < students.length; i++) //Loop through students[0..students.length-1]
		{
			result += "["+students[i].toString()+"] "; //Student names: students[i].toString()
		}
		
		return result; //Return the result: return result;
	}
	
	//Return the team name
	public String getName()
	{
		return name;//Return the team name: return name;
	}

	public static Team[] createTeams(Student[] students, int numberOfGroup) 
	{
        char teamLetter = 'A';
        int groupNumber = students.length/numberOfGroup;
		Team[] result; //Define an array of teams to store the result: Team[] result;
		result = new Team[numberOfGroup]; //Create the array: new Team[5];
        int start = 0, end = groupNumber;

        for (int i = 0; i < numberOfGroup; i++) {
		    result[i]=new Team("Team " + (char)(teamLetter + i), 
                Arrays.copyOfRange(students, start, end));
            start = end;
            end += groupNumber;
        }
        
		return result; //Return the result: return result;
	}

    public static void teamsPrinter(Team[] teams){
        // for (int i = 0; i < teams.length; i++) {
        //     System.out.println(teams[i].toString());
        // }
        for (Team teamIteration: teams)
            System.out.println(teamIteration.toString());
    }
}