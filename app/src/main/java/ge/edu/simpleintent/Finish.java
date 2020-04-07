package ge.edu.simpleintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Finish extends AppCompatActivity {

    private TextView mName2;
    private TextView mPoint2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        mName2 = findViewById(R.id.getname);
        mPoint2 = findViewById(R.id.getscore);
        Intent intent = getIntent();
        if (intent.hasExtra("name2")) {
            String gname = intent.getStringExtra("name2");
            mName2.setText(gname);
        }

        if (intent.hasExtra("point2")) {
            String gscore = intent.getStringExtra("point2");
            mPoint2.setText(gscore);
        }

    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }

}