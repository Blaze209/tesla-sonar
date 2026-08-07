package io0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "value", "Lio0/e;", "sourceUnit", "targetUnit", "a", "(DLio0/e;Lio0/e;)D", "", "c", "(JLio0/e;Lio0/e;)J", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class f {
    public static final double a(double d11, e sourceUnit, e targetUnit) {
        s.k(sourceUnit, "sourceUnit");
        s.k(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return jConvert > 0 ? d11 * jConvert : d11 / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    public static final long b(long j11, e sourceUnit, e targetUnit) {
        s.k(sourceUnit, "sourceUnit");
        s.k(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j11, sourceUnit.getTimeUnit());
    }

    public static final long c(long j11, e sourceUnit, e targetUnit) {
        s.k(sourceUnit, "sourceUnit");
        s.k(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j11, sourceUnit.getTimeUnit());
    }
}
