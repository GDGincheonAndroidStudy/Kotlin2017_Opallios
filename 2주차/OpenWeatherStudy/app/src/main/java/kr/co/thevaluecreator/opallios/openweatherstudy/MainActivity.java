package kr.co.thevaluecreator.opallios.openweatherstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJava = (Button)findViewById(R.id.btn_java);
        Button btnKotlin = (Button)findViewById(R.id.btn_kotlin);

        btnJava.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    //여기에 이벤트를 적어주세요
                    Intent intent=new Intent(MainActivity.this, JavaActivity.class);
                    startActivity(intent);
                }
            }
        );

        btnKotlin.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    //여기에 이벤트를 적어주세요
                    Intent intent=new Intent(MainActivity.this, KotlinActivity.class);
                    startActivity(intent);
                }
            }
        );
    }

}
