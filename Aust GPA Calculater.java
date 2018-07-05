package asif;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class StudentGrade extends JFrame{
	
	 
	private static final long serialVersionUID = 1L;


	private JPanel inputGradePanel;
	
	
	private JLabel nameLabel;
	private JTextField nameTextField;
	
	private JLabel theory1Label;
	private JTextField theory1TextField;
	
	private JLabel theory2Label;
	private JTextField theory2TextField;
	
	private JLabel theory3Label;
	private JTextField theory3TextField;
	
	private JLabel theory4Label;
	private JTextField theory4TextField;
	
	private JLabel theory5Label;
	private JTextField theory5TextField;
	
	
	private JLabel lab1Label;
	private JTextField lab1TextField;
	
	private JLabel lab2Label;
	private JTextField lab2TextField;
	
	private JLabel lab3Label;
	private JTextField lab3TextField;
	
	private JLabel lab4Label;
	private JTextField lab4TextField;
	
	
	private JButton submitGradesJButton;
	
	
	private JLabel displayJLabel;
	private JTextArea displayJTextArea;
	
	private int studentcount = 0;
	
	private final int NUMBER_OF_TESTS = 9;
	private final int MAXIMUM_STUDENTS = 10;
	private final int FIRST_TEST = 0;
	private final int SECOND_TEST = 1;
	private final int THIRD_TEST = 2;
	private final int FOURTH_TEST = 3;
	private final int FIFTH_TEST = 4;
	private final int FIRST_LAB = 5;
	private final int SECOND_LAB = 6;
	private final int THIRD_LAB = 7;
	private final int FOURTH_LAB = 8;
	
	
	private String studentsNames[]  =  new String[MAXIMUM_STUDENTS];
	
	private int studentsGrades[][]  = new int[MAXIMUM_STUDENTS][NUMBER_OF_TESTS];
	
	
	// DecimalFormat for two digits of precision
	private DecimalFormat twoDigits = new DecimalFormat("0.00");
	
	
	
	public StudentGrade(){
		
		createUserInterface();
	}
	
	
	private void createUserInterface(){
		
		Container contentPane = getContentPane();    // get content pane for attaching GUI components
													// a container can hold any kind of components maybe? // jFrame is a type of container
		
										  // enable explicit positioning of GUI components 
	    contentPane.setLayout( null );   //null layout means absolute positioning - you have to do all the work in your code
	    								//no layout manager to help you out
	    
	    
	    getContentPane().setBackground(Color.darkGray);
	    
	    inputGradePanel = new JPanel();
	    inputGradePanel.setBounds(16, 16, 210, 318+30);
	    
	    inputGradePanel.setBackground(Color.black);
	    
	    inputGradePanel.setBorder( new TitledBorder( "Input Numbers" ) );
	    inputGradePanel.setLayout(null);
	    
	    contentPane.add(inputGradePanel);
	    
	    
	    
	    
	    nameLabel = new JLabel();
	    nameLabel.setBounds(8, 32,90 ,23);
	    nameLabel.setText("Student Name :");
	    
	    inputGradePanel.add(nameLabel);
	    
	    
	    nameTextField = new JTextField();
	    nameTextField.setBounds(104, 32, 88, 21);
	    nameTextField.setHorizontalAlignment(JTextField.LEFT);
	    
	    nameTextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(nameTextField);
	    
	    //theory 1
	    theory1Label = new JLabel();
	    theory1Label.setBounds(8, 74,60 ,23);
	    
	    theory1Label.setText("Theory 1 :");
	    
	    
	    
	    inputGradePanel.add(theory1Label);
	    
	    theory1TextField = new JTextField();
	    theory1TextField.setBounds(136, 74, 56, 21);
	    theory1TextField.setHorizontalAlignment(JTextField.LEFT);
	    
	    theory1TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(theory1TextField);
	    
	    
	    //theory 2
	    theory2Label = new JLabel();
	    theory2Label.setBounds(8, 98,60 ,23);
	    theory2Label.setText("Theory 2 :");
	    
	    inputGradePanel.add(theory2Label);
	    
	    theory2TextField = new JTextField();
	    theory2TextField.setBounds(136, 98, 56, 21);
	    theory2TextField.setHorizontalAlignment(JTextField.LEFT);
	    
	    theory2TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(theory2TextField);
	    
	    
	    //theory 3
	    
	    theory3Label = new JLabel();
	    theory3Label.setBounds(8, 98+24,60 ,23);
	    theory3Label.setText("Theory 3 :");
	    
	    inputGradePanel.add(theory3Label);
	    
	    theory3TextField = new JTextField();
	    theory3TextField.setBounds(136, 98+24, 56, 21);
	    theory3TextField.setHorizontalAlignment(JTextField.LEFT);
	    theory3TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(theory3TextField);
	    
	    
	    //theory 4
	    
	    theory4Label = new JLabel();
	    theory4Label.setBounds(8, 98+24+24,60 ,23);
	    theory4Label.setText("Theory 4 :");
	    
	    inputGradePanel.add(theory4Label);
	    
	    theory4TextField = new JTextField();
	    theory4TextField.setBounds(136, 98+24+24, 56, 21);
	    theory4TextField.setHorizontalAlignment(JTextField.LEFT);
	    theory4TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(theory4TextField);
	    
	    
	    //theory 5
	    
	    theory5Label = new JLabel();
	    theory5Label.setBounds(8,98+24+24+24,60, 23);
	    theory5Label.setText("Theory 5 :");
	    
	    inputGradePanel.add(theory5Label);
	    
	    theory5TextField = new JTextField();
	    theory5TextField.setBounds(136, 98+24+24+24, 56, 21);
	    theory5TextField.setHorizontalAlignment(JTextField.LEFT);
	    theory5TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(theory5TextField);
	    
	    //lab 1
	    lab1Label = new JLabel();
	    lab1Label.setBounds(8, 170+24, 60,23);
	    lab1Label.setText("Lab 1 :");
	    
	    inputGradePanel.add(lab1Label);
	    
	    lab1TextField = new JTextField();
	    lab1TextField.setBounds(136, 170+24, 56, 21);
	    lab1TextField.setHorizontalAlignment(JTextField.LEFT);
	    lab1TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(lab1TextField);
	    
	    
	    //lab 2
	    
	    lab2Label = new JLabel();
	    lab2Label.setBounds(8, 170+24+24, 60,23);
	    lab2Label.setText("Lab 2 :");
	    
	    inputGradePanel.add(lab2Label);
	    
	    lab2TextField = new JTextField();
	    lab2TextField.setBounds(136, 170+24+24, 56, 21);
	    lab2TextField.setHorizontalAlignment(JTextField.LEFT);
	    lab2TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(lab2TextField);
	    
	    
	    //lab 3
	    
	    lab3Label = new JLabel();
	    lab3Label.setBounds(8, 170+24+24+24, 60,23);
	    lab3Label.setText("Lab 3 :");
	    
	    inputGradePanel.add(lab3Label);
	    
	    lab3TextField = new JTextField();
	    lab3TextField.setBounds(136, 170+24+24+24, 56, 21);
	    lab3TextField.setHorizontalAlignment(JTextField.LEFT);
	    lab3TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(lab3TextField);
	    
	    
	    //lab 4
	    
	    lab4Label = new JLabel();
	    lab4Label.setBounds(8, 170+24+24+24+24, 60+30,23);
	    lab4Label.setText("Lab 4: (.75)");
	    
	    inputGradePanel.add(lab4Label);
	    
	    lab4TextField = new JTextField();
	    lab4TextField.setBounds(136, 170+24+24+24+24, 56, 21);
	    lab4TextField.setHorizontalAlignment(JTextField.LEFT);
	    lab4TextField.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(lab4TextField);
	    
	    
	    
	    
	    
	    //submitGradesButton
	    
	    submitGradesJButton = new JButton();
	    submitGradesJButton.setBounds(72-30, 182+50+50+30, 120, 24);
	    submitGradesJButton.setText("Calculate");
	    
	    submitGradesJButton.setBackground(Color.LIGHT_GRAY);
	    
	    inputGradePanel.add(submitGradesJButton);
	    
	    submitGradesJButton.addActionListener(new ActionListener(){
	    	
	    	public void actionPerformed(ActionEvent event){
	    		 
	    		submitGradesJButtonActionPerformed( event );
	    	}
	    });
	    
	    
	    //text Area
	    
	    displayJLabel = new JLabel();
	    displayJLabel.setBounds( 240, 16, 150, 23 );
	    displayJLabel.setText( "CGPA :" );
	    contentPane.add( displayJLabel );
	      

	    displayJTextArea = new JTextArea();
	    displayJTextArea.setBounds( 240, 48, 402-200, 184+100 );
	    
	    displayJTextArea.setBackground(Color.black);
	    
	    displayJTextArea.setEditable( false );
	    contentPane.add( displayJTextArea );
	    
	    
	    
	    
	    
	    
	    setTitle( "CGPA Calculator" ); 
	    setSize( 670-200, 308+100 );
	    setResizable(false);
	    setVisible( true );
	}
	
	

	
	private void submitGradesJButtonActionPerformed(ActionEvent event){
		
		String nameOfStudent = nameTextField.getText();
		
		int theory1 = Integer.parseInt(theory1TextField.getText());
		int theory2 = Integer.parseInt(theory2TextField.getText());
		int theory3 = Integer.parseInt(theory3TextField.getText());
		int theory4 = Integer.parseInt(theory4TextField.getText());
		int theory5 = Integer.parseInt(theory5TextField.getText());
		
		int lab1 = Integer.parseInt(lab1TextField.getText());
		int lab2 = Integer.parseInt(lab2TextField.getText());
		int lab3 = Integer.parseInt(lab3TextField.getText());
		int lab4 = Integer.parseInt(lab4TextField.getText());
		
		
		studentsNames[studentcount] = nameOfStudent;
		
		studentsGrades[studentcount][FIRST_TEST] = theory1;
		studentsGrades[studentcount][SECOND_TEST] = theory2;
		studentsGrades[studentcount][THIRD_TEST] = theory3;
		studentsGrades[studentcount][FOURTH_TEST] = theory4;
		studentsGrades[studentcount][FIFTH_TEST] = theory5;
		
		studentsGrades[studentcount][FIRST_LAB] = lab1;
		studentsGrades[studentcount][SECOND_LAB] = lab2;
		studentsGrades[studentcount][THIRD_LAB] = lab3;
		studentsGrades[studentcount][FOURTH_LAB] = lab4;
		
		
		
		studentcount++;
		
		displayCgpa();
		
		
		nameTextField.setText("");
		theory1TextField.setText("");
		theory2TextField.setText("");
		theory3TextField.setText("");
		theory4TextField.setText("");
		theory5TextField.setText("");
		
		lab1TextField.setText("");
		lab2TextField.setText("");
		lab3TextField.setText("");
		lab4TextField.setText("");
		
		if( studentcount == MAXIMUM_STUDENTS){
			
			submitGradesJButton.setEnabled(false);
		}
		
	}
	
	
	
	private void displayCgpa(){
		
		displayJTextArea.setText("Name\tCGPA\n");
		
		double studentTotal = 0;
		
		for(int student = 0; student<studentcount; student++ ){ 			//student = 0 or joono ghurbe bt kono man nai bole kaj korbe na
			
			displayJTextArea.append( studentsNames[student] + "\t");
			
			studentTotal = 0;
			
			
			for( int test=0; test<NUMBER_OF_TESTS;test++){
				
				if(test == 8){
					
					studentTotal = studentTotal + .75*calculate(1.0*studentsGrades[student][test]);
				}
				
				else if(test == 5 || test==6 || test == 7){
					
					studentTotal = studentTotal + 1.5*calculate(1.0*studentsGrades[student][test]);
				}
				
				else{
					
					studentTotal = studentTotal + 3*calculate(1.0*studentsGrades[student][test]);
				}
				
				
				//studentTotal = studentTotal + 3*calculate(1.0*studentsGrades[student][test]);
			}
		
		
		double studentCgpa = studentTotal/20.25;
		
		displayJTextArea.append( twoDigits.format(studentCgpa) + "\n");
		
		}
	}
	
	
	private double calculate(double n){
		if(n>=80){
			return 4.00;
		}
		else if(n>=75){
			return 3.75;
		}
		else if(n>=70){
			return 3.50;
		}
		else if(n>=65){
			return 3.25;
		}
		else if(n>=60){
			return 3.00;
		}
		else if(n>=55){
			return 2.75;
		}
		else if(n>=50){
			return 2.50;
		}
		else if(n>=45){
			return 2.25;
		}
		else if(n>=40){
			return 2.00;
		}
		else
			return 0;
	}
	
	
	
	public static void main(String args[]){
		
		StudentGrade app = new StudentGrade();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setLocationRelativeTo(null);
	}
	
	
}
