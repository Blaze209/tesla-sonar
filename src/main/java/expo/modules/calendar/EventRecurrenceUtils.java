package expo.modules.calendar;

import android.util.Log;
import expo.modules.core.arguments.ReadableArguments;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lexpo/modules/calendar/EventRecurrenceUtils;", "", "<init>", "()V", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "extractRecurrence", "Lexpo/modules/calendar/Recurrence;", "recurrenceRule", "Lexpo/modules/core/arguments/ReadableArguments;", "createRecurrenceRule", "", "opts", "expo-calendar_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventRecurrenceUtils {
    public static final EventRecurrenceUtils INSTANCE = new EventRecurrenceUtils();
    private static final SimpleDateFormat dateFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        dateFormat = simpleDateFormat;
    }

    private EventRecurrenceUtils() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    public final String createRecurrenceRule(Recurrence opts) {
        String str;
        s.k(opts, "opts");
        String frequency = opts.getFrequency();
        Integer interval = opts.getInterval();
        String endDate = opts.getEndDate();
        Integer occurrence = opts.getOccurrence();
        switch (frequency) {
            case "weekly":
                str = "FREQ=WEEKLY";
                break;
            case "yearly":
                str = "FREQ=YEARLY";
                break;
            case "daily":
                str = "FREQ=DAILY";
                break;
            case "monthly":
                str = "FREQ=MONTHLY";
                break;
            default:
                str = "";
                break;
        }
        if (interval != null) {
            str = str + ";INTERVAL=" + interval;
        }
        if (endDate != null) {
            return str + ";UNTIL=" + endDate;
        }
        if (occurrence == null) {
            return str;
        }
        return str + ";COUNT=" + occurrence;
    }

    public final Recurrence extractRecurrence(ReadableArguments recurrenceRule) {
        s.k(recurrenceRule, "recurrenceRule");
        String string = recurrenceRule.getString("frequency");
        String str = null;
        Integer numValueOf = recurrenceRule.containsKey("interval") ? Integer.valueOf(recurrenceRule.getInt("interval")) : null;
        Integer numValueOf2 = recurrenceRule.containsKey("occurrence") ? Integer.valueOf(recurrenceRule.getInt("occurrence")) : null;
        if (recurrenceRule.containsKey("endDate")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
            Object obj = recurrenceRule.get("endDate");
            if (obj instanceof String) {
                Date date = dateFormat.parse((String) obj);
                if (date != null) {
                    str = simpleDateFormat.format(date);
                } else {
                    Log.e(CalendarModule.INSTANCE.getTAG$expo_calendar_release(), "endDate is null");
                }
            } else if (obj instanceof Number) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((Number) obj).longValue());
                str = simpleDateFormat.format(calendar.getTime());
            }
        }
        s.h(string);
        return new Recurrence(string, numValueOf, str, numValueOf2);
    }

    public final SimpleDateFormat getDateFormat() {
        return dateFormat;
    }
}
