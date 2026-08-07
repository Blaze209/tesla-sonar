package p019p1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vn0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\r\u0088\u0001\t\u0092\u0001\u00020\b¨\u0006\u000e"}, d2 = {"Lp1/h1;", "", "", "offsetMillis", "Lp1/i1;", "offsetType", "a", "(II)J", "", "value", "b", "(J)J", "e", "(J)I", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b
public final class h1 {
    public static long a(int i11, int i12) {
        return b(i11 * i12);
    }

    public static /* synthetic */ long c(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            i12 = i1.INSTANCE.a();
        }
        return a(i11, i12);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static int e(long j11) {
        return Long.hashCode(j11);
    }

    private static long b(long j11) {
        return j11;
    }
}
