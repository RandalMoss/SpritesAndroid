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

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
    ImageView canvas;
    Button scanButton;
    ArrayList<Drawable> drawables = new ArrayList<Drawable>();
    int drawableWidth = 200;
    int drawableHeight = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDrawables();

        canvas = (ImageView)findViewById(R.id.canvas);

        scanButton = (Button)findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BarcodeActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
//                Random r = new Random();
//                int randomSprite = r.nextInt(drawables.size());
//                canvas.setImageDrawable(drawables.get(randomSprite));
            }
        });
        Intent bcActivity = this.getIntent();
        String barcode = bcActivity.getStringExtra("barcode");
        if(barcode != null){
            Log.i("Info", "Barcode is " + barcode);
            BigInteger bigBarcode = new BigInteger(barcode);
            int index = Math.abs(bigBarcode.intValue() % drawables.size());
            canvas.setImageDrawable(drawables.get(index));
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

    public void initDrawables(){
        try {
            Drawable drawable = this.getResources().getDrawable(R.drawable.agate);
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Drawable d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.antidote);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.apple);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.armor1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.armor2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.armor3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.axe1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.axe2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.axe3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.banana);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.bluepotion1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.bluepotion2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.bow1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.bow2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.bow3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.chestclosed);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.chestopen);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.crystal);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.dagger1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.dagger2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.dagger3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.diamond);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.gloves1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.gloves2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.gloves3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.goldbar);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.goldcoin);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.grapes);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.greenpotion1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.greenpotion2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.mace1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.mace2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.mace3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.mushroom);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.redpotion1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.redpotion2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.ruby);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sapphire);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.shield1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.shoes1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.shoes2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.shoes3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.spear1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.spear2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.spear3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword1);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword2);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword3);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword4);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword5);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);

            drawable = this.getResources().getDrawable(R.drawable.sword6);
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, drawableWidth, drawableHeight, true));
            drawables.add(d);
        }catch(NullPointerException e){
            Log.i("Error", "The resource was not found");
        }
    }
}