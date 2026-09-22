import java.util.Scanner;

public class Assignment 
{
	//Instance fields
	private Team team; //a reference to the team for this assignment: Team team;
	private Task task; //a reference to the task assigned: Task task;
	
	//Constructor
	public Assignment(Team aTeam, Task aTask) //Two input parameters: Team aTeam, Task aTask
	{
		team = aTeam;
		task = aTask;
	}
	
	//Return the task name
	public String getTaskName()
	{
		return task.toString();//The task name to be returned: task.toString();
	}
	
	//Return the String representation for this assignment
	public String toString()
	{
		return task.toString() + " "+ team.toString();//The string representation of this assignment: task.toString() + " " + team.toString();
	}
	
	//print the team who are assigned with a task of the given task name
	public static void printTaskTeam(String taskName, Assignment[] assignments)
	{
		for (int i=0;i<assignments.length;i++)
			if (assignments[i].getTaskName().equals(taskName))//check the name: assignments[i].getTaskName().equals(taskName)
				System.out.println(assignments[i].toString()); //print the assignment: assignments[i].toString()
	}

	public static Assignment[] decideTasks(Team[] teams, Scanner in)
	{
		Assignment[] assignments; //Define an array of assignments to store the result: Assignment[] assignments;
		assignments = new Assignment[5]; //Create the array: new Assignment[5];
				
		System.out.println("\nEnter 8 tasks for the teams (Lab05,Lab06,Lab07,): ");
		for (int i=0; i<5; i++)
		{
			System.out.print(teams[i].getName()+ ": "); //Prompt for a team: teams[i].getName()
			String taskName = in.nextLine(); //Get user input of the task name from keyboard: in.next();
			assignments[i] = new Assignment(teams[i], new Task(taskName)); //Create the assignment for:  teams[i], new Task(taskName)
		}
		return assignments; //Return the result: return assignments;
	}
}