package feedbacksystem;

import fs.bean.FSystem;
import fs.dao.FSDAO;
import fs.dao.LoginDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Anshul Mehta
 */
public class FXMLDocumentController implements Initializable, utilities {
    static int pass;
    ArrayList<Integer> al = new ArrayList<>();
    ArrayList<Integer> bl = new ArrayList<>();
    ArrayList<Integer> cl = new ArrayList<>();
    ArrayList<Integer> dl = new ArrayList<>();
    ArrayList<Integer> el = new ArrayList<>();

    HashMap A = new HashMap();
    HashMap B = new HashMap();
    HashMap C = new HashMap();
    HashMap D = new HashMap();
    HashMap E = new HashMap();
    final ToggleGroup groupA1 = new ToggleGroup();
    final ToggleGroup groupA2 = new ToggleGroup();
    final ToggleGroup groupA3 = new ToggleGroup();
    final ToggleGroup groupA4 = new ToggleGroup();
    final ToggleGroup groupA5 = new ToggleGroup();
    final ToggleGroup groupA6 = new ToggleGroup();
    final ToggleGroup groupB1 = new ToggleGroup();
    final ToggleGroup groupB2 = new ToggleGroup();
    final ToggleGroup groupB3 = new ToggleGroup();
    final ToggleGroup groupB4 = new ToggleGroup();
    final ToggleGroup groupB5 = new ToggleGroup();
    final ToggleGroup groupB6 = new ToggleGroup();
    final ToggleGroup groupB7 = new ToggleGroup();
    final ToggleGroup groupC1 = new ToggleGroup();
    final ToggleGroup groupC2 = new ToggleGroup();
    final ToggleGroup groupC3 = new ToggleGroup();
    final ToggleGroup groupC4 = new ToggleGroup();
    final ToggleGroup groupC5 = new ToggleGroup();
    final ToggleGroup groupC6 = new ToggleGroup();
    final ToggleGroup groupD1 = new ToggleGroup();
    final ToggleGroup groupD2 = new ToggleGroup();
    final ToggleGroup groupD3 = new ToggleGroup();
    final ToggleGroup groupD4 = new ToggleGroup();
    final ToggleGroup groupE1 = new ToggleGroup();
    final ToggleGroup groupE2 = new ToggleGroup();
    final ToggleGroup groupE3 = new ToggleGroup();
    final ToggleGroup groupE4 = new ToggleGroup();
    final ToggleGroup groupE5 = new ToggleGroup();
    final ToggleGroup groupE6 = new ToggleGroup();

    @FXML
    private Label teacher;
    @FXML
    private Label subject;
    @FXML
    private Label session;
    @FXML
    private Button submit;
    @FXML
    private RadioButton rb111;
    @FXML
    private RadioButton rb112;
    @FXML
    private RadioButton rb113;
    @FXML
    private RadioButton rb114;
    @FXML
    private RadioButton rb115;
    @FXML
    private CheckBox chk11;
    @FXML
    private RadioButton rb121;
    @FXML
    private RadioButton rb122;
    @FXML
    private RadioButton rb123;
    @FXML
    private RadioButton rb124;
    @FXML
    private RadioButton rb125;
    @FXML
    private CheckBox chk12;
    @FXML
    private RadioButton rb131;
    @FXML
    private RadioButton rb132;
    @FXML
    private RadioButton rb133;
    @FXML
    private RadioButton rb134;
    @FXML
    private RadioButton rb135;
    @FXML
    private CheckBox chk13;
    @FXML
    private RadioButton rb141;
    @FXML
    private RadioButton rb142;
    @FXML
    private RadioButton rb143;
    @FXML
    private RadioButton rb144;
    @FXML
    private RadioButton rb145;
    @FXML
    private CheckBox chk14;
    @FXML
    private RadioButton rb151;
    @FXML
    private RadioButton rb152;
    @FXML
    private RadioButton rb153;
    @FXML
    private RadioButton rb154;
    @FXML
    private RadioButton rb155;
    @FXML
    private CheckBox chk15;
    @FXML
    private RadioButton rb161;
    @FXML
    private RadioButton rb162;
    @FXML
    private RadioButton rb163;
    @FXML
    private RadioButton rb164;
    @FXML
    private RadioButton rb165;
    @FXML
    private CheckBox chk16;
    @FXML
    private RadioButton rb211;
    @FXML
    private RadioButton rb212;
    @FXML
    private RadioButton rb213;
    @FXML
    private RadioButton rb214;
    @FXML
    private RadioButton rb215;
    @FXML
    private CheckBox chk21;
    @FXML
    private RadioButton rb221;
    @FXML
    private RadioButton rb222;
    @FXML
    private RadioButton rb223;
    @FXML
    private RadioButton rb224;
    @FXML
    private RadioButton rb225;
    @FXML
    private CheckBox chk22;
    @FXML
    private RadioButton rb231;
    @FXML
    private RadioButton rb232;
    @FXML
    private RadioButton rb233;
    @FXML
    private RadioButton rb234;
    @FXML
    private RadioButton rb235;
    @FXML
    private CheckBox chk23;
    @FXML
    private RadioButton rb242;
    @FXML
    private RadioButton rb243;
    @FXML
    private RadioButton rb244;
    @FXML
    private RadioButton rb245;
    @FXML
    private CheckBox chk24;
    @FXML
    private RadioButton rb251;
    @FXML
    private RadioButton rb252;
    @FXML
    private RadioButton rb253;
    @FXML
    private RadioButton rb254;
    @FXML
    private RadioButton rb255;
    @FXML
    private CheckBox chk25;
    @FXML
    private RadioButton rb261;
    @FXML
    private RadioButton rb262;
    @FXML
    private RadioButton rb263;
    @FXML
    private RadioButton rb264;
    @FXML
    private RadioButton rb265;
    @FXML
    private CheckBox chk26;
    @FXML
    private RadioButton rb271;
    @FXML
    private RadioButton rb272;
    @FXML
    private RadioButton rb273;
    @FXML
    private RadioButton rb274;
    @FXML
    private RadioButton rb275;
    @FXML
    private CheckBox chk27;
    @FXML
    private RadioButton rb311;
    @FXML
    private RadioButton rb312;
    @FXML
    private RadioButton rb313;
    @FXML
    private RadioButton rb314;
    @FXML
    private RadioButton rb315;
    @FXML
    private CheckBox chk31;
    @FXML
    private RadioButton rb321;
    @FXML
    private RadioButton rb322;
    @FXML
    private RadioButton rb323;
    @FXML
    private RadioButton rb324;
    @FXML
    private RadioButton rb325;
    @FXML
    private CheckBox chk32;
    @FXML
    private RadioButton rb331;
    @FXML
    private RadioButton rb332;
    @FXML
    private RadioButton rb333;
    @FXML
    private RadioButton rb334;
    @FXML
    private RadioButton rb335;
    @FXML
    private CheckBox chk33;
    @FXML
    private RadioButton rb341;
    @FXML
    private RadioButton rb342;
    @FXML
    private RadioButton rb343;
    @FXML
    private RadioButton rb344;
    @FXML
    private RadioButton rb345;
    @FXML
    private CheckBox chk34;
    @FXML
    private RadioButton rb351;
    @FXML
    private RadioButton rb352;
    @FXML
    private RadioButton rb353;
    @FXML
    private RadioButton rb354;
    @FXML
    private RadioButton rb355;
    @FXML
    private CheckBox chk35;
    @FXML
    private RadioButton rb361;
    @FXML
    private RadioButton rb362;
    @FXML
    private RadioButton rb363;
    @FXML
    private RadioButton rb364;
    @FXML
    private RadioButton rb365;
    @FXML
    private CheckBox chk36;
    @FXML
    private RadioButton rb411;
    @FXML
    private RadioButton rb412;
    @FXML
    private RadioButton rb413;
    @FXML
    private RadioButton rb414;
    @FXML
    private RadioButton rb415;
    @FXML
    private CheckBox chk41;
    @FXML
    private RadioButton rb421;
    @FXML
    private RadioButton rb422;
    @FXML
    private RadioButton rb423;
    @FXML
    private RadioButton rb424;
    @FXML
    private RadioButton rb425;
    @FXML
    private CheckBox chk42;
    @FXML
    private RadioButton rb431;
    @FXML
    private RadioButton rb432;
    @FXML
    private RadioButton rb433;
    @FXML
    private RadioButton rb434;
    @FXML
    private RadioButton rb435;
    @FXML
    private CheckBox chk43;
    @FXML
    private RadioButton rb441;
    @FXML
    private RadioButton rb442;
    @FXML
    private RadioButton rb443;
    @FXML
    private RadioButton rb444;
    @FXML
    private RadioButton rb445;
    @FXML
    private CheckBox chk44;
    @FXML
    private RadioButton rb511;
    @FXML
    private RadioButton rb512;
    @FXML
    private RadioButton rb513;
    @FXML
    private RadioButton rb514;
    @FXML
    private RadioButton rb515;
    @FXML
    private CheckBox chk51;
    @FXML
    private RadioButton rb521;
    @FXML
    private RadioButton rb522;
    @FXML
    private RadioButton rb523;
    @FXML
    private RadioButton rb524;
    @FXML
    private RadioButton rb525;
    @FXML
    private CheckBox chk52;
    @FXML
    private RadioButton rb531;
    @FXML
    private RadioButton rb532;
    @FXML
    private RadioButton rb533;
    @FXML
    private RadioButton rb534;
    @FXML
    private RadioButton rb535;
    @FXML
    private CheckBox chk53;
    @FXML
    private RadioButton rb541;
    @FXML
    private RadioButton rb542;
    @FXML
    private RadioButton rb543;
    @FXML
    private RadioButton rb544;
    @FXML
    private RadioButton rb545;
    @FXML
    private CheckBox chk54;
    @FXML
    private RadioButton rb551;
    @FXML
    private RadioButton rb552;
    @FXML
    private RadioButton rb553;
    @FXML
    private RadioButton rb554;
    @FXML
    private RadioButton rb555;
    @FXML
    private CheckBox chk55;
    @FXML
    private RadioButton rb561;
    @FXML
    private RadioButton rb562;
    @FXML
    private RadioButton rb563;
    @FXML
    private RadioButton rb564;
    @FXML
    private RadioButton rb565;
    @FXML
    private CheckBox chk56;
    @FXML
    private Label ermsg;
    @FXML
    private Label Name;
    @FXML
    private AnchorPane page1;
    @FXML
    private RadioButton rb241;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        LoginDAO ld = new LoginDAO();
        FSystem fs = new FSystem();
        System.out.println(LoginFXMLController.Userid);
        
               
                if (event.getSource() == submit) {

            System.out.println(A + "" + B + "" + C + "" + D + "" + E + "" + al);
            if ((A.size() >= 6) && (B.size() >= 7) && (C.size() >= 6) && (D.size() >= 4) && (E.size() >= 6)) {
                Setup();
                fs.calculate(al, bl, cl, dl, el);
                fs.setTeacher("Mr. Govind Singh");
                FSDAO.insert(fs);
                System.out.println("success" + fs.Unit1() + " " + fs.Unit2() + " " + fs.Unit3() + " " + fs.Unit4() + " " + fs.Unit5() + " FX");

                ld.submit(LoginFXMLController.Userid);
               SceneChanger();
            } else {
                ermsg.setText("All Fields Not Selected!!");
            }

        }

    }

    void Setup() {
        al.clear();
        bl.clear();
        cl.clear();
        dl.clear();
        el.clear();
        al.add((Integer) groupA1.getSelectedToggle().getUserData());
        al.add((Integer) groupA2.getSelectedToggle().getUserData());
        al.add((Integer) groupA3.getSelectedToggle().getUserData());

        al.add((Integer) groupA4.getSelectedToggle().getUserData());
        al.add((Integer) groupA5.getSelectedToggle().getUserData());
        al.add((Integer) groupA6.getSelectedToggle().getUserData());
        bl.add((Integer) groupB1.getSelectedToggle().getUserData());
        bl.add((Integer) groupB2.getSelectedToggle().getUserData());
        bl.add((Integer) groupB3.getSelectedToggle().getUserData());
        bl.add((Integer) groupB4.getSelectedToggle().getUserData());
        bl.add((Integer) groupB5.getSelectedToggle().getUserData());
        bl.add((Integer) groupB6.getSelectedToggle().getUserData());
        bl.add((Integer) groupB7.getSelectedToggle().getUserData());
        cl.add((Integer) groupC1.getSelectedToggle().getUserData());
        cl.add((Integer) groupC2.getSelectedToggle().getUserData());
        cl.add((Integer) groupC3.getSelectedToggle().getUserData());
        cl.add((Integer) groupC4.getSelectedToggle().getUserData());
        cl.add((Integer) groupC5.getSelectedToggle().getUserData());
        cl.add((Integer) groupC6.getSelectedToggle().getUserData());
        dl.add((Integer) groupD1.getSelectedToggle().getUserData());
        dl.add((Integer) groupD2.getSelectedToggle().getUserData());
        dl.add((Integer) groupD3.getSelectedToggle().getUserData());
        dl.add((Integer) groupD4.getSelectedToggle().getUserData());
        el.add((Integer) groupE1.getSelectedToggle().getUserData());
        el.add((Integer) groupE2.getSelectedToggle().getUserData());
        el.add((Integer) groupE3.getSelectedToggle().getUserData());
        el.add((Integer) groupE4.getSelectedToggle().getUserData());
        el.add((Integer) groupE5.getSelectedToggle().getUserData());
        el.add((Integer) groupE6.getSelectedToggle().getUserData());
    }

    void SceneChanger() throws IOException {
        Stage stage;
        pass=1;
        Parent root;
        
        stage = (Stage) submit.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("exitFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("FEEDBACK SYSTEM");
        stage.setResizable(false);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        System.out.println("Started Feedback:FXMLDocument");
        Name.setText("Welcome " + new LoginDAO().getName(LoginFXMLController.Userid));
        teacher.setText("Mr. Govind Singh");
        session.setText("OCT-16");
        subject.setText("Analysis & Design of Algorithms");
        groupA();
        groupB();
        groupC();
        groupD();
        groupE();
    }

    void groupA() {
        {

            rb111.setToggleGroup(groupA1);
            rb112.setToggleGroup(groupA1);
            rb113.setToggleGroup(groupA1);
            rb114.setToggleGroup(groupA1);
            rb115.setToggleGroup(groupA1);
            rb111.setUserData(1);
            rb112.setUserData(2);
            rb113.setUserData(3);
            rb114.setUserData(4);
            rb115.setUserData(5);
            groupA1.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA1.getSelectedToggle() != null) {
                    chk11.setSelected(true);
                    A.put(1, 1);
                }
            });
        }

        {

            rb121.setToggleGroup(groupA2);
            rb122.setToggleGroup(groupA2);
            rb123.setToggleGroup(groupA2);
            rb124.setToggleGroup(groupA2);
            rb125.setToggleGroup(groupA2);
            rb121.setUserData(1);
            rb122.setUserData(2);
            rb123.setUserData(3);
            rb124.setUserData(4);
            rb125.setUserData(5);
            groupA2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA2.getSelectedToggle() != null) {
                    chk12.setSelected(true);
                    A.put(2, 1);
                }
            });
        }
        {

            rb131.setToggleGroup(groupA3);
            rb132.setToggleGroup(groupA3);
            rb133.setToggleGroup(groupA3);
            rb134.setToggleGroup(groupA3);
            rb135.setToggleGroup(groupA3);
            rb131.setUserData(1);
            rb132.setUserData(2);
            rb133.setUserData(3);
            rb134.setUserData(4);
            rb135.setUserData(5);
            groupA3.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA3.getSelectedToggle() != null) {
                    chk13.setSelected(true);
                    A.put(3, 1);
                }
            });
        }

        {

            rb141.setToggleGroup(groupA4);
            rb142.setToggleGroup(groupA4);
            rb143.setToggleGroup(groupA4);
            rb144.setToggleGroup(groupA4);
            rb145.setToggleGroup(groupA4);
            rb141.setUserData(1);
            rb142.setUserData(2);
            rb143.setUserData(3);
            rb144.setUserData(4);
            rb145.setUserData(5);
            groupA4.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA4.getSelectedToggle() != null) {
                    chk14.setSelected(true);
                    A.put(4, 1);
                }
            });
        }
        {

            rb151.setToggleGroup(groupA5);
            rb152.setToggleGroup(groupA5);
            rb153.setToggleGroup(groupA5);
            rb154.setToggleGroup(groupA5);
            rb155.setToggleGroup(groupA5);
            rb151.setUserData(1);
            rb152.setUserData(2);
            rb153.setUserData(3);
            rb154.setUserData(4);
            rb155.setUserData(5);
            groupA5.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA5.getSelectedToggle() != null) {
                    chk15.setSelected(true);
                    A.put(5, 1);
                }
            });
        }
        {

            rb161.setToggleGroup(groupA6);
            rb162.setToggleGroup(groupA6);
            rb163.setToggleGroup(groupA6);
            rb164.setToggleGroup(groupA6);
            rb165.setToggleGroup(groupA6);
            rb161.setUserData(1);
            rb162.setUserData(2);
            rb163.setUserData(3);
            rb164.setUserData(4);
            rb165.setUserData(5);
            groupA6.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupA6.getSelectedToggle() != null) {
                    chk16.setSelected(true);
                    A.put(6, 1);
                }
            });
        }
    }

    void groupB() {

        {

            rb211.setToggleGroup(groupB1);
            rb212.setToggleGroup(groupB1);
            rb213.setToggleGroup(groupB1);
            rb214.setToggleGroup(groupB1);
            rb215.setToggleGroup(groupB1);
            rb211.setUserData(1);
            rb212.setUserData(2);
            rb213.setUserData(3);
            rb214.setUserData(4);
            rb215.setUserData(5);
            groupB1.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB1.getSelectedToggle() != null) {
                    chk21.setSelected(true);
                    B.put(1, 1);
                }
            });
        }

        {

            rb221.setToggleGroup(groupB2);
            rb222.setToggleGroup(groupB2);
            rb223.setToggleGroup(groupB2);
            rb224.setToggleGroup(groupB2);
            rb225.setToggleGroup(groupB2);
            rb221.setUserData(1);
            rb222.setUserData(2);
            rb223.setUserData(3);
            rb224.setUserData(4);
            rb225.setUserData(5);
            groupB2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB2.getSelectedToggle() != null) {
                    chk22.setSelected(true);
                    B.put(2, 1);
                }
            });
        }
        {

            rb231.setToggleGroup(groupB3);
            rb232.setToggleGroup(groupB3);
            rb233.setToggleGroup(groupB3);
            rb234.setToggleGroup(groupB3);
            rb235.setToggleGroup(groupB3);
            rb231.setUserData(1);
            rb232.setUserData(2);
            rb233.setUserData(3);
            rb234.setUserData(4);
            rb235.setUserData(5);
            groupB3.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB3.getSelectedToggle() != null) {
                    chk23.setSelected(true);
                    B.put(3, 1);
                }
            });
        }

        {

            rb341.setToggleGroup(groupB4);
            rb242.setToggleGroup(groupB4);
            rb243.setToggleGroup(groupB4);
            rb244.setToggleGroup(groupB4);
            rb245.setToggleGroup(groupB4);
            rb341.setUserData(1);
            rb242.setUserData(2);
            rb243.setUserData(3);
            rb244.setUserData(4);
            rb245.setUserData(5);
            groupB4.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB4.getSelectedToggle() != null) {
                    chk24.setSelected(true);
                    B.put(4, 1);
                }
            });
        }
        {

            rb251.setToggleGroup(groupB5);
            rb252.setToggleGroup(groupB5);
            rb253.setToggleGroup(groupB5);
            rb254.setToggleGroup(groupB5);
            rb255.setToggleGroup(groupB5);
            rb251.setUserData(1);
            rb252.setUserData(2);
            rb253.setUserData(3);
            rb254.setUserData(4);
            rb255.setUserData(5);
            groupB5.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB5.getSelectedToggle() != null) {
                    chk25.setSelected(true);
                    B.put(5, 1);
                }
            });
        }
        {

            rb261.setToggleGroup(groupB6);
            rb262.setToggleGroup(groupB6);
            rb263.setToggleGroup(groupB6);
            rb264.setToggleGroup(groupB6);
            rb265.setToggleGroup(groupB6);
            rb261.setUserData(1);
            rb262.setUserData(2);
            rb263.setUserData(3);
            rb264.setUserData(4);
            rb265.setUserData(5);
            groupB6.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB6.getSelectedToggle() != null) {
                    chk26.setSelected(true);
                    B.put(6, 1);
                }
            });
        }
        {

            rb271.setToggleGroup(groupB7);
            rb272.setToggleGroup(groupB7);
            rb273.setToggleGroup(groupB7);
            rb274.setToggleGroup(groupB7);
            rb275.setToggleGroup(groupB7);
            rb271.setUserData(1);
            rb272.setUserData(2);
            rb273.setUserData(3);
            rb274.setUserData(4);
            rb275.setUserData(5);
            groupB7.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupB7.getSelectedToggle() != null) {
                    chk27.setSelected(true);
                    B.put(7, 1);
                }
            });
        }
    }

    void groupC() {
        {

            rb311.setToggleGroup(groupC1);
            rb312.setToggleGroup(groupC1);
            rb313.setToggleGroup(groupC1);
            rb314.setToggleGroup(groupC1);
            rb315.setToggleGroup(groupC1);
            rb311.setUserData(1);
            rb312.setUserData(2);
            rb313.setUserData(3);
            rb314.setUserData(4);
            rb315.setUserData(5);
            groupC1.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC1.getSelectedToggle() != null) {
                    chk31.setSelected(true);
                    C.put(1, 1);
                }
            });
        }

        {

            rb321.setToggleGroup(groupC2);
            rb322.setToggleGroup(groupC2);
            rb323.setToggleGroup(groupC2);
            rb324.setToggleGroup(groupC2);
            rb325.setToggleGroup(groupC2);
            rb321.setUserData(1);
            rb322.setUserData(2);
            rb323.setUserData(3);
            rb324.setUserData(4);
            rb325.setUserData(5);
            groupC2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC2.getSelectedToggle() != null) {
                    chk32.setSelected(true);
                    C.put(2, 1);
                }
            });
        }
        {

            rb331.setToggleGroup(groupC3);
            rb332.setToggleGroup(groupC3);
            rb333.setToggleGroup(groupC3);
            rb334.setToggleGroup(groupC3);
            rb335.setToggleGroup(groupC3);
            rb331.setUserData(1);
            rb332.setUserData(2);
            rb333.setUserData(3);
            rb334.setUserData(4);
            rb335.setUserData(5);
            groupC3.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC3.getSelectedToggle() != null) {
                    chk33.setSelected(true);
                    C.put(3, 1);
                }
            });
        }

        {

            rb341.setToggleGroup(groupC4);
            rb342.setToggleGroup(groupC4);
            rb343.setToggleGroup(groupC4);
            rb344.setToggleGroup(groupC4);
            rb345.setToggleGroup(groupC4);
            rb341.setUserData(1);
            rb342.setUserData(2);
            rb343.setUserData(3);
            rb344.setUserData(4);
            rb345.setUserData(5);
            groupC4.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC4.getSelectedToggle() != null) {
                    chk34.setSelected(true);
                    C.put(4, 1);
                }
            });
        }
        {

            rb351.setToggleGroup(groupC5);
            rb352.setToggleGroup(groupC5);
            rb353.setToggleGroup(groupC5);
            rb354.setToggleGroup(groupC5);
            rb355.setToggleGroup(groupC5);
            rb351.setUserData(1);
            rb352.setUserData(2);
            rb353.setUserData(3);
            rb354.setUserData(4);
            rb355.setUserData(5);
            groupC5.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC5.getSelectedToggle() != null) {
                    chk35.setSelected(true);
                    C.put(5, 1);
                }
            });
        }
        {

            rb361.setToggleGroup(groupC6);
            rb362.setToggleGroup(groupC6);
            rb363.setToggleGroup(groupC6);
            rb364.setToggleGroup(groupC6);
            rb365.setToggleGroup(groupC6);
            rb361.setUserData(1);
            rb362.setUserData(2);
            rb363.setUserData(3);
            rb364.setUserData(4);
            rb365.setUserData(5);
            groupC6.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupC6.getSelectedToggle() != null) {
                    chk36.setSelected(true);
                    C.put(6, 1);
                }
            });
        }

    }

    void groupD() {

        {
            rb411.setToggleGroup(groupD1);
            rb412.setToggleGroup(groupD1);
            rb413.setToggleGroup(groupD1);
            rb414.setToggleGroup(groupD1);
            rb415.setToggleGroup(groupD1);
            rb411.setUserData(1);
            rb412.setUserData(2);
            rb413.setUserData(3);
            rb414.setUserData(4);
            rb415.setUserData(5);
            groupD1.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupD1.getSelectedToggle() != null) {
                    chk41.setSelected(true);
                    D.put(1, 1);
                }
            });
        }

        {

            rb421.setToggleGroup(groupD2);
            rb422.setToggleGroup(groupD2);
            rb423.setToggleGroup(groupD2);
            rb424.setToggleGroup(groupD2);
            rb425.setToggleGroup(groupD2);
            rb421.setUserData(1);
            rb422.setUserData(2);
            rb423.setUserData(3);
            rb424.setUserData(4);
            rb425.setUserData(5);
            groupD2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupD2.getSelectedToggle() != null) {
                    chk42.setSelected(true);
                    D.put(2, 1);
                }
            });
        }
        {

            rb431.setToggleGroup(groupD3);
            rb432.setToggleGroup(groupD3);
            rb433.setToggleGroup(groupD3);
            rb434.setToggleGroup(groupD3);
            rb435.setToggleGroup(groupD3);
            rb431.setUserData(1);
            rb432.setUserData(2);
            rb433.setUserData(3);
            rb434.setUserData(4);
            rb435.setUserData(5);
            groupD3.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupD3.getSelectedToggle() != null) {
                    chk43.setSelected(true);
                    D.put(3, 1);
                }
            });
        }

        {

            rb441.setToggleGroup(groupD4);
            rb442.setToggleGroup(groupD4);
            rb443.setToggleGroup(groupD4);
            rb444.setToggleGroup(groupD4);
            rb445.setToggleGroup(groupD4);
            rb441.setUserData(1);
            rb442.setUserData(2);
            rb443.setUserData(3);
            rb444.setUserData(4);
            rb445.setUserData(5);
            groupD4.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupD4.getSelectedToggle() != null) {
                    chk44.setSelected(true);
                    D.put(4, 1);
                }
            });
        }
    }

    void groupE() {
        {

            rb511.setToggleGroup(groupE1);
            rb512.setToggleGroup(groupE1);
            rb513.setToggleGroup(groupE1);
            rb514.setToggleGroup(groupE1);
            rb515.setToggleGroup(groupE1);
            rb511.setUserData(1);
            rb512.setUserData(2);
            rb513.setUserData(3);
            rb514.setUserData(4);
            rb515.setUserData(5);
            groupE1.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE1.getSelectedToggle() != null) {
                    chk51.setSelected(true);
                    E.put(1, 1);
                }
            });
        }

        {

            rb521.setToggleGroup(groupE2);
            rb522.setToggleGroup(groupE2);
            rb523.setToggleGroup(groupE2);
            rb524.setToggleGroup(groupE2);
            rb525.setToggleGroup(groupE2);
            rb521.setUserData(1);
            rb522.setUserData(2);
            rb523.setUserData(3);
            rb524.setUserData(4);
            rb525.setUserData(5);
            groupE2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE2.getSelectedToggle() != null) {
                    chk52.setSelected(true);
                    E.put(2, 1);
                }
            });
        }
        {

            rb531.setToggleGroup(groupE3);
            rb532.setToggleGroup(groupE3);
            rb533.setToggleGroup(groupE3);
            rb534.setToggleGroup(groupE3);
            rb535.setToggleGroup(groupE3);
            rb531.setUserData(1);
            rb532.setUserData(2);
            rb533.setUserData(3);
            rb534.setUserData(4);
            rb535.setUserData(5);
            groupE3.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE3.getSelectedToggle() != null) {
                    chk53.setSelected(true);
                    E.put(3, 1);
                }
            });
        }

        {

            rb541.setToggleGroup(groupE4);
            rb542.setToggleGroup(groupE4);
            rb543.setToggleGroup(groupE4);
            rb544.setToggleGroup(groupE4);
            rb545.setToggleGroup(groupE4);
            rb541.setUserData(1);
            rb542.setUserData(2);
            rb543.setUserData(3);
            rb544.setUserData(4);
            rb545.setUserData(5);
            groupE4.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE4.getSelectedToggle() != null) {
                    chk54.setSelected(true);
                    E.put(4, 1);
                }
            });
        }
        {

            rb551.setToggleGroup(groupE5);
            rb552.setToggleGroup(groupE5);
            rb553.setToggleGroup(groupE5);
            rb554.setToggleGroup(groupE5);
            rb555.setToggleGroup(groupE5);
            rb551.setUserData(1);
            rb552.setUserData(2);
            rb553.setUserData(3);
            rb554.setUserData(4);
            rb555.setUserData(5);
            groupE5.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE5.getSelectedToggle() != null) {
                    chk55.setSelected(true);
                    E.put(5, 1);
                }
            });
        }
        {

            rb561.setToggleGroup(groupE6);
            rb562.setToggleGroup(groupE6);
            rb563.setToggleGroup(groupE6);
            rb564.setToggleGroup(groupE6);
            rb565.setToggleGroup(groupE6);
            rb561.setUserData(1);
            rb562.setUserData(2);
            rb563.setUserData(3);
            rb564.setUserData(4);
            rb565.setUserData(5);
            groupE6.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) -> {
                if (groupE6.getSelectedToggle() != null) {
                    chk56.setSelected(true);
                    E.put(6, 1);
                }
            });
        }

    }

}
