package org.bhooshan.hcfcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSmallerNumber, edtGreaterNumber;
    TextView tvAnswer;
    Button btnSubmit;
    int greaterNumber;
    int smallerNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                                                                                                                                                                                                                                                                                                     
        initializeViews();
        btnSubmit.setOnClickListener(v -> {
            getUserInput();
            showAnswer(getHCF(greaterNumber, smallerNumber));
        });
    }

    public void initializeViews() {
        edtSmallerNumber = findViewById(R.id.edtSmallerNumber);
        edtGreaterNumber = findViewById(R.id.edtGreaterNumber);
        tvAnswer = findViewById(R.id.tvAnswer);
        btnSubmit = findViewById(R.id.btnSubmit);
    }

    public void getUserInput() {
        greaterNumber = Integer.parseInt(edtGreaterNumber.getText().toString());
        smallerNumber = Integer.parseInt(edtSmallerNumber.getText().toString());
    }

    public int getHCF(int greaterNumber, int smallerNumber) {
        try {
            return HCF.calculateHCF(smallerNumber, greaterNumber);
        }catch (Exception e){
            Toast.makeText(this, "Input is Invalid", Toast.LENGTH_LONG);
            return 0;
        }
    }

    public void showAnswer(int HCF){
        tvAnswer.setText("Answer : " + HCF);
    }

}