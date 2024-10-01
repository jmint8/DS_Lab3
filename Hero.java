
public class Hero implements HeroInterface
{
	//TODO
	private Race r;
	private Job j;
	
	public Hero(Race r,Job j)
	{
		this.r = r;
		this.j = j;
	}

	@Override
	public int attack(int val)
	{
		return j.attack(val, this);
	}

	@Override
	public int getSTR()
	{
		return r.getSTR();
	}

	@Override
	public int getDEX()
	{
		return r.getDEX();
	}

	@Override
	public int getINT()
	{
		return r.getINT();
	}

	@Override
	public String getRaceName()
	{
		//will be overwritten
		return r.getRaceName();
	}

	@Override
	public String getJobName()
	{
		//will be overwritten
		return j.getJobName();
	}

}
