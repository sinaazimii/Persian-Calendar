package com.example.sina.taghvim;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;


import static com.example.sina.taghvim.MainActivity.pos;

public class Month_days_fragment extends Fragment{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_month_days_fragment,container,false);


        ArrayList<TextView> idArray = new ArrayList<TextView>() ;
        idArray.add((TextView)view.findViewById(R.id.textView1)) ;
        idArray.add((TextView)view.findViewById(R.id.textView2));
        idArray.add((TextView)view.findViewById(R.id.textView3));
        idArray.add((TextView)view.findViewById(R.id.textView4));
        idArray.add((TextView)view.findViewById(R.id.textView5));
        idArray.add((TextView)view.findViewById(R.id.textView6));
        idArray.add((TextView)view.findViewById(R.id.textView7));
        idArray.add((TextView)view.findViewById(R.id.textView8));
        idArray.add((TextView)view.findViewById(R.id.textView9));
        idArray.add((TextView)view.findViewById(R.id.textView10));
        idArray.add((TextView)view.findViewById(R.id.textView11));
        idArray.add((TextView)view.findViewById(R.id.textView12));
        idArray.add((TextView)view.findViewById(R.id.textView13));
        idArray.add((TextView)view.findViewById(R.id.textView14));
        idArray.add((TextView)view.findViewById(R.id.textView15));
        idArray.add((TextView)view.findViewById(R.id.textView16));
        idArray.add((TextView)view.findViewById(R.id.textView17));
        idArray.add((TextView)view.findViewById(R.id.textView18));
        idArray.add((TextView)view.findViewById(R.id.textView19));
        idArray.add((TextView)view.findViewById(R.id.textView20));
        idArray.add((TextView)view.findViewById(R.id.textView21));
        idArray.add((TextView)view.findViewById(R.id.textView22));
        idArray.add((TextView)view.findViewById(R.id.textView23));
        idArray.add((TextView)view.findViewById(R.id.textView24));
        idArray.add((TextView)view.findViewById(R.id.textView25));
        idArray.add((TextView)view.findViewById(R.id.textView26));
        idArray.add((TextView)view.findViewById(R.id.textView27));
        idArray.add((TextView)view.findViewById(R.id.textView28));
        idArray.add((TextView)view.findViewById(R.id.textView29));
        idArray.add((TextView)view.findViewById(R.id.textView30));
        idArray.add((TextView)view.findViewById(R.id.textView31));
        idArray.add((TextView)view.findViewById(R.id.textView32));
        idArray.add((TextView)view.findViewById(R.id.textView33));
        idArray.add((TextView)view.findViewById(R.id.textView34));
        idArray.add((TextView)view.findViewById(R.id.textView35));
        idArray.add((TextView)view.findViewById(R.id.textView36));
        idArray.add((TextView)view.findViewById(R.id.textView37));
        idArray.add((TextView)view.findViewById(R.id.textView38));
        idArray.add((TextView)view.findViewById(R.id.textView39));
        idArray.add((TextView)view.findViewById(R.id.textView40));
        idArray.add((TextView)view.findViewById(R.id.textView41));
        idArray.add((TextView)view.findViewById(R.id.textView42));

        JalaliCalendar my = new JalaliCalendar() ;
        int current_month_day = my.getDay() ;
        int day_of_week_int = my.getDayOfWeek() ;
        int firstDayOfMonthInt = (day_of_week_int) - (current_month_day)  ; //what was the first day of month (1-yekshanbe/2-doshanbe .
        /*midoonim k 1 farvardine 1396 she shanbe boode ino mizarim mabda !*/
        int firstDayOfYearInt = 3 ;
        int yearDaysCount = 0 ;   // 1 to 365
        int monthDaysCount ;
       /* if(pos==0){
            //farvardin
            monthDaysCount = 1;
            firstDayOfMonthInt = firstDayOfYearInt + yearDaysCount % 7 ;

        }*/
        Log.i("First day of month ",String.valueOf(pos));
        if(pos==9){
            monthDaysCount = 1;
            firstDayOfMonthInt = 6 ;
            for(int i = firstDayOfMonthInt ; monthDaysCount<31 ; i++) {
                idArray.get(i).setText(String.valueOf(monthDaysCount));
                monthDaysCount  ++ ;
            }
        }
        return view;
    }


}
