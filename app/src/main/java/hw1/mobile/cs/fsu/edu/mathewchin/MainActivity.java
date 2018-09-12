package hw1.mobile.cs.fsu.edu.mathewchin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1_text);
        Button btn = findViewById(R.id.b1_button);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = "Mathew Chin";
                t1.setText(newText);
                Toast.makeText(getApplicationContext(), "Button Clicked.", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
