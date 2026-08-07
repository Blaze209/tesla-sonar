package com.google.android.libraries.places.api.model;

import android.util.Log;
import com.google.android.libraries.places.internal.zzja;
import com.google.android.libraries.places.internal.zzjb;
import com.google.android.libraries.places.internal.zzjk;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class zzbe {
    private static final zzjb zza;
    private static final LocalTime zzb;

    static {
        zzja zzjaVar = new zzja();
        zzjaVar.zza(1, DayOfWeek.SUNDAY);
        zzjaVar.zza(2, DayOfWeek.MONDAY);
        zzjaVar.zza(3, DayOfWeek.TUESDAY);
        zzjaVar.zza(4, DayOfWeek.WEDNESDAY);
        zzjaVar.zza(5, DayOfWeek.THURSDAY);
        zzjaVar.zza(6, DayOfWeek.FRIDAY);
        zzjaVar.zza(7, DayOfWeek.SATURDAY);
        zza = zzjaVar.zzb();
        zzb = LocalTime.newInstance(23, 59);
    }

    static Boolean zza(Place place, long j11) {
        TimeZone timeZone;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        OpeningHours openingHours = place.getOpeningHours();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (openingHours == null || utcOffsetMinutes == null) {
            return null;
        }
        List<Period> periods = openingHours.getPeriods();
        if (periods.isEmpty()) {
            return Boolean.FALSE;
        }
        if (periods.size() == 1) {
            Period period = periods.get(0);
            TimeOfWeek open = period.getOpen();
            if (period.getClose() == null && open != null && open.getDay() == DayOfWeek.SUNDAY && open.getTime().getHours() == 0 && open.getTime().getMinutes() == 0) {
                return Boolean.TRUE;
            }
        }
        for (Period period2 : periods) {
            if (period2.getOpen() == null || period2.getClose() == null) {
                return null;
            }
        }
        String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis(utcOffsetMinutes.intValue()));
        if (availableIDs == null || availableIDs.length <= 0) {
            Log.w("Places", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", utcOffsetMinutes));
            timeZone = null;
        } else {
            timeZone = DesugarTimeZone.getTimeZone(availableIDs[0]);
        }
        if (timeZone == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j11);
        DayOfWeek dayOfWeek = (DayOfWeek) zza.get(Integer.valueOf(calendar.get(7)));
        LocalTime localTimeNewInstance = LocalTime.newInstance(calendar.get(11), calendar.get(12));
        EnumMap enumMap = new EnumMap(DayOfWeek.class);
        if (!periods.isEmpty()) {
            Period periodBuild = periods.get(0);
            int i11 = 0;
            while (periodBuild != null) {
                TimeOfWeek open2 = periodBuild.getOpen();
                TimeOfWeek close = periodBuild.getClose();
                if (open2 == null || close == null) {
                    i11++;
                    periodBuild = i11 >= periods.size() ? null : periods.get(i11);
                } else {
                    DayOfWeek day = open2.getDay();
                    LocalTime time = open2.getTime();
                    if (open2.getDay() != close.getDay()) {
                        LocalTime localTime = zzb;
                        List list = (List) zzb(enumMap, day, new ArrayList());
                        list.add(zzjk.zzc(time, localTime));
                        enumMap.put(day, list);
                        TimeOfWeek timeOfWeekNewInstance = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                        TimeOfWeek close2 = periodBuild.getClose();
                        Period.Builder builder = Period.builder();
                        builder.setOpen(timeOfWeekNewInstance);
                        builder.setClose(close2);
                        periodBuild = builder.build();
                    } else {
                        LocalTime time2 = close.getTime();
                        List list2 = (List) zzb(enumMap, day, new ArrayList());
                        list2.add(zzjk.zzd(time, time2));
                        enumMap.put(day, list2);
                        i11++;
                        if (i11 < periods.size()) {
                            periodBuild = periods.get(i11);
                        }
                    }
                }
            }
        }
        List list3 = (List) enumMap.get(dayOfWeek);
        if (list3 == null) {
            return Boolean.FALSE;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            if (((zzjk) it.next()).zze(localTimeNewInstance)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static Object zzb(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }
}
