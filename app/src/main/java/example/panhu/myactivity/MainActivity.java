package example.panhu.myactivity;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button Button;
    private EditText StudentID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = (Button) findViewById(R.id.Button);
        StudentID = (EditText)findViewById(R.id.Input_Data);

        Button.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
            String Entered =  Button.getText().toString()+":"+StudentID.getText().toString();
            Context context =  MainActivity.this;
            Class destinationActivity = MainActivity2.class;

            Intent startActivityIntent = new Intent(context, destinationActivity);
            startActivityIntent.putExtra(Intent.EXTRA_TEXT, Entered);
            startActivity(startActivityIntent);

            }
                });

    }
}
