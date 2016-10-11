package ECUtils;

import static ECUtils.ECConst.SQLS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InstallDB  implements ECConst{
	/*public static void main(String[] args) {
		createDB();
				
		
	}*/
	
	public static void createDB(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://"+DB_HOST+":3306", DB_USER, DB_PASS);
			String sql;
			
			sql = "create schema if not exists " + DB_NAME;
                        PreparedStatement st = con.prepareStatement(sql);
			st = con.prepareStatement(sql);
			st.execute();
			con.close();		
			System.out.println(DB_NAME + " created");
                        for(String sql1 : SQLS)
			runSQL(sql1);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void runSQL(String sql){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://"+DB_HOST+":3306/"+DB_NAME, DB_USER, DB_PASS);
			PreparedStatement st = con.prepareStatement(sql);
			st.executeUpdate();
			con.close();
			System.out.println("sql completed!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
