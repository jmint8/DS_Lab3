
public class MAGE extends Job
{
	@Override
	public int attack(int val,Hero H)
	{
		return (int) ((H.getDEX()+((H.getINT())*val)));
	}
	
	@Override
	public String getJobName()
	{
		return "MAGE";
	}
}
