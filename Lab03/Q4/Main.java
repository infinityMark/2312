import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.print("Please input the file pathname: ");
		Scanner in = new Scanner(System.in);
		String filepathname = in.nextLine();

		Scanner inFile = new Scanner(new File(filepathname));

		Student[] students; //Define an array of students: Student[] students;
		students = Student.createStudentListFromFile(filepathname); //Call the given static method in the Student class for reading from file: Student.createStudentListFromFile(filepathname);
		
		Team[] teams; //Define an array of teams: Team [] 
		teams = Team.createTeams(students);//Call the private method (one of the 3 methods in Main.java) to create the teams for students: createTeams(students);
		
		//Print the grouping result:
		System.out.println("\nGrouping result: ");				
		System.out.println(teams[0].toString());
		System.out.println(teams[1].toString());
		System.out.println(teams[2].toString());
		System.out.println(teams[3].toString());
		System.out.println(teams[4].toString());
		
		//Create the assignments
		Assignment[] assignments; //Define an array of assignments: Assignment[] assignments 
		assignments = Assignment.decideTasks(teams, in);//Call the private method (one of the 3 methods in Main.java) to input the tasks for each team: decideTasks(teams, in); 
		
		//Display sorted listing by tasks:
		System.out.println("\nSorted listing by tasks: ");
		Assignment.printTaskTeam("Lab05", assignments);
		Assignment.printTaskTeam("Lab06", assignments);
		Assignment.printTaskTeam("Lab07", assignments);
		Assignment.printTaskTeam("Lab08", assignments);
		Assignment.printTaskTeam("Lab09", assignments);
		
		in.close();
	}
}