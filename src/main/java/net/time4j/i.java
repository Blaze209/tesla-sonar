package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
final class i extends net.time4j.engine.e<g0> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final i f94615a = new i();
    private static final long serialVersionUID = -6519899440006935829L;

    private i() {
        super("CALENDAR_DATE");
    }

    private Object readResolve() {
        return f94615a;
    }

    @Override // net.time4j.engine.p
    public Class<g0> getType() {
        return g0.class;
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
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g0 s() {
        return g0.f94478e;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g0 t() {
        return g0.f94477d;
    }
}
