package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
final class m extends net.time4j.engine.e<BigDecimal> implements c1<BigDecimal> {
    private static final long serialVersionUID = -4837430960549551204L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient BigDecimal f94682a;

    m(String str, BigDecimal bigDecimal) {
        super(str);
        this.f94682a = bigDecimal;
    }

    private Object readResolve() throws InvalidObjectException {
        Object objC0 = h0.C0(name());
        if (objC0 != null) {
            return objC0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.p
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.e
    protected boolean n() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BigDecimal s() {
        return this.f94682a;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BigDecimal t() {
        return BigDecimal.ZERO;
    }
}
