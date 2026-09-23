import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.print("Please input the file pathname: ");
		Scanner in = new Scanner(System.in);
		String filepathname = in.nextLine();

        int numberInEachGroup;

        // System.out.println(numberOfStudent + " " +numberInEachGroup);

		Student[] students; //Define an array of students: Student[] students;
		students = Student.createStudentListFromFile(filepathname); //Call the given static method in the Student class for reading from file: Student.createStudentListFromFile(filepathname);
        
        System.out.print("\nEnter the number of teams: ");
        numberInEachGroup = in.nextInt();

        if ( (int)(students.length%numberInEachGroup) != 0) {
		    System.out.printf("\nWrong input - It is not a factor of %d.", students.length);
            in.close();
            return;
        }
		
		Team[] teams; //Define an array of teams: Team [] 
		teams = Team.createTeams(students, numberInEachGroup);//Call the private method (one of the 3 methods in Main.java) to create the teams for students: createTeams(students);
		
		//Print the grouping result:
		System.out.println("\nGrouping result: ");				
		Team.teamsPrinter(teams);
		
		//Create the assignments
		Assignment[] assignments; //Define an array of assignments: Assignment[] assignments 
		assignments = Assignment.decideTasks(teams, in);//Call the private method (one of the 3 methods in Main.java) to input the tasks for each team: decideTasks(teams, in); 

        String[] taskContainer;
        taskContainer = Assignment.getTaskList(assignments);
		
		//Display sorted listing by tasks:
		System.out.println("\nSorted listing by tasks: ");
        for (String str:taskContainer)
		    Assignment.printTaskTeam(str, assignments);
		
		in.close();
	}
}