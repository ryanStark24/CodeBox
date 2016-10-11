package fs.dao;

import fs.bean.FSystem;
import static ECUtils.BaseDAO.closeCon;
import static ECUtils.BaseDAO.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.LinkedList;

public class FSDAO {

    public static void insert(FSystem p1) {
        Connection con = null;
        try {
            con = getCon();
            String sql = "insert into Fsystem "
                    + " (Teacher,Unit1,Unit2,Unit3,Unit4,Unit5) "
                    + " values (?, ?, ?, ?, ?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            int i = 1;
            st.setString(i++, p1.Teacher());
            st.setInt(i++, p1.Unit1());
            st.setInt(i++, p1.Unit2());
            st.setInt(i++, p1.Unit3());
            st.setInt(i++, p1.Unit4());
            st.setInt(i++, p1.Unit5());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
    }
    /*public static void update(FSystem p1){
	Connection con=null;
	try {
		con =getCon();
		String sql = "update Fsystem " +
		" set Teacher = ?, Unit1=?, Unit2=?, Unit3=?, Unit4=? ,Unit5=?" +
		" where  id = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		int i = 1;
		st.setString(i++, p1.Teacher());
		st.setInt(i++, p1.Unit1());
		st.setInt(i++, p1.Unit2());
		st.setInt(i++, p1.Unit3());
		st.setInt(i++, p1.Unit4());
		
                st.setInt(i++, p1.Unit5());
		st.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		closeCon(con);
	}
}
public static void delete(String id){
	Connection con=null;
	try {
		con =getCon();
		String sql = "delete from Fsystem  " +
		" where id =? ";
		PreparedStatement st = con.prepareStatement(sql);
		int i = 1;
		st.setString(i++, id);
		st.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		closeCon(con);
	}
}

public static LinkedList<FSystem> search(String sc, String si){
	LinkedList<FSystem> res = new LinkedList<FSystem>();
	Connection con=null;
	try {
		con =getCon();
		String sql = "select * from Fsystem  where "+ sc+" like ? ";
		PreparedStatement st = con.prepareStatement(sql);
		int i = 1;
		st.setString(i++, "%"+si+"%");
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			FSystem p1 = new FSystem();
			p1.setUnit2(rs.getInt("Unit2"));
			//p1.setId(rs.getString("id"));
			p1.setUnit3(rs.getInt("Unit3"));
			p1.setUnit1(rs.getInt("Unit1"));
			p1.setTeacher(rs.getString("Teacher"));
			p1.setUnit4(rs.getInt("Unit4"));
                        p1.setUnit5(rs.getInt("Unit5"));
			res.add(p1);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		closeCon(con);
	}
	return res;
}

public static FSystem findById(String id){
	FSystem res = null;
	Connection con=null;
	try {
		con =getCon();
		String sql = "select * from Fsystem  where id = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		int i = 1;
		st.setString(i++, id);
		ResultSet rs = st.executeQuery();
		if(rs.next()){
                        FSystem p1= new FSystem();
			p1.setUnit2(rs.getInt("Unit2"));
			//p1.setId(rs.getString("id"));
			p1.setUnit3(rs.getInt("Unit3"));
			p1.setUnit1(rs.getInt("Unit1"));
			p1.setTeacher(rs.getString("Teacher"));
			p1.setUnit4(rs.getInt("Unit4"));
                        p1.setUnit5(rs.getInt("Unit5"));
			res=p1;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		closeCon(con);
	}
	return res;
}*/
}
