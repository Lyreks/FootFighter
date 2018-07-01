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
    SensorManager sensorManager;
    EnemyHandler enemyHandler;
    private int[] enemyHealth;
    boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enemyHandler = new EnemyHandler();

        steps = findViewById(R.id.tvSteps);
        tvCurrentHealth = findViewById(R.id.tvCurrentHealth);

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
            enemyHealth = enemyHandler.Update();
            tvCurrentHealth.setText(String.valueOf(enemyHealth[0]));
            //steps
            steps.setText(String.valueOf((int)event.values[0]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {}
}
