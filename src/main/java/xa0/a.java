package xa0;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import android.util.LongSparseArray;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import expo.modules.contacts.Columns;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lxa0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lya0/a;", "a", "(Landroid/content/Context;)Lya0/a;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "", "", "c", "[Ljava/lang/String;", "EVENT_COLUMNS", DateTokenConverter.CONVERTER_KEY, "INSTANCE_COLUMNS", "e", "CALENDAR_COLUMNS", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f123142a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("CalendarBuilder");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String[] EVENT_COLUMNS = {Columns.ID, "title", "eventLocation", "allDay", "calendar_color", "organizer", "calendar_id", "eventStatus", "description"};

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String[] INSTANCE_COLUMNS = {"begin", "end", "event_id"};

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String[] CALENDAR_COLUMNS = {Columns.ID, "calendar_displayName", "calendar_color"};

    /* JADX INFO: renamed from: xa0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b \u0010\u0010R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b!\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010¨\u0006\""}, d2 = {"Lxa0/a$a;", "", "", "calendarID", "", "title", "location", "", "allDay", "calendarColor", "organizer", PermissionsResponse.STATUS_KEY, "description", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "h", "e", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "f", "g", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class EventData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int calendarID;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String location;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allDay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String calendarColor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String organizer;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int status;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        public EventData(int i11, String title, String location, boolean z11, String calendarColor, String organizer, int i12, String description) {
            s.k(title, "title");
            s.k(location, "location");
            s.k(calendarColor, "calendarColor");
            s.k(organizer, "organizer");
            s.k(description, "description");
            this.calendarID = i11;
            this.title = title;
            this.location = location;
            this.allDay = z11;
            this.calendarColor = calendarColor;
            this.organizer = organizer;
            this.status = i12;
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllDay() {
            return this.allDay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCalendarColor() {
            return this.calendarColor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCalendarID() {
            return this.calendarID;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventData)) {
                return false;
            }
            EventData eventData = (EventData) other;
            return this.calendarID == eventData.calendarID && s.f(this.title, eventData.title) && s.f(this.location, eventData.location) && this.allDay == eventData.allDay && s.f(this.calendarColor, eventData.calendarColor) && s.f(this.organizer, eventData.organizer) && this.status == eventData.status && s.f(this.description, eventData.description);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getOrganizer() {
            return this.organizer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.calendarID) * 31) + this.title.hashCode()) * 31) + this.location.hashCode()) * 31) + Boolean.hashCode(this.allDay)) * 31) + this.calendarColor.hashCode()) * 31) + this.organizer.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.description.hashCode();
        }

        public String toString() {
            return "EventData(calendarID=" + this.calendarID + ", title=" + this.title + ", location=" + this.location + ", allDay=" + this.allDay + ", calendarColor=" + this.calendarColor + ", organizer=" + this.organizer + ", status=" + this.status + ", description=" + this.description + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\t\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lxa0/a$b;", "", "", "begin", "end", "eventID", "<init>", "(JJJ)V", "a", "J", "()J", "setBegin", "(J)V", "b", "setEnd", "c", "setEventID", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long begin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long end;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long eventID;

        public b(long j11, long j12, long j13) {
            this.begin = j11;
            this.end = j12;
            this.eventID = j13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getBegin() {
            return this.begin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getEventID() {
            return this.eventID;
        }
    }

    private a() {
    }

    @SuppressLint({"Recycle", "MissingPermission"})
    public final ya0.a a(Context context) {
        String string;
        String hexString;
        s.k(context, "context");
        if (!za0.a.f128026a.a(context)) {
            g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Calendar read permission not granted!");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        ya0.a aVar2 = new ya0.a();
        try {
            Cursor cursorQuery = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, CALENDAR_COLUMNS, null, null, null);
            if (cursorQuery == null) {
                g gVar2 = logger;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("Failed to get calendar cursor for calendar sync query!");
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF2 = v0.f(x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return null;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    int i11 = cursorQuery.getInt(0);
                    try {
                        string = cursorQuery.getString(1);
                        if (string == null) {
                            string = Address.ADDRESS_NULL_PLACEHOLDER;
                        }
                    } catch (Exception e11) {
                        logger.d("Failed to get calendar name", e11);
                        string = "Unknown";
                    }
                    String str = string;
                    try {
                        hexString = Integer.toHexString(cursorQuery.getInt(2));
                    } catch (Exception e12) {
                        logger.d("Failed to get calendar color index", e12);
                        hexString = Integer.toHexString(0);
                    }
                    s.h(hexString);
                    aVar2.a(i11, str, hexString);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            h0 h0Var = h0.f84049a;
            sn0.b.a(cursorQuery, null);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(10, 0);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor cursorQuery2 = CalendarContract.Instances.query(contentResolver, INSTANCE_COLUMNS, timeInMillis, 172800000 + timeInMillis);
            if (cursorQuery2 == null) {
                g gVar3 = logger;
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVar3.getTag();
                String strG3 = gVar3.g("Failed to get instance cursor for calendar sync query!");
                zb0.a aVar4 = zb0.a.f128044a;
                Map mapF3 = v0.f(x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
                return null;
            }
            while (cursorQuery2.moveToNext()) {
                try {
                    long j11 = cursorQuery2.getLong(0);
                    long j12 = cursorQuery2.getLong(1);
                    long j13 = cursorQuery2.getLong(2);
                    arrayList.add(new b(j11, j12, j13));
                    hashSet.add(Long.valueOf(j13));
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        sn0.b.a(cursorQuery2, th4);
                        throw th5;
                    }
                }
            }
            h0 h0Var2 = h0.f84049a;
            sn0.b.a(cursorQuery2, null);
            int size = hashSet.size();
            String[] strArr = new String[size];
            StringBuilder sb2 = new StringBuilder("(");
            Iterator it = hashSet.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int i13 = i12 + 1;
                strArr[i12] = String.valueOf(((Number) it.next()).longValue());
                sb2.append('?');
                if (i12 < size - 1) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                i12 = i13;
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            t0 t0Var = t0.f86535a;
            String str2 = String.format("%s IN %s", Arrays.copyOf(new Object[]{Columns.ID, sb2.toString()}, 2));
            s.j(str2, "format(...)");
            LongSparseArray longSparseArray = new LongSparseArray();
            Cursor cursorQuery3 = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, EVENT_COLUMNS, str2, strArr, null);
            if (cursorQuery3 == null) {
                g gVar4 = logger;
                TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                String tag4 = gVar4.getTag();
                String strG4 = gVar4.g("Failed to get event cursor for calendar sync query!");
                zb0.a aVar5 = zb0.a.f128044a;
                Map mapF4 = v0.f(x.a(tag4, strG4));
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry4 : mapF4.entrySet()) {
                    zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                }
                firebaseCrashlytics4.recordException(new Exception(strG4));
                TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                vr0.a.INSTANCE.a(strG4, new Object[0]);
                return null;
            }
            while (cursorQuery3.moveToNext()) {
                try {
                    long j14 = cursorQuery3.getLong(0);
                    int i14 = cursorQuery3.getInt(6);
                    String string2 = cursorQuery3.getString(1);
                    String str3 = string2 == null ? "" : string2;
                    String string3 = cursorQuery3.getString(2);
                    String str4 = string3 == null ? "" : string3;
                    boolean z11 = cursorQuery3.getInt(3) == 1;
                    String hexString2 = Integer.toHexString(cursorQuery3.getInt(4));
                    s.j(hexString2, "toHexString(...)");
                    String string4 = cursorQuery3.getString(5);
                    String str5 = string4 == null ? "" : string4;
                    int i15 = cursorQuery3.getInt(7);
                    String string5 = cursorQuery3.getString(8);
                    longSparseArray.put(j14, new EventData(i14, str3, str4, z11, hexString2, str5, i15, string5 == null ? "" : string5));
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        sn0.b.a(cursorQuery3, th6);
                        throw th7;
                    }
                }
            }
            h0 h0Var3 = h0.f84049a;
            sn0.b.a(cursorQuery3, null);
            Iterator it2 = arrayList.iterator();
            s.j(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next = it2.next();
                s.j(next, "next(...)");
                b bVar = (b) next;
                EventData eventData = (EventData) longSparseArray.get(bVar.getEventID());
                if (eventData == null) {
                    g gVar5 = logger;
                    String str6 = "Unable to find event with ID " + bVar.getEventID();
                    TeslaLog teslaLog5 = TeslaLog.INSTANCE;
                    String tag5 = gVar5.getTag();
                    String strG5 = gVar5.g(str6);
                    zb0.a aVar6 = zb0.a.f128044a;
                    Map mapF5 = v0.f(x.a(tag5, strG5));
                    FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry5 : mapF5.entrySet()) {
                        zb0.a.f128044a.a((String) entry5.getKey(), (String) entry5.getValue());
                    }
                    firebaseCrashlytics5.recordException(new Exception(strG5));
                    TeslaLog.setTag$default(teslaLog5, tag5, false, 2, null);
                    vr0.a.INSTANCE.a(strG5, new Object[0]);
                } else {
                    long begin = bVar.getBegin();
                    long end = bVar.getEnd();
                    if (eventData.getAllDay()) {
                        TimeZone timeZone = TimeZone.getDefault();
                        begin -= (long) timeZone.getOffset(begin);
                        end = (end - ((long) timeZone.getOffset(end))) - ((long) 1000);
                    }
                    LongSparseArray longSparseArray2 = longSparseArray;
                    ya0.a aVar7 = aVar2;
                    aVar7.b(eventData.getCalendarID(), bVar.getEventID(), eventData.getTitle(), begin, end, eventData.getAllDay(), eventData.getLocation(), eventData.getCalendarColor(), eventData.getOrganizer(), eventData.getStatus(), eventData.getDescription());
                    longSparseArray = longSparseArray2;
                    aVar2 = aVar7;
                }
            }
            return aVar2;
        } catch (Exception e13) {
            logger.d("Failed to query calendar", e13);
            return null;
        }
    }
}
