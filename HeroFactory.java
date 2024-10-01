public class HeroFactory
{
   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   Job j = null;
	   Race r = null;
	   if(raceName=="DWARF")
	   {
		   r = new DWARF();
	   }
	   else if(raceName=="ELF")
	   {
		   r = new ELF();
	   }
	   else if(raceName=="ROBOT")
	   {
		   r = new ROBOT();
	   }
	   //now to job names
	   if(jobName=="WARRIOR")
	   {
		   j = new WARRIOR();
	   }
	   else if(jobName=="MAGE")
	   {
		   j = new MAGE();
	   }
	   else if(jobName=="ARCHER")
	   {
		   j = new ARCHER();
	   }
	   //what if there isn't a dwarf or elf or whatever
	   if(r==null || j==null)
	   {
		   return null;
	   }
	   else
	   {
	   Hero A = new Hero(r,j);
	   return A;
	   }
   }

}