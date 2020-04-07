package ge.edu.simpleintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class Quiz extends AppCompatActivity {
    private EditText mName;
    private int mPoint=0;
    private EditText mAns1;
    private EditText mAns2;
    private EditText mAns3;
    private EditText mAns4;
    private EditText mAns5;
    private String ans1,ans2,ans3,ans4,ans5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mName = findViewById(R.id.name);

    }

    public void submit(View view)
    {   String Ans1,Ans2,Ans3,Ans4,Ans5;
        String ename = mName.getText().toString();
        if(findViewById(R.id.an1)!=null){
        mAns1 = findViewById(R.id.an1);
            Ans1 = mAns1.getText().toString();
            ans1=String.valueOf(Ans1);
            if(ans1.equals("4") ){
                mPoint = mPoint + 2;
            }
        }
        if(findViewById(R.id.an1)!=null){
        mAns2 = findViewById(R.id.an2);
            Ans2 = mAns2.getText().toString();
            ans2=String.valueOf(Ans2);
            if(ans2.equals("4")){
                mPoint = mPoint + 2;
            }
        }

        if(findViewById(R.id.an1)!=null){
        mAns3 = findViewById(R.id.an3);
            Ans3 = mAns3.getText().toString();
            ans3=String.valueOf(Ans3);
            if(ans3.equals("130")) {
                mPoint = mPoint + 2;
            }
        }

        if(findViewById(R.id.an1)!=null){
            mAns4 = findViewById(R.id.an4);
            Ans4 = mAns4.getText().toString();
            ans4=(String.valueOf(Ans4));
            if(ans4.equals("12")) {
                mPoint = mPoint + 2;
            }
        }
        if(findViewById(R.id.an1)!=null) {
            mAns5 = findViewById(R.id.an5);
            Ans5 = mAns5.getText().toString();
            ans5 = (String.valueOf(Ans5));

            if (ans5.equals("0")) {
                    mPoint = mPoint + 2;
                }
            }

String point =String.valueOf(mPoint);
mPoint=0;
        Intent intent=new Intent(this, Finish.class);
        intent.putExtra("name2", ename);
        intent.putExtra("point2", point);

        startActivity(intent);


    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
