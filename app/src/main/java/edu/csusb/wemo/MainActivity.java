package edu.csusb.wemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    
    //Create icons for action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    //Code for choosing action bar item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_refresh:
                finish();
                overridePendingTransition(0,0); //gets rid of app closing 'animation'.
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.menu_about:
                startActivity(new Intent(this,AboutActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
