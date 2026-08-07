package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
final class q0 extends net.time4j.engine.e<h0> implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final q0 f94715a = new q0();
    private static final long serialVersionUID = -3712256393866098916L;

    private q0() {
        super("WALL_TIME");
    }

    private Object readResolve() {
        return f94715a;
    }

    @Override // net.time4j.engine.p
    public Class<h0> getType() {
        return h0.class;
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
    public h0 s() {
        return h0.J0(23, 59, 59, 999999999);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public h0 t() {
        return h0.f94522m;
    }
}
