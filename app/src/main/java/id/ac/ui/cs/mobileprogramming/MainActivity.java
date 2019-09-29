package id.ac.ui.cs.mobileprogramming;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static class Number {
        int number;

        public Number (int input) {
            this.number = input;
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isPrime() {
            boolean flag = false;
            for(int i = 2; i <= number/2; ++i) {
                if(number % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public void testNumber(View view) {
        Log.i("Info", "button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String message;
        if (isNumeric(editText.getText().toString())) {
            if (editText.getText().toString().isEmpty()) {
                message = "Please enter a number";
            } else {
                Number myNumber = new Number(Integer.parseInt(editText.getText().toString()));
                message = editText.getText().toString();
                if (myNumber.isSquare() && myNumber.isPrime()) {
                    message += " is square and prime!";
                } else if (myNumber.isSquare()) {
                    message += " is square but not prime.";
                } else if (myNumber.isPrime()) {
                    message += " is prime but not square.";
                } else {
                    message += " is neither prime nor square.";
                }
            }
        }
        else {
            message = "Your input isn't a number";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
