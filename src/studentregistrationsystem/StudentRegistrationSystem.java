/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystem;
import javax.swing.JOptionPane;
/**
 *
 * @author Omolemo
 */
public class StudentRegistrationSystem {

   
    public static void main(String[] args) {
       int one =1;
       int two = 2;
       int three = 3;
       String studentNo = JOptionPane.showInputDialog(null,"Enter your student number","Login",JOptionPane.INFORMATION_MESSAGE);
       String password = JOptionPane.showInputDialog(null,"Enter your password","Login",JOptionPane.INFORMATION_MESSAGE);
       String error= JOptionPane.showInputDialog(null,"INVALID CREDENTIALS!" +"\n"+ "Ensure that you insert the correct login details","Data Input Error", JOptionPane.ERROR_MESSAGE);
       String university = JOptionPane.showInputDialog(null, 
                "Enter (1) to register for a course." + "\n"+
               "Enter (2) to view your smester results(electronic report card)" + "\n"+
               "Enter (3) to go to the previous screen" +"\n"+
               "Enter any other number to exit.");
       int selection = Integer.parseInt(university);
       
        switch (selection) {
            case 1:
                registration();
                break;
            case 2:
                report();
                break;
            case 3:
                registration();
                report();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Thank you for stopping by.Enjoy the rest of your day.");
                break;
        }
     
    }
     public static void registration()
              {
                  String name = JOptionPane.showInputDialog(null,"Please enter your Name & Surname","Registration",JOptionPane.QUESTION_MESSAGE);
                  String gender = JOptionPane.showInputDialog(null,"Are you male or female?","Registration",JOptionPane.QUESTION_MESSAGE);
                  String course = JOptionPane.showInputDialog(null,"Please enter the name of the course you want to study","Registration",JOptionPane.QUESTION_MESSAGE);
                  String num = JOptionPane.showInputDialog(null,"Please enter your Mobile Number","Registration",JOptionPane.QUESTION_MESSAGE);
                  double mobile =Double.parseDouble(num);
                  String num2 = JOptionPane.showInputDialog(null,"Please enter your alternative Mobile/Telephone Number","Registration",JOptionPane.QUESTION_MESSAGE);
                  double mobile2 =Double.parseDouble(num2);
                  String citizen = JOptionPane.showInputDialog(null,"Are you a South African Citizens?","Registration",JOptionPane.QUESTION_MESSAGE);
                  String registrationType = JOptionPane.showInputDialog(null,"Are you planning on studying Full Time or Part Time","Registration",JOptionPane.QUESTION_MESSAGE);
              }
       public static void report()
              {
                 JOptionPane.showMessageDialog(null,"Here are your Year-End marks for your qualification:"+"\n"
                         +"Bachelor in Information Technology in Business Systems"
                         +"\n"+" Module Code   " + "  Module Name  "+ "  Module Mark  "+
                              "\n----------------------------"+
                               "\nBMNG5122 " + " Business Management 1A " + " 67%"
                             + "\nBMNG5122 " + " Business Management 1B " + " 72%"
                         + "\nITPP5112" + " IT Professional Practice " + " 80% "
                         + "\nPRLD5121" + " Programming Logic & Design " + " 83% "
                         + "\nPROG5121" + " Programming " + " 92% "
                         + "\nQUAT6221" + " Quantitative Techniques " + " 75% "
                         + "\nSAND6221" + " System Analysis & Design " + " 94% "
                             + "\nWEDE5020" + " Web Development " + " 88% ",
                               "Report Card",JOptionPane.INFORMATION_MESSAGE);
              }
}
