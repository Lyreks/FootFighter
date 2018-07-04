package io.github.lyreks.footfighter;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import io.github.lyreks.footfighter.Database.AppDatabase;
import io.github.lyreks.footfighter.EnemyClasses.EnemyHandler;
import io.github.lyreks.footfighter.EnemyClasses.EnemyInfo;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    TextView steps;
    TextView tvEnemyID;
    TextView tvEnemyCurrentHealth;
    TextView tvEnemyTotalHealth;
    SensorManager sensorManager;
    EnemyHandler enemyHandler;
    private EnemyInfo enemyInfo;
    boolean running = false;

    //Activity launched for the first time. Initialize here.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enemyInfo = new EnemyInfo();
        enemyHandler = new EnemyHandler();
        enemyInfo = enemyHandler.GetInfo();

        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name").build();

        steps = findViewById(R.id.tvSteps);
        tvEnemyID = findViewById(R.id.tvEnemyID);
        tvEnemyCurrentHealth = findViewById(R.id.tvEnemyCurrentHealth);
        tvEnemyTotalHealth = findViewById(R.id.tvEnemyTotalHealth);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }

    // User returns to the activity after another activity comes into foreground. (onPause)
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

    // User navigates to the activity after it's no longer visible (onStop).

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(running){
            //enemy
            tvEnemyID.setText(String.valueOf(enemyInfo.getID()));
            tvEnemyCurrentHealth.setText(String.valueOf(enemyInfo.getCurrentHealth()));
            tvEnemyTotalHealth.setText(String.valueOf(enemyInfo.getTotalHealth()));
            enemyHandler.Update();
            enemyInfo = enemyHandler.GetInfo();

            //steps
            steps.setText(String.valueOf((int)event.values[0]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {}

}
