package jo0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "Ljn0/h0;", "a", "(J[BIII)V", "", "hexDashString", "Ljo0/a;", "c", "(Ljava/lang/String;)Ljo0/a;", "hexString", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class b {
    public static final void a(long j11, byte[] dst, int i11, int i12, int i13) {
        s.k(dst, "dst");
        c.f(j11, dst, i11, i12, i13);
    }

    public static final a b(String hexString) {
        s.k(hexString, "hexString");
        return c.h(hexString);
    }

    public static final a c(String hexDashString) {
        s.k(hexDashString, "hexDashString");
        return c.i(hexDashString);
    }
}
