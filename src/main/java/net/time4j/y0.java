package net.time4j;

/* JADX INFO: loaded from: classes9.dex */
final class y0 extends a<Integer> implements e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final y0 f94836d = new y0();
    private static final long serialVersionUID = -2378018589067147278L;

    private y0() {
        super("WEEKDAY_IN_MONTH");
    }

    private Object readResolve() {
        return f94836d;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'F';
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
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return 5;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return 1;
    }
}
