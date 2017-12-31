package co.superproxy.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //define variables
    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set variables
        bt1 = findViewById(R.id.bt_sign_up);
        bt2 = findViewById(R.id.bt_login);

        //bt1 clickOn method
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //popup message
                Toast.makeText(getApplicationContext(), "Application is under development.", Toast.LENGTH_LONG).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //popup message
                //Toast.makeText(getApplicationContext(), "Application is under development.", Toast.LENGTH_LONG).show();
                Intent loginPage = new Intent(MainActivity.this, loginActivity.class);
                startActivity(loginPage);
            }
        });
    }
}
