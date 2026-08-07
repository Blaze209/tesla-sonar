package j$.time;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static /* synthetic */ List c(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String b(long j11, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j11, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String a(long j11, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j11, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static ZoneId d(TimeZone timeZone) {
        String id2 = timeZone.getID();
        Map map = ZoneId.f81981a;
        Objects.requireNonNull(id2, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id2);
        if (str != null) {
            id2 = str;
        }
        return ZoneId.of(id2);
    }
}
