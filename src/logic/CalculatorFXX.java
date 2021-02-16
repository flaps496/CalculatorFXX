package logic;
import java.io.BufferedReader;
import java.io.StringReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorFXX extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	TextField tf = new TextField("");
	
	Label lOp = new Label("");
	Label lEr = new Label("");
	
	
	private Button[] numBtns = new Button[10];
	
	private Button plusBtn = new Button("+");
	private Button minBtn = new Button("-");
	private Button forBtn = new Button("*");
	private Button divBtn = new Button("/");
	private Button eqBtn = new Button("=");
	
	private Button commBtn = new Button(".");
	
	private Button cancBtn = new Button("C");
	private Button cancEvBtn = new Button("CE");

	double sxNum = 0;
	double dxNum = 0;
	int begIndexDxNum=0;
	
	String operator = "";
	String oldOperator = "";
	
	double answer = 0;

	@Override
	public void start(Stage stage) throws Exception {
		
		//Create root graph
		VBox root = new VBox();
		root.setStyle("-fx-background-color: #FFB649;");
		
		//btn.setMinWidth(200);
		
		//Init number Buttons
		initNumBtns();
		lOp.setMinHeight(80);
		lOp.setStyle("-fx-font-size:2em;");
		
		//Create nodes 
		//createGrid1(gp);
		
		//tf.setOnKeyPressed(value);
		tf.setPrefHeight(80);
		tf.setStyle("-fx-font-size:2em; -fx-background-color: #FCEEBF;");
		tf.setEditable(false);
		
		root.getChildren().addAll(tf, lOp, createGrid(), lEr);
	
		
		//Create scene
		Scene scene = new Scene(root, 800, 700);
		
		stage.setScene(scene);
		stage.setTitle("My calculator");
		stage.show();
		
	}
	
	public void initNumBtns() {
		
        for(int i = 0; i < numBtns.length; i++) {
            numBtns[i] = new Button(Integer.toString(i));
        }
    }
	
	TextField writeTextField(TextField tField, String s) {
		tField.appendText(s);
		return tField;
	}
	
	
	
	 private Pane createGrid() {
		 
	        GridPane gridPane = new GridPane();
	      
	        for(Button b : numBtns) {
	            b.setMinWidth(150);
	            b.setMinHeight(80);
	            b.setStyle("-fx-font-size:2em;");
	        }
	        
	        //Button 7 control
	        gridPane.add(numBtns[7], 0, 0);
	        numBtns[7].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("7");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n7"));
					}
					else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("7"));
						tf.appendText("7");
					}
				}
	        	
	        });
	        
	        //Button 8 control 
	        gridPane.add(numBtns[8], 1, 0);
	        numBtns[8].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("8");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n8"));
					}
					else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("8"));
						tf.appendText("8");
					}
				}
	        	
	        });
	        
	        //Button 9 control
	        gridPane.add(numBtns[9], 2, 0);
	        numBtns[9].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("9");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n9"));
					}
					else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("9"));
						tf.appendText("9");
					}
				}
	        	
	        });
	        
	        //Button 4 control
	        gridPane.add(numBtns[4], 0, 1);
	        numBtns[4].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {					
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("4");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n4"));
					}else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("4"));
						tf.appendText("4");
					}
				}
	        	
	        });
	        
	        //Button 5 control
	        gridPane.add(numBtns[5], 1, 1);
	        numBtns[5].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("5");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n5"));
					}
					else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("5"));
						tf.appendText("5");
					}
				}
	        	
	        });
	        
	        //Button 6 control
	        gridPane.add(numBtns[6], 2, 1);
	        numBtns[6].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("6");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n6"));
					}else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("6"));
						tf.appendText("6");
					}
				}
	        	
	        });
	        
	        //Button 1 control
	        gridPane.add(numBtns[1], 0, 2);
	        numBtns[1].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("1");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n1"));
					}else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("1"));
						tf.appendText("1");
					}
					
				}
	        	
	        });
	        
	        //Button 2 control
	        gridPane.add(numBtns[2], 1, 2);
	        numBtns[2].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("2");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n2"));
					}
					else {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("2"));
						tf.appendText("2");
					}
				}
	        	
	        });
	        
	        //Button 3 control
	        gridPane.add(numBtns[3], 2, 2);
	        numBtns[3].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					String actualOp = lOp.getText();
					lOp.setText(actualOp.concat("3"));
					tf.appendText("3");
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("3");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n3"));
					}
				}
	        	
	        });
	        
	        //Button 0 control
	        gridPane.add(numBtns[0], 0, 3);
	        numBtns[0].setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					tf.appendText("0");
					String actualOp = lOp.getText();
					lOp.setText(actualOp.concat("0"));
					if (operator == "=") {
						operator = "";
						tf.clear();
						tf.appendText("0");
						String actualOp2 = lOp.getText();
						lOp.setText(actualOp2.concat("\n0"));
					}
				}
	        	
	        });
	        
	        //Button . control and style
	        gridPane.add(commBtn, 1, 3);
	        commBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					tf.appendText(".");
					String actualOp = lOp.getText();
					lOp.setText(actualOp.concat("."));
				}
	        	
	        });
	        commBtn.setMinWidth(150);
            commBtn.setMinHeight(80);
            commBtn.setStyle("-fx-font-size:2em;");
            
	        
            
            //Operation buttons
            
            //Equal button control and style
            gridPane.add(eqBtn, 2, 3);
            eqBtn.setOnAction(new EventHandler<ActionEvent>() {
            	
				@Override
				public void handle(ActionEvent e) {
					if (operator=="+" || operator == "-" || operator =="*" || operator == "/") {
						//Definition of second operand
						//if no second operand is selected, It's setted at zero 
						if (tf.getText().isEmpty() == true) {
							dxNum = 0;
							lOp.setText(lOp.getText().concat("0"));
						}
						//Else is taken from the textfield
						else{
							dxNum = Double.valueOf(tf.getText());
						}
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("="));
						tf.clear();
						operation();
					}
					oldOperator = operator;
					operator = "=";
				}
	        	
	        });
	        eqBtn.setMinWidth(150);
            eqBtn.setMinHeight(80);
            eqBtn.setStyle("-fx-font-size:2em;");
	        
            //Divide button control and style
	        gridPane.add(divBtn, 3, 0);
	        divBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
				
					if (tf.getText().length() !=0) {
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("/"));
						if (tf.getText().contains("=") == false)
							sxNum = Double.parseDouble(tf.getText());
						else 
							sxNum = Double.parseDouble(tf.getText().substring(tf.getText().lastIndexOf("=")+1, tf.getText().length()));
					}
					else {
						if (lOp.getText().length() != 0) {
							if (operator!= "null") {
								String actualOp = lOp.getText().substring(0, lOp.getText().length()-1);
								lOp.setText(actualOp.concat("/"));
							}
							else {
								String actualOp = lOp.getText();
								lOp.setText(actualOp.concat("/"));
							}
						}
					}
					oldOperator = operator;
					operator = "/";
					begIndexDxNum = lOp.getText().lastIndexOf('/');
					tf.clear();
				}
	        	
	        });
	        divBtn.setMinWidth(150);
            divBtn.setMinHeight(80);
            divBtn.setStyle("-fx-font-size:2em;");
            
	        gridPane.add(forBtn, 3, 1);
	        forBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					//String actualOp = lOp.getText();
					//lOp.setText(actualOp.concat("*"));
					
					if (tf.getText().length()!=0) {
						if (tf.getText().contains("=") == false)
							sxNum = Double.parseDouble(tf.getText());
						else 
							sxNum = Double.parseDouble(tf.getText().substring(tf.getText().lastIndexOf("=")+1, tf.getText().length()));
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("*"));
					}
					else {
						if (lOp.getText().length() != 0) {
							if (operator!= "null") {
								String actualOp = lOp.getText().substring(0, lOp.getText().length()-1);
								lOp.setText(actualOp.concat("*"));
							}
							else {
								String actualOp = lOp.getText();
								lOp.setText(actualOp.concat("*"));
							}
						}
					}
					operator = "*";
					numBtns[0].setDisable(false);
					begIndexDxNum = lOp.getText().lastIndexOf('*');
					tf.clear();
				}
	        	
	        });
	        forBtn.setMinWidth(150);
            forBtn.setMinHeight(80);
            forBtn.setStyle("-fx-font-size:2em;");
            
	        gridPane.add(minBtn, 3, 2);
	        minBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					oldOperator = operator;
					operator = "-";
					//if the minus button is called more times without clicking the equal button
					if (oldOperator == operator) {
						if (countLines(lOp.getText()) != 1) {
							int lastIndPlus = lOp.getText().lastIndexOf("-");
							int lastIndNewLine = lOp.getText().lastIndexOf("\n")+1;
							sxNum = Double.parseDouble(lOp.getText().substring(lastIndNewLine, lastIndPlus));
							dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
							lOp.setText(lOp.getText().substring(0, lastIndNewLine).concat(String.valueOf(operation())));
						}
						else {
							if (lOp.getText().contains("=") == false) {
								int lastIndPlus = lOp.getText().lastIndexOf("-");
								sxNum = Double.parseDouble(lOp.getText().substring(0, lastIndPlus));
								dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
								lOp.setText(String.valueOf(operation()));
							}
							else {
								int lastIndPlus = lOp.getText().lastIndexOf("-");
								int lastIndEq = lOp.getText().lastIndexOf("=");
								sxNum = Double.parseDouble(lOp.getText().substring(lastIndEq+1, lastIndPlus));
								dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
								lOp.setText(String.valueOf(operation()));
							}
						}
					}
					if (tf.getText().length() !=0) {
						if (tf.getText().contains("=") == false)
							sxNum = Double.parseDouble(tf.getText());
						else 
							sxNum = Double.parseDouble(tf.getText().substring(tf.getText().lastIndexOf("=")+1, tf.getText().length()));
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("-"));
						//sxNum = Double.parseDouble(tf.getText());
					}
					else {
						if (lOp.getText().length() != 0) {
							if (operator!= "null") {
								String actualOp = lOp.getText().substring(0, lOp.getText().length()-1);
								lOp.setText(actualOp.concat("-"));
							}
							else {
								String actualOp = lOp.getText();
								System.out.print(actualOp);
								lOp.setText(actualOp.concat("-"));
							}
						}
					}
					begIndexDxNum = lOp.getText().lastIndexOf('-');
					tf.clear();
				}
	        	
	        });
	        minBtn.setMinWidth(150);
            minBtn.setMinHeight(80);
            minBtn.setStyle("-fx-font-size:2em;");
	        
            
            gridPane.add(plusBtn, 3, 3);
            plusBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					
					oldOperator = operator;
					operator = "+";
					//if the addition button is called more times without clicking the equal button
					if (oldOperator == operator) {
						if (countLines(lOp.getText()) != 1) {
							int lastIndPlus = lOp.getText().lastIndexOf("+");
							int lastIndNewLine = lOp.getText().lastIndexOf("\n")+1;
							sxNum = Double.parseDouble(lOp.getText().substring(lastIndNewLine, lastIndPlus));
							dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
							lOp.setText(lOp.getText().substring(0, lastIndNewLine).concat(String.valueOf(operation())));
						}
						else {
							if (lOp.getText().contains("=") == false) {
								int lastIndPlus = lOp.getText().lastIndexOf("+");
								sxNum = Double.parseDouble(lOp.getText().substring(0, lastIndPlus));
								dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
								lOp.setText(String.valueOf(operation()));
							}
							else {
								int lastIndPlus = lOp.getText().lastIndexOf("+");
								int lastIndEq = lOp.getText().lastIndexOf("=");
								System.out.print(lastIndPlus);
								sxNum = Double.parseDouble(lOp.getText().substring(lastIndEq+1, lastIndPlus));
								System.out.print(sxNum);
								dxNum = Double.parseDouble(lOp.getText().substring(lastIndPlus+1, lOp.getText().length()));
								System.out.print(dxNum);
								lOp.setText(String.valueOf(operation()));
							}
						}
					}
					
					if (tf.getText().length()!=0) {
						if (tf.getText().contains("=") == false)
							sxNum = Double.parseDouble(tf.getText());
						else 
							sxNum = Double.parseDouble(tf.getText().substring(tf.getText().lastIndexOf("=")+1, tf.getText().length()));
						String actualOp = lOp.getText();
						lOp.setText(actualOp.concat("+"));
					}
					else {
						if (lOp.getText().length() != 0) {
							if (operator!= "null") {
								String actualOp = lOp.getText().substring(0, lOp.getText().length()-1);
								lOp.setText(actualOp.concat("+"));
							}
							else {
								String actualOp = lOp.getText();
								lOp.setText(actualOp.concat("+"));
							}
						}
					}
					begIndexDxNum = lOp.getText().lastIndexOf('+');
					tf.clear();
				}
	        	
	        });
	        plusBtn.setMinWidth(150);
            plusBtn.setMinHeight(80);
            plusBtn.setStyle("-fx-font-size:2em;");
            
	        //Canc Button: It deletes only one number/operator at a time
	        gridPane.add(cancBtn, 0, 4);
	        cancBtn.setMinWidth(150);
            cancBtn.setMinHeight(80);
            cancBtn.setStyle("-fx-font-size:2em;");
            cancBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					//how to delete a char if textfield is not empty
					if (tf.getLength() != 0) {
		                if (operator == "=") {
							//Do nothing: you can't delete a single character of a given result 
						}
						else{
							tf.setText(tf.getText(0, tf.getLength()-1));
							String actualOp = lOp.getText();
							String deletedChar = actualOp.substring(actualOp.length() - 1);
							String newOp = actualOp.substring(0, actualOp.length()-1);
							lOp.setText(newOp);
							if (deletedChar == ("+") || deletedChar == ("-") || deletedChar == ("*") || deletedChar == ("/")) {
								operator = "null";
								tf.setText(lOp.getText());
							}
						}
					}
					//else if textfield is empty
					else {
						if (lOp.getText().length()!=0) {
							if (operator=="=") {
								
							}
							
							else {
								String actualOp = lOp.getText();
								String newOp = actualOp.substring(0, actualOp.length()-1);
								lOp.setText(newOp);
								char deletedChar = actualOp.charAt(actualOp.length()-1);
								//if (deletedChar == ("+") || deletedChar == ("-") || deletedChar == ("*") || deletedChar == ("/")) {
								if (deletedChar == '+' || deletedChar == '-' || deletedChar == '*' || deletedChar == '/')	{
									operator = "null";
									if (countLines(lOp.getText())-1 !=0) {
										tf.setText(lOp.getText().substring(lOp.getText().lastIndexOf("\n"), lOp.getText().length()));
									}
									else {
										tf.setText(lOp.getText());
									}
								}
							}
						}
						else {
						}
					}
				}
	        	
	        });
            
            //CE: Cancel everything button
	        gridPane.add(cancEvBtn, 1, 4);
	        cancEvBtn.setMinWidth(150);
            cancEvBtn.setMinHeight(80);
            cancEvBtn.setStyle("-fx-font-size:2em;");
            cancEvBtn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					tf.clear();
					lOp.setText("");
					operator = "null";
					lEr.setText("");
					numBtns[0].setDisable(false);
				}
	        });
	        
	        return gridPane;
	 }
	 
	 //method that makes operations 
	 double operation() {
		 if (operator == "+") 
			 answer = sxNum + dxNum;
		 if (operator == "-") 
			 answer = sxNum - dxNum;
		 if (operator == "*")
			 answer = sxNum * dxNum;
		 if (operator=="/" && dxNum == 0) {
			 lEr.setText("ERROR: You can't divide a number by 0!");
			 lEr.setStyle("-fx-font-size: 2em; -fx-text-fill: red;");
			 lEr.setMinHeight(100);
		 }
		 if (operator == "/") 
			 answer = sxNum / dxNum;
		 if (operator == "=") {
			 lEr.setText("");
		 }
		 tf.setText(String.valueOf(answer));
		 String newOp = lOp.getText().concat(String.valueOf(answer));
		 lOp.setText(newOp);
		 
		 return answer;
	 }
	 
	 //a method that counts the lines in a string
	 private static int countLines(String s) {
	        try (
	                StringReader sr = new StringReader(s);
	                BufferedReader br = new BufferedReader(sr)
	        ) {
	            int count = 0;
	            for (String line = br.readLine(); line != null; line = br.readLine()) {
	                count++;
	            }
	            return count;
	        } catch (Exception e) {
	            return -1;
	        }
	    }
}