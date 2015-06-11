package com.toramoss.spritetest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.toramoss.spritetest.Sprite.*;
import com.toramoss.spritetest.Sprite.Character;

import java.math.BigInteger;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    ImageView canvas;
    Button scanButton;
    int drawableWidth = 200;
    int drawableHeight = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(SpriteGenerator.hasLoaded == false) {
            SpriteGenerator.initDrawables(this.getResources(), drawableWidth, drawableHeight);
            SpriteGenerator.hasLoaded = true;
        }

        canvas = (ImageView)findViewById(R.id.canvas);

        scanButton = (Button)findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BarcodeActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        Intent bcActivity = this.getIntent();
        String barcode = bcActivity.getStringExtra("barcode");
        if(barcode != null){
            Log.i("Info", "Barcode is " + barcode);
            BigInteger bigBarcode = new BigInteger(barcode);
            Sprite newSprite = SpriteGenerator.generateSprite(bigBarcode.intValue());
            canvas.setImageDrawable(newSprite.getDrawable());
            Log.i("Sprite", newSprite.toString());
        }
        else{
            Log.i("Info", "Barcode is null");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}