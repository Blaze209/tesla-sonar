package j$.time.format;

import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f82145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82146b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82147c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f82148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f82149e;

    public u(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f82148d = arrayList;
        this.f82149e = null;
        this.f82145a = dateTimeFormatter;
        arrayList.add(new b0());
    }

    public final boolean a(char c11, char c12) {
        if (this.f82146b) {
            return c11 == c12;
        }
        return b(c11, c12);
    }

    public final boolean g(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13) {
        if (i11 + i13 <= charSequence.length() && i12 + i13 <= charSequence2.length()) {
            if (this.f82146b) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (charSequence.charAt(i11 + i14) == charSequence2.charAt(i12 + i14)) {
                    }
                }
                return true;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                char cCharAt = charSequence.charAt(i11 + i15);
                char cCharAt2 = charSequence2.charAt(i12 + i15);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    public final b0 c() {
        ArrayList arrayList = this.f82148d;
        return (b0) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) ((HashMap) c().f82077a).get(aVar);
    }

    public final int f(j$.time.temporal.p pVar, long j11, int i11, int i12) {
        Objects.requireNonNull(pVar, "field");
        Long l11 = (Long) ((HashMap) c().f82077a).put(pVar, Long.valueOf(j11));
        return (l11 == null || l11.longValue() == j11) ? i12 : ~i11;
    }

    public final void e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f82078b = zoneId;
    }

    public final String toString() {
        return c().toString();
    }
}
