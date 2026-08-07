package ko0;

import j$.time.DayOfWeek;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "isoDayNumber", "j$/time/DayOfWeek", "Lkotlinx/datetime/DayOfWeek;", "a", "(I)Lj$/time/DayOfWeek;", "b", "(Lj$/time/DayOfWeek;)I", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries<DayOfWeek> f86431a = on0.a.a(DayOfWeek.values());
    }

    public static final DayOfWeek a(int i11) {
        if (1 <= i11 && i11 < 8) {
            return a.f86431a.get(i11 - 1);
        }
        throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i11).toString());
    }

    public static final int b(DayOfWeek dayOfWeek) {
        s.k(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }
}
