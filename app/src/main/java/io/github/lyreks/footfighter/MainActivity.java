package io.github.lyreks.footfighter;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import io.github.lyreks.footfighter.EnemyClasses.EnemyHandler;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    TextView steps;
    TextView tvCurrentHealth;
    TextView tvTotalHealth;
    SensorManager sensorManager;
    EnemyHandler enemyHandler;
    private int[] enemyInfo = new int[2];
    boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enemyHandler = new EnemyHandler();
        enemyInfo = enemyHandler.ReturnInfo();

        steps = findViewById(R.id.tvSteps);
        tvCurrentHealth = findViewById(R.id.tvCurrentHealth);
        tvTotalHealth = findViewById(R.id.tvTotalHealth);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }

    protected void onResume(){
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor != null){
            sensorManager.registerListener(this, countSensor, SensorManager.SENSOR_DELAY_GAME);
        } else{
            Toast.makeText(this, "Sensor not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void onPause(){
        super.onPause();
        running = false;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(running){
            //enemy
            tvCurrentHealth.setText(String.valueOf(enemyInfo[0]));
            tvTotalHealth.setText(String.valueOf(enemyInfo[1]));
            enemyInfo = enemyHandler.Update();
            //steps
            steps.setText(String.valueOf((int)event.values[0]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {}
}
