package ge.edu.simpleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mWelcome;
    private Button mEnter;
    public TextView mDescr;
    public Button mSubmit;
    public TextView mCongr;
    public TextView mSeescore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enter(View view)
    {
       Intent intent=new Intent(this, Quiz.class);
       startActivity(intent);

    }


    public void geo(View view) {
        mWelcome=findViewById(R.id.welcome);
        String welcome = "მოგესალმებით ქვიზზე!";
        mWelcome.setText(welcome);

        mEnter=findViewById(R.id.enter);
        String enter = "შესვლა";
        mEnter.setText(enter);

        Button geo =(findViewById(R.id.geo)) ;
        geo.setVisibility(View.GONE);
        Button eng =(findViewById(R.id.eng)) ;
        eng.setVisibility(View.VISIBLE);


    }



    public void eng(View view) {

        mWelcome=findViewById(R.id.welcome);
        String welcome = "Welcome to Quiz!";
        mWelcome.setText(welcome);

        mEnter=findViewById(R.id.enter);
        String enter = "Enter";
        mEnter.setText(enter);

        Button geo =(findViewById(R.id.geo)) ;
        geo.setVisibility(View.VISIBLE);
        Button eng =(findViewById(R.id.eng)) ;
        eng.setVisibility(View.GONE);
    }
}
