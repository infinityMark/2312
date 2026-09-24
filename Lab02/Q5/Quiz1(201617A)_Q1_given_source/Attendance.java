import java.io.*;
import java.util.Scanner;

public class Attendance {

	private int[] students;
	private int[] attendees;

	public Attendance() throws FileNotFoundException {
		students = new int[20];
		attendees = new int[20];
		Scanner sStudents = new Scanner(new File("StudentList.txt"));
		Scanner sAttendees = new Scanner(new File("AttendanceLog.txt"));
		





		sStudents.close();
		sAttendees.close();
	}

	public boolean isPresent(int id) {


	}

	public boolean belongToClass(int id) {


	}

	public void listAbsentees() {
		System.out.println("List of absentees:");

	}

	public void listWalkIn() {
		System.out.println("List of walk-in students:");


	}

}
