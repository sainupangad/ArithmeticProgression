package ZAINUschool.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first1, first2,second1,second2;
    ImageView click;
    TextView res,res2,res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first1 = findViewById(R.id.A1);
        first2 = findViewById(R.id.A2);
        second1 = findViewById(R.id.B1);
        second2 = findViewById(R.id.B2);
        click = findViewById(R.id.BT);
        res = findViewById(R.id.RS);
        res2 = findViewById(R.id.RS1);
        res3 = findViewById(R.id.RS3);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = first1.getText().toString();
                String B = first2.getText().toString();
                String C = second1.getText().toString();
                String D = second2.getText().toString();
                int a = Integer.parseInt(A);
                int b = Integer.parseInt(B);
                int c = Integer.parseInt(C);
                int d = Integer.parseInt(D);
                int dd = ((d-b)/(c-a));
                int aa =(d-((c-1)*dd));
                int bb = aa+dd;
                int cc = bb+dd;

                if(aa==0){
                    res.setVisibility(View.INVISIBLE);
                    res2.setVisibility(View.INVISIBLE);
                    res3.setVisibility(View.INVISIBLE);
                }else {
                    res.setVisibility(View.VISIBLE);
                    res2.setVisibility(View.VISIBLE);
                    res3.setVisibility(View.VISIBLE);


                    res.setText(String.valueOf(aa));
                    res2.setText(String.valueOf(bb));
                    res3.setText(String.valueOf(cc));


                }


            }
        });
    }
}