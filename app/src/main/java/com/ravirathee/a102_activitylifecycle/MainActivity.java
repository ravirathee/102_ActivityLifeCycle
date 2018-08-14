package com.ravirathee.a102_activitylifecycle;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int i = 0;
    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.hello);
        bt = findViewById(R.id.button);
        bt.setOnClickListener(this);

        Toast.makeText(this,"Create",Toast.LENGTH_SHORT).show();

        if(savedInstanceState!=null)
        {
            int myInt = savedInstanceState.getInt("I");
//            i = myInt;
            tv.setText( Integer.toString(myInt) );
            Toast.makeText(getApplicationContext(),"Get Value"+myInt,Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstantState) {
        super.onSaveInstanceState(savedInstantState);
        Log.d("Tag",i+"value");
        Toast.makeText(this, "SaveInstanceState   "+ i, Toast.LENGTH_SHORT).show();
        savedInstantState.putInt("I", i);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:{
                i+=1;
                tv.setText(Integer.toString(i));
            }
        }
    }
}
