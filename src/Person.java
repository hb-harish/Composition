//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	public Person(){
		this.job=new Job();
		job.setSalary(1000L);
	}
	public long getSalary() {
		return job.getSalary();
	}
	private Education edu;
	public String toString()
	{
		edu = new Education();
		job = new Job();
		job.setId(1);
		job.setRole("Work");
		job.setSalary(100L);
		return String.format( job.toString() + "\n" + edu.toString() );
	}
	
}