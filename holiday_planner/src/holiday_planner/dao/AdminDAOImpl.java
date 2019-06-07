package holiday_planner.dao;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import holiday_planner.util.Db;
import holiday_planner.vo.Addpackages;
import holiday_planner.vo.Admin;

public class AdminDAOImpl implements AdminDAO
{

	@Override
	public int adminValidation(Admin a)
	{
		int result=0;
		try
		{
			PreparedStatement pst=(PreparedStatement) Db.getDb().prepareStatement("select * from admin");
			ResultSet rs=(ResultSet) pst.executeQuery();
			while(rs.next())
			{
				if(a.getName().equals(rs.getString(1)) && a.getPassword().equals(rs.getString(2)))
				{
					result=1;
				}
					
			}
		}catch(Exception e)
		{
			System.err.println(e);
		}
		return result;
	}
	public int passwordChange(Admin b) 
	{
		
		int result=0;
		try
		{
			PreparedStatement pst=(PreparedStatement) Db.getDb().prepareStatement("select * from admin");
			ResultSet rs=(ResultSet) pst.executeQuery();
			while(rs.next())
			{
				if(b.getPassword().equals(rs.getString(2)))
				{
			PreparedStatement pst1=(PreparedStatement) Db.getDb().prepareStatement("update admin set password='"+b.getName()+"' where name='"+rs.getString(1)+"'");
			result=pst1.executeUpdate();
				}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	@Override
	public int newPackages(Addpackages ap) 
	{
		int result = 0;
		try
		{
			PreparedStatement pst=(PreparedStatement) Db.getDb().prepareStatement(" insert into sourcedestination(source,destination,cost) values ('"+ap.getSource()+"','"+ap.getDestination()+"','"+ap.getCost()+"');");
		
			result = pst.executeUpdate();
					
					
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}
		return 0;
	}
}

