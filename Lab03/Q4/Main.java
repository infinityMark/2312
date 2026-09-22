import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.print("Please input the file pathname: ");
		Scanner in = new Scanner(System.in);
		String filepathname = in.nextLine();

        int numberOfStudent, numberInEachGroup;
        Scanner inFile = new Scanner(new File(filepathname));

        System.out.println("\nTotal number of students: ");
        numberOfStudent = inFile.nextInt();

		System.out.print("\nEnter the number of teams: ");
        numberInEachGroup = in.nextInt();

        if (numberOfStudent % numberInEachGroup !=0) {
		    System.out.printf("\nWrong input - It is not a factor of %d.", numberOfStudent);
            return;
        }

		Student[] students; //Define an array of students: Student[] students;
		students = Student.createStudentListFromFile(inFile, numberOfStudent); //Call the given static method in the Student class for reading from file: Student.createStudentListFromFile(filepathname);
		
		Team[] teams; //Define an array of teams: Team [] 
		teams = Team.createTeams(students, numberOfStudent, numberInEachGroup);//Call the private method (one of the 3 methods in Main.java) to create the teams for students: createTeams(students);
		
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