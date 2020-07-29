package com.zahturn.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] dices = new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        Button roll = findViewById(R.id.btn_roll);
        final ImageView dice1 = findViewById(R.id.image_dice1);
        final ImageView dice2 = findViewById(R.id.image_dice2);

        //roll.setOnClickListener(this);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(6);
                dice1.setImageResource(dices[num]);

                num = random.nextInt(6);
                dice2.setImageResource(dices[num]);
            }
        });
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }
}
