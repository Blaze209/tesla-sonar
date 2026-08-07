package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
final class l0 implements net.time4j.engine.s<net.time4j.engine.q<?>, BigDecimal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<? extends Number> f94680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94681b;

    l0(net.time4j.engine.p<? extends Number> pVar, boolean z11) {
        this.f94680a = pVar;
        this.f94681b = z11;
    }

    @Override // net.time4j.engine.s
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BigDecimal apply(net.time4j.engine.q<?> qVar) {
        long jLongValue = ((Number) qVar.s(this.f94680a)).longValue();
        long jLongValue2 = ((Number) qVar.k(this.f94680a)).longValue();
        long jLongValue3 = ((Number) qVar.o(this.f94680a)).longValue();
        if (jLongValue > jLongValue3) {
            jLongValue = jLongValue3;
        }
        if (jLongValue == jLongValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f94681b && (qVar instanceof h0) && !((h0) h0.class.cast(qVar)).v0(this.f94680a)) {
            if (jLongValue == jLongValue3) {
                return BigDecimal.ONE;
            }
            jLongValue3--;
        }
        return com.google.android.gms.internal.measurement.a.a(new BigDecimal(jLongValue - jLongValue2).setScale(15).divide(new BigDecimal((jLongValue3 - jLongValue2) + 1), RoundingMode.HALF_UP));
    }
}
