package feedbacksystem;

import ECUtils.InstallDB;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Anshul Mehta
 */
public class FeedBackSystem extends Application implements utilities {


  
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("program started:LoginFXML");
        
        /*if(!Files.exists(target))
        {copyDirectory(sourceDir, targetDir);
            System.out.println("xampp copied");
        }*/
        
            xampp_start();
        
        Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("FEEDBACK SYSTEM");
        //stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        InstallDB.createDB();
        
        stage.setOnCloseRequest(event -> {
            xampp_kill();
        });

    }

    public static void main(String[] args) {
        launch(args);
        
    }

    public static boolean isProcessRunning(String processName) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("tasklist.exe");
        Process process = processBuilder.start();
        String tasksList = toString(process.getInputStream());

        return tasksList.contains(processName);
    }

    private static String toString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        String string = scanner.hasNext() ? scanner.next() : "";
        System.out.println(string);
        scanner.close();

        return string;
    }

    public static void xampp_start() throws IOException, InterruptedException {

        if (!isProcessRunning("xampp-control")) {                               //to check if xampp is already active or not
            File file = new File(xampp_start);
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
            System.out.println("xampp Started");
        } else {
            System.out.println("xampp Already Active");
        }
    }

    public static void xampp_kill() {
        final File file1 = new File(xampp_kill);
        final Desktop desktop1 = Desktop.getDesktop();

        if (file1.exists()) {
            try {
                
                desktop1.open(file1);
            } catch (IOException ex) {
                Logger.getLogger(FeedBackSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("xampp killed");
    }
   
/*public static void copyDirectory(File sourceDir, File targetDir)
 throws IOException {
        if (sourceDir.isDirectory()) {
            copyDirectoryRecursively(sourceDir, targetDir);
        } else {
            Files.copy(sourceDir.toPath(), targetDir.toPath());
        }
    }
// recursive method to copy directory and sub-diretory in Java
private static void copyDirectoryRecursively(File source, File target)
 throws IOException {
        if (!target.exists()) {
            target.mkdir();
        }

        for (String child : source.list()) {
            copyDirectory(new File(source, child), new File(target, child));
        }
    }

*/




}
