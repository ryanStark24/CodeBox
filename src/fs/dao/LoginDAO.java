package fs.dao;

import static ECUtils.BaseDAO.closeCon;
import static ECUtils.BaseDAO.getCon;
import fs.bean.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Anshul Mehta
 */
public class LoginDAO {

    public boolean search(Login l) {
        boolean check = false;
        int k = 1, j = 0;
        Connection con = null;
        try {
            con = getCon();
            String sql = "select * from students  where Userid=?";
            PreparedStatement st = con.prepareStatement(sql);
            int i = 1;
            System.out.println(l.getUserid() + " " + l.getPassword() + " 2");
            st.setString(i++, l.getUserid());

            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                System.out.println(rs.getString("Userid") + " " + rs.getString("Password") + "rs");
                k = rs.getString("Userid").compareTo(l.getUserid());
                j = rs.getString("Password").compareTo(l.getPassword());
            }
            if (j == k) {

                check = true;

            } else {
                check = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
        return check;
    }

    public void submit(String Userid) {
        System.out.println(Userid + "submit");
        Login l = new Login();
        Connection con = null;
        try {
            con = getCon();
            String sql = "update students set Submit=1  where Userid=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Userid);

            st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }

    }

    public boolean getsubmit(String Userid) {
        Login l = new Login();
        Connection con = null;
        boolean k = false;
        try {
            con = getCon();
            String sql = "select Submit from students  where Userid=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Userid);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                k = rs.getBoolean("Submit");
            }
            System.out.println(k);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }

        return k;
    }

    public String getName(String Userid) {
        Login l = new Login();
        Connection con = null;
        String k = "";
        try {
            con = getCon();
            String sql = "select Name from students  where Userid=?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Userid);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                k = rs.getString("Name");
            }
            System.out.println(k);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }

        return k;
    }
}
