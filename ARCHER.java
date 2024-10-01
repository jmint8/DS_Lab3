
public class ARCHER extends Job
{
	@Override
	public int attack(int val,Hero H)
	{
		return (int) ((H.getDEX()*val)*(1.5));
	}
	
	@Override
	public String getJobName()
	{
		return "ARCHER";
	}
}
