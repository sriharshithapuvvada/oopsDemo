
public class Person5 {
  private Job job;  //compostion and perfoming has a relationship
  public Person5()
  {
	  this.job=new Job();
	  job.setSalary(1000L);
	  job.setId(2);
	  job.setRole("tester");
  }
  public void dispdetails()
  {
	  System.out.println(job.getId()+" "+job.getRole()+" "+job.getSalary());
  }
}
