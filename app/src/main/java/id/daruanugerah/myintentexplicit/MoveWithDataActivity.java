package id.daruanugerah.myintentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    TextView tvDataReceived;
    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvDataReceived = findViewById(R.id.tv_data_received);

        name = getIntent().getStringExtra(EXTRA_NAME);
        age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Nama saya: " +name+ ", Umur saya: " +age;

        tvDataReceived.setText(text);
    }
}
