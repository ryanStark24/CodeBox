/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedbacksystem;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author DELL
 */
public interface utilities {
  String Icon="C:\\Users\\DELL\\Documents\\NetBeansProjects\\FeedBackSystem\\True.png";  
  String xampp_start="C:\\Users\\DELL\\Documents\\NetBeansProjects\\FeedBackSystem\\src\\xamppstart.bat";
  String xampp_kill="C:\\Users\\DELL\\Documents\\NetBeansProjects\\FeedBackSystem\\src\\xamppkill.bat";
   Path target= Paths.get("C:\\");
   Path source= Paths.get("C:\\");
    File sourceDir=new File("C:\\");
    File targetDir=new File("C:\\");
}
