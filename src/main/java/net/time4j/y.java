package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
final class y extends b<Long> implements k0<Long, h0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final net.time4j.engine.p<Long> f94832g = new y();
    private static final long serialVersionUID = 5930990958663061693L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Long f94833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Long f94834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient net.time4j.engine.s<net.time4j.engine.q<?>, BigDecimal> f94835f;

    private y() {
        this("DAY_OVERFLOW", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static y p(String str, long j11, long j12) {
        return new y(str, j11, j12);
    }

    private Object readResolve() throws InvalidObjectException {
        Object objC0 = h0.C0(name());
        if (objC0 != null) {
            return objC0;
        }
        if (name().equals("DAY_OVERFLOW")) {
            return f94832g;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.k0
    public /* bridge */ /* synthetic */ p<h0> g(Number number) {
        return super.o((Long) number);
    }

    @Override // net.time4j.engine.p
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long s() {
        return this.f94834e;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long t() {
        return this.f94833d;
    }

    private y(String str, long j11, long j12) {
        super(str);
        this.f94833d = Long.valueOf(j11);
        this.f94834e = Long.valueOf(j12);
        this.f94835f = new l0(this, true);
    }
}
