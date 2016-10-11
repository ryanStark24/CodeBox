/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs.bean;


public class Login {
String Userid;
String Password;
boolean submit;

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

}
