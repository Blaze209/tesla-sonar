package rz;

import j$.util.DesugarTimeZone;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static TimeZone f109277d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static TreeMap<String, Integer> f109274a = new TreeMap<>(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static TreeMap<String, Integer> f109275b = new TreeMap<>(new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashSet<String> f109276c = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static TreeMap<String, TimeZone> f109278e = new TreeMap<>();

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        f109276c.add("à");
        f109276c.add("at");
        f109276c.add("MEZ");
        f109276c.add("Uhr");
        f109276c.add("h");
        f109276c.add("pm");
        f109276c.add("PM");
        f109276c.add("am");
        f109276c.add("AM");
        f109276c.add("min");
        f109276c.add("um");
        f109276c.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            f109278e.put(str, DesugarTimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i11 = 0; i11 < months.length; i11++) {
                    if (months[i11].length() != 0) {
                        d(f109274a, months[i11], Integer.valueOf(i11));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i12 = 0; i12 < shortMonths.length; i12++) {
                    String str2 = shortMonths[i12];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        d(f109274a, shortMonths[i12], Integer.valueOf(i12));
                        d(f109274a, shortMonths[i12].replace(".", ""), Integer.valueOf(i12));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i13 = 0; i13 < weekdays.length; i13++) {
                    String str3 = weekdays[i13];
                    if (str3.length() != 0) {
                        d(f109275b, str3, Integer.valueOf(i13));
                        d(f109275b, str3.replace(".", ""), Integer.valueOf(i13));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i14 = 0; i14 < shortWeekdays.length; i14++) {
                    String str4 = shortWeekdays[i14];
                    if (str4.length() != 0) {
                        d(f109275b, str4, Integer.valueOf(i14));
                        d(f109275b, str4.replace(".", ""), Integer.valueOf(i14));
                    }
                }
            }
        }
    }

    private static Date a(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return b(stringTokenizer, calendar, str);
    }

    private static Date b(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        calendar.set(11, Integer.parseInt(k(stringTokenizer, str, calendar)));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strK = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strK == null) {
            return calendar.getTime();
        }
        calendar.set(12, Integer.parseInt(strK));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strK2 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strK2 == null) {
            return calendar.getTime();
        }
        calendar.set(13, Integer.parseInt(strK2));
        if (!stringTokenizer.hasMoreTokens()) {
            return calendar.getTime();
        }
        String strK3 = k(stringTokenizer, stringTokenizer.nextToken(), calendar);
        if (strK3 == null) {
            return calendar.getTime();
        }
        String strK4 = k(stringTokenizer, strK3, calendar);
        if (strK4.length() == 4 && Character.isDigit(strK4.charAt(0))) {
            calendar.set(1, h(strK4));
        }
        return calendar.getTime();
    }

    public static Date c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.length() == 4 && Character.isDigit(strNextToken.charAt(0))) {
            return g(stringTokenizer, strNextToken);
        }
        if (f109275b.containsKey(strNextToken)) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        if (f109274a.containsKey(strNextToken)) {
            return f(stringTokenizer, strNextToken);
        }
        if (Character.isDigit(strNextToken.charAt(0))) {
            return e(stringTokenizer, strNextToken);
        }
        return null;
    }

    private static void d(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    private static Date e(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        gregorianCalendarI.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(1, h(stringTokenizer.nextToken()));
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    private static Date f(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        Integer num = f109274a.get(str);
        if (num == null) {
            throw new NullPointerException("can not parse " + str + " as month");
        }
        gregorianCalendarI.set(2, num.intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(5, Integer.parseInt(stringTokenizer.nextToken()));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (Character.isLetter(strNextToken.charAt(0))) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        if (strNextToken.length() == 4) {
            gregorianCalendarI.set(1, h(strNextToken));
        } else if (strNextToken.length() == 2) {
            return b(stringTokenizer, gregorianCalendarI, strNextToken);
        }
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    private static Date g(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        gregorianCalendarI.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarI.getTime();
        }
        gregorianCalendarI.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarI.getTime();
        }
        String strNextToken = stringTokenizer.nextToken();
        if (!Character.isDigit(strNextToken.charAt(0))) {
            return gregorianCalendarI.getTime();
        }
        if (strNextToken.length() == 5 && strNextToken.charAt(2) == 'T') {
            gregorianCalendarI.set(5, Integer.parseInt(strNextToken.substring(0, 2)));
            return a(stringTokenizer, gregorianCalendarI, strNextToken.substring(3));
        }
        gregorianCalendarI.set(5, Integer.parseInt(strNextToken));
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    private static int h(String str) {
        int i11 = Integer.parseInt(str);
        if (i11 < 100) {
            return i11 > 30 ? i11 + 2000 : i11 + 1900;
        }
        return i11;
    }

    private static GregorianCalendar i() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = f109277d;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    private static Integer j(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = f109274a.get(str);
        if (num != null) {
            return num;
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    private static String k(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = f109278e.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                if (!f109276c.contains(str)) {
                    return str;
                }
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }
}
