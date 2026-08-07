package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i DATE_BASIC;
    public static final i DATE_EXTENDED;
    public static final i DATE_TIME_BASIC;
    public static final i DATE_TIME_EXTENDED;
    public static final i HCARD_DATE_TIME;
    public static final i UTC_DATE_TIME_BASIC;
    public static final i UTC_DATE_TIME_EXTENDED;
    protected final String formatStr;

    static enum a extends i {

        /* JADX INFO: renamed from: ezvcard.util.i$a$a, reason: collision with other inner class name */
        class C1302a extends SimpleDateFormat {
            C1302a(String str) {
                super(str);
            }

            @Override // java.text.SimpleDateFormat, java.text.DateFormat
            public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                StringBuffer stringBuffer2 = super.format(date, stringBuffer, fieldPosition);
                stringBuffer2.insert(stringBuffer2.length() - 2, CoreConstants.COLON_CHAR);
                return stringBuffer2;
            }
        }

        a(String str, int i11, String str2) {
            super(str, i11, str2, null);
        }

        @Override // ezvcard.util.i
        public DateFormat getDateFormat(TimeZone timeZone) {
            C1302a c1302a = new C1302a(this.formatStr);
            if (timeZone != null) {
                c1302a.setTimeZone(timeZone);
            }
            return c1302a;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f63687c = Pattern.compile("^(\\d{4})-?(\\d{2})-?(\\d{2})(T(\\d{2}):?(\\d{2}):?(\\d{2})(\\.\\d+)?(Z|([-+])((\\d{2})|((\\d{2}):?(\\d{2}))))?)?$");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Matcher f63688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f63689b;

        public d(String str) {
            Matcher matcher = f63687c.matcher(str);
            this.f63688a = matcher;
            this.f63689b = matcher.find();
        }

        private int j(int i11) {
            return Integer.parseInt(this.f63688a.group(i11));
        }

        public int a() {
            return j(3);
        }

        public boolean b() {
            return this.f63688a.group(9) != null;
        }

        public boolean c() {
            return this.f63688a.group(5) != null;
        }

        public int d() {
            return j(5);
        }

        public boolean e() {
            return this.f63689b;
        }

        public int f() {
            if (this.f63688a.group(8) == null) {
                return 0;
            }
            return (int) Math.round(Double.parseDouble(this.f63688a.group(8)) * 1000.0d);
        }

        public int g() {
            return j(6);
        }

        public int h() {
            return j(2);
        }

        public int i() {
            int iJ;
            int iJ2 = 0;
            if (this.f63688a.group(9).equals("Z")) {
                return 0;
            }
            int i11 = this.f63688a.group(10).equals(Marker.ANY_NON_NULL_MARKER) ? 1 : -1;
            if (this.f63688a.group(12) != null) {
                iJ = j(12);
            } else {
                iJ = j(14);
                iJ2 = j(15);
            }
            return ((iJ * 3600000) + (iJ2 * 60000)) * i11;
        }

        public int k() {
            return j(7);
        }

        public int l() {
            return j(1);
        }
    }

    static {
        i iVar = new i("DATE_BASIC", 0, "yyyyMMdd");
        DATE_BASIC = iVar;
        i iVar2 = new i("DATE_EXTENDED", 1, "yyyy-MM-dd");
        DATE_EXTENDED = iVar2;
        i iVar3 = new i("DATE_TIME_BASIC", 2, "yyyyMMdd'T'HHmmssZ");
        DATE_TIME_BASIC = iVar3;
        a aVar = new a("DATE_TIME_EXTENDED", 3, "yyyy-MM-dd'T'HH:mm:ssZ");
        DATE_TIME_EXTENDED = aVar;
        i iVar4 = new i("UTC_DATE_TIME_BASIC", 4, "yyyyMMdd'T'HHmmss'Z'") { // from class: ezvcard.util.i.b
            {
                a aVar2 = null;
            }

            @Override // ezvcard.util.i
            public DateFormat getDateFormat(TimeZone timeZone) {
                return super.getDateFormat(DesugarTimeZone.getTimeZone("UTC"));
            }
        };
        UTC_DATE_TIME_BASIC = iVar4;
        i iVar5 = new i("UTC_DATE_TIME_EXTENDED", 5, "yyyy-MM-dd'T'HH:mm:ss'Z'") { // from class: ezvcard.util.i.c
            {
                a aVar2 = null;
            }

            @Override // ezvcard.util.i
            public DateFormat getDateFormat(TimeZone timeZone) {
                return super.getDateFormat(DesugarTimeZone.getTimeZone("UTC"));
            }
        };
        UTC_DATE_TIME_EXTENDED = iVar5;
        i iVar6 = new i("HCARD_DATE_TIME", 6, "yyyy-MM-dd'T'HH:mm:ssZ");
        HCARD_DATE_TIME = iVar6;
        $VALUES = new i[]{iVar, iVar2, iVar3, aVar, iVar4, iVar5, iVar6};
    }

    /* synthetic */ i(String str, int i11, String str2, a aVar) {
        this(str, i11, str2);
    }

    public static boolean dateHasTime(String str) {
        return str.contains("T");
    }

    public static boolean dateHasTimezone(String str) {
        return str.endsWith("Z") || str.matches(".*?[-+]\\d\\d:?\\d\\d");
    }

    public static Date parse(String str) {
        d dVar = new d(str);
        if (!dVar.e()) {
            throw xj0.b.INSTANCE.getIllegalArgumentException(41, str);
        }
        Calendar calendar = Calendar.getInstance(dVar.b() ? DesugarTimeZone.getTimeZone("UTC") : TimeZone.getDefault());
        calendar.clear();
        calendar.set(1, dVar.l());
        calendar.set(2, dVar.h() - 1);
        calendar.set(5, dVar.a());
        if (dVar.c()) {
            calendar.set(11, dVar.d());
            calendar.set(12, dVar.g());
            calendar.set(13, dVar.k());
            calendar.set(14, dVar.f());
            if (dVar.b()) {
                calendar.set(15, dVar.i());
            }
        }
        return calendar.getTime();
    }

    public static TimeZone parseTimeZoneId(String str) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(str);
        if ("GMT".equals(timeZone.getID())) {
            return null;
        }
        return timeZone;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public String format(Date date) {
        return format(date, null);
    }

    public DateFormat getDateFormat() {
        return getDateFormat(null);
    }

    private i(String str, int i11, String str2) {
        super(str, i11);
        this.formatStr = str2;
    }

    public String format(Date date, TimeZone timeZone) {
        return getDateFormat(timeZone).format(date);
    }

    public DateFormat getDateFormat(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.formatStr);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }
}
