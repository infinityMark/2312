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

	public static Team[] createTeams(Student[] students) 
	{
		Team[] result; //Define an array of teams to store the result: Team[] result;
		result = new Team[5]; //Create the array: new Team[5];
		
		//Create the 5 teams
		//Hint: "Arrays.copyOfRange(students, 0,6);" means to copy from position 0 inclusive to position 6 EXCLUSIVE
		result[0]=new Team("Team A", Arrays.copyOfRange(students, 0,6)); //give team name and array of 6 students: "Team A", Arrays.copyOfRange(students, 0,6)
		result[1]=new Team("Team B", Arrays.copyOfRange(students, 6,12));; //Create the second team : new Team("Team B", Arrays.copyOfRange(students, 6,12));
		result[2]=new Team("Team C", Arrays.copyOfRange(students, 12,18));;
		result[3]=new Team("Team D", Arrays.copyOfRange(students, 18,24));;
		result[4]=new Team("Team E", Arrays.copyOfRange(students, 24,30));;
		return result; //Return the result: return result;
	}	
}