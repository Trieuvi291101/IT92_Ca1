package com.trieuvi.bmiapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lbketqua;
    @FXML
    public void TinhBMI(ActionEvent event){
      double height = Double.parseDouble(this.txtHeight.getText());
      double weight = Double.parseDouble(this.txtWeight.getText());
      double bmi = weight/ Math.pow(height, 2);
      
      this.lbketqua.setTextFill(Color.DARKBLUE);
      if(bmi<18.5)
          lbketqua.setText("Gay");
      else if(bmi<25.5)
          lbketqua.setText("Binh thuong");
      else{
          this.lbketqua.setTextFill(Color.RED);
          lbketqua.setText("Thua can");
      }
    
    }
   
}
