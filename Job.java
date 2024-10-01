
public class Job
{
	public int attack(int val,Hero H)
	{
		// will be overwritten in subclasses
		return val;
	}
	
	public String getJobName()
	{
		// will be overwritten in subclasses
		return null;
	}
}
