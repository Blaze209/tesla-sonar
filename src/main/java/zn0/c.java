package zn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzn0/c;", "", "<init>", "()V", "", "bitCount", "b", "(I)I", "c", "()I", "until", DateTokenConverter.CONVERTER_KEY, "from", "e", "(II)I", "", "f", "()J", "g", "(JJ)J", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f128448b = pn0.b.f103476a.b();

    /* JADX INFO: renamed from: zn0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzn0/c$a;", "Lzn0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "b", "(I)I", "c", "()I", "until", DateTokenConverter.CONVERTER_KEY, "from", "e", "(II)I", "", "f", "()J", "g", "(JJ)J", "defaultRandom", "Lzn0/c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends c implements Serializable {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // zn0.c
        public int b(int bitCount) {
            return c.f128448b.b(bitCount);
        }

        @Override // zn0.c
        public int c() {
            return c.f128448b.c();
        }

        @Override // zn0.c
        public int d(int until) {
            return c.f128448b.d(until);
        }

        @Override // zn0.c
        public int e(int from, int until) {
            return c.f128448b.e(from, until);
        }

        @Override // zn0.c
        public long f() {
            return c.f128448b.f();
        }

        @Override // zn0.c
        public long g(long from, long until) {
            return c.f128448b.g(from, until);
        }

        private Companion() {
        }
    }

    public abstract int b(int bitCount);

    public int c() {
        return b(32);
    }

    public int d(int until) {
        return e(0, until);
    }

    public int e(int from, int until) {
        int iC;
        int i11;
        int iB;
        d.c(from, until);
        int i12 = until - from;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                iB = b(d.e(i12));
            } else {
                do {
                    iC = c() >>> 1;
                    i11 = iC % i12;
                } while ((iC - i11) + (i12 - 1) < 0);
                iB = i11;
            }
            return from + iB;
        }
        while (true) {
            int iC2 = c();
            if (from <= iC2 && iC2 < until) {
                return iC2;
            }
        }
    }

    public long f() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long g(long from, long until) {
        long jF;
        long j11;
        long jB;
        int iC;
        d.d(from, until);
        long j12 = until - from;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i11 = (int) j12;
                int i12 = (int) (j12 >>> 32);
                if (i11 != 0) {
                    iC = b(d.e(i11));
                } else if (i12 == 1) {
                    iC = c();
                } else {
                    jB = (((long) b(d.e(i12))) << 32) + (((long) c()) & 4294967295L);
                }
                jB = ((long) iC) & 4294967295L;
            } else {
                do {
                    jF = f() >>> 1;
                    j11 = jF % j12;
                } while ((jF - j11) + (j12 - 1) < 0);
                jB = j11;
            }
            return from + jB;
        }
        while (true) {
            long jF2 = f();
            if (from <= jF2 && jF2 < until) {
                return jF2;
            }
        }
    }
}
