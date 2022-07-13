package com.example.sina.taghvim;
import java.util.ArrayList;
import java.util.Calendar ;
import java.util.Date;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.icu.util.ULocale;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity  {
    public static int pos=0;
    public TextView monthName;
    public TextView day ;
    public static int firstDayOfMonthInt ;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.month_days) ;
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager()) ;
        viewPager.setAdapter(customPagerAdapter) ;
        JalaliCalendar jc = new JalaliCalendar() ;
        int month = jc.getMonth() ;
        viewPager.setCurrentItem(month-1) ;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        monthName.setText("فروردین");
                        pos=0;
                        break;
                    case 1:
                        pos=1;
                        monthName.setText("اردیبهشت");
                        break;
                    case 2:
                        pos=2;
                        monthName.setText("خرداد");
                        break;
                    case 3:
                        pos=3;
                        monthName.setText("تیر");
                        break;
                    case 4:
                        pos=4;
                        monthName.setText("مرداد");
                        break;
                    case 5:
                        pos=5;
                        monthName.setText("شهریور");
                        break;
                    case 6:
                        pos=6;
                        monthName.setText("مهر");
                        break;
                    case 7:
                        pos=7;
                        monthName.setText("آبان");
                        break;
                    case 8:
                        pos=8;
                        monthName.setText("آذر");
                        break;
                    case 9:
                        pos=9;
                        monthName.setText("دی");
                        break;
                    case 10:
                        pos=10;
                        monthName.setText("بهمن");
                        break;
                    case 11:
                        pos=11;
                        monthName.setText("اسفند");
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        monthName = (TextView) findViewById(R.id.month_name) ;


    }
    @Override
    public void onResume() {   /*setting current month name */
        super.onResume();
        JalaliCalendar jc = new JalaliCalendar();
        String current_month = jc.getMonthString() ;
        monthName.setText(current_month);
    }
    public class CustomPagerAdapter extends FragmentPagerAdapter{
        public CustomPagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }
        @Override
        public int getCount(){
            return 12 ;
        }
        @Override
        public Fragment getItem(int position){

           return new Month_days_fragment() ;
        }
    }

}
