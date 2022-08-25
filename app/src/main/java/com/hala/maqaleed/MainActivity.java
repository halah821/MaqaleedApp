package com.hala.maqaleed;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    CustomSwipeAdapter swdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //action bar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //flip curl
        ViewPager mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setPageTransformer(true, new ZoomOutPageTransformer());

        viewpager =(ViewPager) findViewById(R.id.pager);
        swdapter = new CustomSwipeAdapter(this);
        viewpager.setAdapter(swdapter);
        viewpager.setCurrentItem(swdapter.getCount() - 1, false);

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

        switch(item.getItemId()){
            case R.id.azkar_sabah:
                viewpager.setCurrentItem(205,true);
                break;
            case R.id.azkar_masa:
                viewpager.setCurrentItem(154,true);
                break;
            case R.id.ayat_herz:
                viewpager.setCurrentItem(123,true);
                break;
            case R.id.manzel:
                viewpager.setCurrentItem(111,true);
                break;
            case R.id.ayat_weqaya:
                viewpager.setCurrentItem(87,true);
                break;
            case R.id.ayat_shefa:
                viewpager.setCurrentItem(80,true);
                break;
            case R.id.doaa_anas:
                viewpager.setCurrentItem(77,true);
                break;
            case R.id.doaa_salat:
                viewpager.setCurrentItem(74,true);
                break;
            case R.id.ad3yat_isti3aza:
                viewpager.setCurrentItem(66,true);
                break;
            case R.id.friday_doaa:
                viewpager.setCurrentItem(61,true);
                break;
            case R.id.saturday_doaa:
                viewpager.setCurrentItem(54,true);
                break;
            case R.id.sunday_doaa:
                viewpager.setCurrentItem(46,true);
                break;
            case R.id.monday_doaa:
                viewpager.setCurrentItem(39,true);
                break;
            case R.id.tuesday_doaa:
                viewpager.setCurrentItem(31,true);
                break;
            case R.id.wednesday_doaa:
                viewpager.setCurrentItem(22,true);
                break;
            case R.id.thursday_doaa:
                viewpager.setCurrentItem(12,true);
                break;
        }

        return false;
    }
}
