package fl0;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"", "timestamp", "Lfl0/b;", "a", "(Ljava/lang/Long;)Lfl0/b;", "Ljava/util/Calendar;", "c", "(Ljava/util/Calendar;Ljava/lang/Long;)Lfl0/b;", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "Ljava/util/TimeZone;", "GMT_TIMEZONE", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f66038a = DesugarTimeZone.getTimeZone("GMT");

    public static final GMTDate a(Long l11) {
        Calendar calendar = Calendar.getInstance(f66038a, Locale.ROOT);
        s.h(calendar);
        return c(calendar, l11);
    }

    public static /* synthetic */ GMTDate b(Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        return a(l11);
    }

    public static final GMTDate c(Calendar calendar, Long l11) {
        s.k(calendar, "<this>");
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        int i11 = calendar.get(15) + calendar.get(16);
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), d.INSTANCE.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), c.INSTANCE.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i11));
    }
}
