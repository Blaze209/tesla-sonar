package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
final class t extends a<Integer> implements k0<Integer, g0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Integer f94741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient Integer f94742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient char f94743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient net.time4j.engine.s<net.time4j.engine.q<?>, BigDecimal> f94744h;

    private t(String str, int i11, Integer num, Integer num2, char c11) {
        super(str);
        this.f94740d = i11;
        this.f94741e = num;
        this.f94742f = num2;
        this.f94743g = c11;
        this.f94744h = new l0(this, false);
    }

    static t p(String str, int i11, int i12, int i13, char c11) {
        return new t(str, i11, Integer.valueOf(i12), Integer.valueOf(i13), c11);
    }

    private Object readResolve() throws InvalidObjectException {
        Object objF0 = g0.F0(name());
        if (objF0 != null) {
            return objF0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.k0
    public /* bridge */ /* synthetic */ p<g0> g(Number number) {
        return super.o((Integer) number);
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f94743g;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean n() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer s() {
        return this.f94742f;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer t() {
        return this.f94741e;
    }

    int s() {
        return this.f94740d;
    }
}
