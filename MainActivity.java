package com.example.vibhor.quizzzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button yesButton;
    private Button noButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        yesButton = (Button) findViewById(R.id.yesButton);
        noButton  = (Button) findViewById(R.id.noButton);

        yesButton.setOnClickListener(new  View.OnClickListener(){
        @Override
            public  void onClick(View v){
            //Does nothing yet,but soon!
            Toast.makeText(MainActivity.this,
                    R.string.incorrect_toast,
                    Toast.LENGTH_SHORT).show();
        }
        });

    noButton.setOnClickListener(new  View.OnClickListener(){
        @Override
        public  void onClick(View v){
            //Does nothing yet,but soon!
            Toast.makeText(MainActivity.this,
                    R.string.correct_toast,
                    Toast.LENGTH_SHORT).show();
        }
    });
}

    @Override
    public boolean onOptionsMenu(Menu menu){
        //Inflate the menu; this adds to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello,menu );
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
