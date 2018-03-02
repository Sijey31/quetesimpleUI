package com.example.wilder.simpleuiquest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                EditText editLastName = findViewById(R.id.edit_lastname);
                EditText editFirstName = findViewById(R.id.edit_firstname);
                Button buttonaccept = findViewById(R.id.button_accept);

                 if (isChecked)
                 {
                    editLastName.setEnabled(true);
                    editFirstName.setEnabled(true);
                    buttonaccept.setEnabled(true);


                    }

                 else
                 {
                    editLastName.setEnabled(false);
                    editFirstName.setEnabled(false);
                    buttonaccept.setEnabled(false);

                    }


            }
        });

        Button buttonaccept = findViewById(R.id.button_accept);
        buttonaccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editLastName = findViewById(R.id.edit_lastname);
                String lastname = editLastName.getText().toString();
                EditText editFirstName = findViewById(R.id.edit_firstname);
                String firstname = editFirstName.getText().toString();
                TextView textmessage = findViewById(R.id.textMessage);
                //Toast.makeText(MainActivity.this, "Congratulation " + lastname + " " + firstname, Toast.LENGTH_LONG).show();


                if

                    (firstname.equals("") || (lastname.equals("")))
                {
                    Toast.makeText(MainActivity.this, "Please fill your firstname and lastname! ", Toast.LENGTH_LONG).show();
                }
                else
                {
                    String message = "Congratulation " + firstname + " " + lastname;
                    textmessage.setText(message);

                }

                }
        });
    }
}
