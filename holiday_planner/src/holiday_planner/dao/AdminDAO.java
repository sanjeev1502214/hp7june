package holiday_planner.dao;

import holiday_planner.vo.Addpackages;
import holiday_planner.vo.Admin;

public interface AdminDAO 
{
	public int adminValidation(Admin a);
	
	public int passwordChange(Admin b);
	
	public int newPackages(Addpackages ap);

}
