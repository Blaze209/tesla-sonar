package net.time4j.calendar;

/* JADX INFO: loaded from: classes9.dex */
final class m extends net.time4j.engine.e<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m f94067a = new m();
    private static final long serialVersionUID = -1117064522468823402L;

    private m() {
        super("RELATED_GREGORIAN_YEAR");
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'r';
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
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return 999999999;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return -999999999;
    }

    protected Object readResolve() {
        return f94067a;
    }
}
