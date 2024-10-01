
public class WARRIOR extends Job
{
	@Override
	public int attack(int val,Hero H)
	{
		return (int) (((H.getSTR()*val)+H.getDEX()));
	}
	
	@Override
	public String getJobName()
	{
		return "WARRIOR";
	}
}
