package example.panhu.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    private TextView Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Show = (TextView)findViewById(R.id.Show);
        Intent intentThatStartedThisActivity = getIntent();
    if(intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

        String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
        Show.setText(textEntered);

    }

    }
}
