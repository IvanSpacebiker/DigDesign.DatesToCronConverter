package com.kazakov.ivan;

import java.util.Calendar;
import java.util.Comparator;

public class CalendarComparator implements Comparator<Calendar> {

    @Override
    public int compare(Calendar o1, Calendar o2) {
        return o1.compareTo(o2);
    }
}
