package ArrayList1;

public class Job {
	String title;
	double salary;
	String location;
	
	public Job() {
		getJobDEtails();
	}
	
	public Job(String title) {
		this.title=title;
		getJobDEtails();
	}
	public Job(String title, double salary) {
		this.title=title;
		this.salary=salary;
		getJobDEtails();
	}
	public Job(String title, double salary, String location) {
		this.title=title;
		this.salary=salary;
		this.location=location;
		getJobDEtails();
	}
	public void getJobDEtails() {
		System.out.println("Title is: "+title+ "\nsalary is: "+salary+ "\nlocation is: "+location);
	}


}
