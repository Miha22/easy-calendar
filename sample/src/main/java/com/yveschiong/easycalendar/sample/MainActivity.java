package com.yveschiong.easycalendar.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yveschiong.easycalendar.R;
import com.yveschiong.easycalendar.models.Event;
import com.yveschiong.easycalendar.utils.CalendarUtils;
import com.yveschiong.easycalendar.views.DayView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar startCalendar = CalendarUtils.createCalendar();
        startCalendar.add(Calendar.HOUR_OF_DAY, 5);

        Calendar endCalendar = CalendarUtils.createCalendar();
        endCalendar.add(Calendar.HOUR_OF_DAY, 10);

        DayView dayView = findViewById(R.id.dayView);
        dayView.addEvent(new Event("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam lobortis scelerisque ante, a porttitor eros interdum ut. Aliquam eu viverra ipsum. Vestibulum vel risus massa. Suspendisse ligula turpis, congue eu ipsum vestibulum, porta tincidunt nibh. Curabitur tincidunt dictum molestie. Quisque consectetur libero ac ornare pulvinar. In dapibus mi quis tristique molestie. Donec fermentum pretium enim ac sagittis. Duis ut venenatis sapien. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed faucibus ornare diam, sed laoreet lacus commodo eget. In ultricies sodales odio eget imperdiet. Nunc lobortis turpis et est euismod, ac dapibus massa lobortis. Mauris porta odio vitae risus molestie fermentum. Praesent a arcu urna.", "Test Event Description", startCalendar, endCalendar));

        startCalendar = CalendarUtils.createCalendar();
        startCalendar.add(Calendar.HOUR_OF_DAY, 14);
        startCalendar.add(Calendar.MINUTE, 20);

        endCalendar = CalendarUtils.createCalendar();
        endCalendar.add(Calendar.HOUR_OF_DAY, 18);
        endCalendar.add(Calendar.MINUTE, 45);

        dayView.addEvent(new Event("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam lobortis scelerisque ante, a porttitor eros interdum ut.", "Test Event Description 2", startCalendar, endCalendar));

        startCalendar = CalendarUtils.createCalendar();
        startCalendar.add(Calendar.HOUR_OF_DAY, 20);

        endCalendar = CalendarUtils.createCalendar();
        endCalendar.add(Calendar.HOUR_OF_DAY, 22);

        dayView.addEvent(new Event("Test Event Name 3", "Test Event Description 3", startCalendar, endCalendar));
    }
}
