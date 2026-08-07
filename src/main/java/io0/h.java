package io0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\n\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"", "value", "Lio0/b;", "a", "(J)J", "valueNs", "origin", "Lio0/e;", "unit", "b", "(JJLio0/e;)J", "origin1", "origin2", DateTokenConverter.CONVERTER_KEY, "value1", "value2", "c", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    private static final long a(long j11) {
        return j11 < 0 ? b.INSTANCE.b() : b.INSTANCE.a();
    }

    public static final long b(long j11, long j12, e unit) {
        s.k(unit, "unit");
        return (1 | (j12 - 1)) == Long.MAX_VALUE ? b.L(a(j12)) : c(j11, j12, unit);
    }

    private static final long c(long j11, long j12, e eVar) {
        long j13 = j11 - j12;
        if (((j13 ^ j11) & (~(j13 ^ j12))) >= 0) {
            return d.t(j13, eVar);
        }
        e eVar2 = e.MILLISECONDS;
        if (eVar.compareTo(eVar2) >= 0) {
            return b.L(a(j13));
        }
        long jB = f.b(1L, eVar2, eVar);
        long j14 = (j11 / jB) - (j12 / jB);
        long j15 = (j11 % jB) - (j12 % jB);
        b.Companion companion = b.INSTANCE;
        return b.F(d.t(j14, eVar2), d.t(j15, eVar));
    }

    public static final long d(long j11, long j12, e unit) {
        s.k(unit, "unit");
        if (((j12 - 1) | 1) == Long.MAX_VALUE) {
            return j11 == j12 ? b.INSTANCE.c() : b.L(a(j12));
        }
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? a(j11) : c(j11, j12, unit);
    }
}
