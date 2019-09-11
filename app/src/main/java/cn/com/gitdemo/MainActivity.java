package cn.com.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IDOFSSSSSSSSSSDSFASDFASDFADSFASDFAS
        //IDOFSSSSSSSSSSDSFASDFASDFADSFASDFAS

        btn1 = findViewById(R.id.btn_1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "尹罗飞22222", Toast.LENGTH_SHORT).show();
            }
        });




        btn2 = findViewById(R.id.btn_2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "尹罗飞2", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
