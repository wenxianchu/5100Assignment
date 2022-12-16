package com.example.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CalApplication extends Application {
    TextField firstField = new TextField();
    TextField secondField = new TextField();
    TextField outputField = new TextField();

    GridPane title = new GridPane();

    ToggleGroup group = new ToggleGroup();

    RadioButton addBtn = new RadioButton("+");


    RadioButton subBtn = new RadioButton("-");

    RadioButton mulBtn = new RadioButton("*");

    RadioButton divBtn = new RadioButton("/");




    @Override
    public void start(Stage stage) throws Exception {
        //---------------------Labels---------------------
        Label firstLabel = new Label("Enter first number (x): ");
        Label secondLabel = new Label("Enter second number (x): ");
        Label outputLabel = new Label("Output: ");

        //---------------------Fields-----------------------------


        outputField.setEditable(false);
        //--------------------buttons---------------------
        Button submitBtn = new Button("GUI Calculator");

        addBtn.setToggleGroup(group);
        addBtn.setSelected(true);
        subBtn.setToggleGroup(group);

        mulBtn.setToggleGroup(group);
        divBtn.setToggleGroup(group);

        title.add(addBtn, 0, 0);
        title.add(subBtn, 1, 0);
        title.add(mulBtn, 2, 0);
        title.add(divBtn, 3, 0);

        Button calculateBtn = new Button("Calculate");
        Button resetBtn = new Button("Reset");

        title.add(calculateBtn, 4, 0);
        title.add(resetBtn, 5, 0);


        //-------------------------Layout and Scene------------
        GridPane grid = new GridPane(); // layout
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        //------------------adding components to the grid-----------
        grid.add(title, 0, 0, 2, 1);
        grid.add(firstLabel, 0, 1);
        grid.add(firstField, 1, 1);
        grid.add(secondLabel, 0, 2);
        grid.add(secondField, 1, 2);
        grid.add(outputLabel, 0, 3);
        grid.add(outputField, 1, 3);

        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(new CalHandler());
        calculateBtn.setOnAction(new CalHandler());

        resetBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                firstField.clear();
                secondField.clear();
                outputField.clear();
            }
        });



//        grid.setHalignment(submitBtn, HPos.RIGHT);
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        //stage.setHeight(500);
        //stage.setWidth(500);

        stage.setTitle("GUI Calculator");
        stage.show();
    }


    class CalHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            String first = firstField.getText();
            String second = secondField.getText();

            int f = 0, s = 0;
            try {
                f = Integer.parseInt(first);
                s = Integer.parseInt(second);
                double out = 0.0;
                if (divBtn.isSelected()) {
                    System.out.println("div");
                    out = (double) f / s;
                } else if (addBtn.isSelected()) {
                    out = f + s;
                } else if (subBtn.isSelected()) {
                    out = f - s;
                } else if (mulBtn.isSelected()) {
                    out = f * s;
                }

                System.out.println("first = " + first + " second = " + second);
                outputField.setText(String.valueOf(out));


            } catch (NumberFormatException e) {

                Alert alert  = new Alert(Alert.AlertType.ERROR, "Number is ERROR");
                alert.showAndWait();

            }

        }
    }
}
