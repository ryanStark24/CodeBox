/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs.bean;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class FSystem {

    String Teacher;
    
    int Unit1;
    int Unit2;
    int Unit3;
    int Unit4;
    int Unit5;

    public String Teacher() {
        return Teacher;
    }

    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }

    public int Unit1() {
        return Unit1;
    }

    public void setUnit1(int Unit1) {
        this.Unit1 = Unit1;
    }

    public int Unit2() {
        return Unit2;
    }

    public void setUnit2(int Unit2) {
        this.Unit2 = Unit2;
    }

    public int Unit3() {
        return Unit3;
    }

    public void setUnit3(int Unit3) {
        this.Unit3 = Unit3;
    }

    public int Unit4() {
        return Unit4;
    }

    public void setUnit4(int Unit4) {
        this.Unit4 = Unit4;
    }

    public int Unit5() {
        return Unit5;
    }

    public void setUnit5(int Unit5) {
        this.Unit5 = Unit5;
    }

    

    public void calculate(ArrayList<Integer> ar,ArrayList<Integer> br,ArrayList<Integer> cr,ArrayList<Integer> dr,ArrayList<Integer> er) {
       
        int sum=0;
        for(int i=0;i<ar.size();i++){
            sum=sum+ar.get(i);
        }
        setUnit1(sum/6);
        sum=0;
        for(int i=0;i<br.size();i++){
            sum=sum+br.get(i);
        }
        setUnit2(sum/7);
        sum=0;
        System.out.println(br);
        for(int i=0;i<cr.size();i++){
            sum=sum+cr.get(i);
        }
        setUnit3(sum/6);
        sum=0;
        for(int i=0;i<dr.size();i++){
            sum=sum+dr.get(i);
        }
        setUnit4(sum/4);
        sum=0;
        for(int i=0;i<er.size();i++){
            sum=sum+er.get(i);
        }
        setUnit5(sum/6);
        System.out.println(Unit1()+""+Unit2()+""+Unit3()+""+Unit4()+""+Unit5());
    }
}
