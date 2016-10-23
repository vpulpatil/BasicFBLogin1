package fb.example.vipul.basicfblogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import static fb.example.vipul.basicfblogin.R.id.buttonAddValue;

public class MainActivity extends AppCompatActivity {

    public EditText textName;
    public EditText textValue;
    public Button buttonAddValue;
    Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        buttonAddValue = (Button) findViewById(R.id.buttonAddValue);
        textName = (EditText) findViewById(R.id.editTextName);
        textValue = (EditText) findViewById(R.id.editTextValue);

        mRef = new Firebase("https://basic-fb-login.firebaseio.com/");

        buttonAddValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                String value = textValue.getText().toString();
                Firebase addChild = mRef.child(name);
                addChild.setValue(value);
            }
        });

    }
}


