package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes9.dex */
final class u extends b<Integer> implements k0<Integer, h0> {
    private static final long serialVersionUID = -1337148214680014674L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Integer f94827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient Integer f94828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient char f94829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient net.time4j.engine.s<net.time4j.engine.q<?>, BigDecimal> f94830h;

    private u(String str, int i11, Integer num, Integer num2, char c11) {
        super(str);
        this.f94826d = i11;
        this.f94827e = num;
        this.f94828f = num2;
        this.f94829g = c11;
        this.f94830h = new l0(this, i11 == 5 || i11 == 7 || i11 == 9 || i11 == 13);
    }

    static u p(String str, boolean z11) {
        return new u(str, z11 ? 2 : 1, 1, Integer.valueOf(z11 ? 24 : 12), z11 ? 'k' : 'h');
    }

    static u q(String str, int i11, int i12, int i13, char c11) {
        return new u(str, i11, Integer.valueOf(i12), Integer.valueOf(i13), c11);
    }

    private Object readResolve() throws InvalidObjectException {
        Object objC0 = h0.C0(name());
        if (objC0 != null) {
            return objC0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.k0
    public /* bridge */ /* synthetic */ p<h0> g(Number number) {
        return super.o((Integer) number);
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f94829g;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
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
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer s() {
        return this.f94828f;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer t() {
        return this.f94827e;
    }

    int t() {
        return this.f94826d;
    }
}
