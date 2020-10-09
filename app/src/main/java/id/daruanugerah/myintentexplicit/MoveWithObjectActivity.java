package id.daruanugerah.myintentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra_person";
    TextView tvObjectReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObjectReceived = findViewById(R.id.tv_object_received);

        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String textValue = "Nama saya: " +person.getName()+ "\nAlamat saya: " +person.getCity()+ "\nUmur saya: " +person.getAge()+ "\nEmail saya: " +person.getEmail();
        tvObjectReceived.setText(textValue);
    }
}
